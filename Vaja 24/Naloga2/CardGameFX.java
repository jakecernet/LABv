import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Class Igra: model igre z enim kupčkom in dvema rokama po 5 kart
class Igra {
    private final List<Card> deck;
    private final List<Card> hand1;
    private final List<Card> hand2;
    private int deals = 0;

    public Igra(List<String> faces, String backUrl) {
        deck = new ArrayList<>();
        for (String fv : faces) {
            deck.add(new Card(fv, backUrl));
        }
        Collections.shuffle(deck);
        hand1 = new ArrayList<>();
        hand2 = new ArrayList<>();
    }

    public List<Card> getDeck() {
        return deck;
    }
    public List<Card> getHand1() {
        return hand1;
    }
    public List<Card> getHand2() {
        return hand2;
    }

    public boolean deal() {
        if (deals >= 5 || deck.size() < 10) {
            return false;
        }
        hand1.clear();
        hand2.clear();
        for (int i = 0; i < 5; i++) {
            hand1.add(deck.remove(0));
            hand2.add(deck.remove(0));
        }
        deals++;
        return true;
    }
}

// Card: predstavlja eno karto z licem in hrbtom
class Card extends ImageView {
    private final Image face;
    private final Image back;
    private boolean faceUp = false;
    private final String code;

    public Card(String code, String backUrl) {
        this.code = code;
        this.face = new Image("file:karte/" + code + ".png");
        this.back = new Image("file:karte/back.png");
        setImage(back);
        setFitHeight(120);
        setFitWidth(80);

        this.setOnMouseClicked(e -> {
            this.flip();
            System.out.println("Klik: " + this.getCode() + ", stanje: " + (this.isFaceUp() ? "lice" : "hrbet"));
        });
    }

    public void flip() {
        faceUp = !faceUp;
        setImage(faceUp ? face : back);
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public String getCode() {
        return code;
    }
}

public class CardGameFX extends Application {
    private Igra game;
    private TilePane deckBox;
    private HBox handBox1;
    private HBox handBox2;

    @Override
    public void start(Stage primaryStage) {
        String[] suits = {"H", "D", "C", "S"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        List<String> faces = new ArrayList<>();
        for (String s : suits) for (String r : ranks) faces.add(s + r);

        String backUrl = "file:karte/back.png";
        game = new Igra(faces, backUrl);

        deckBox = new TilePane();
        deckBox.setPadding(new Insets(10));
        deckBox.setHgap(5);
        deckBox.setVgap(5);
        deckBox.setPrefColumns(5);

        handBox1 = new HBox(); handBox1.setPadding(new Insets(10)); handBox1.setSpacing(5);
        handBox2 = new HBox(); handBox2.setPadding(new Insets(10)); handBox2.setSpacing(5);

        Button dealBtn = new Button("Deal");
        dealBtn.setOnAction(e -> onDeal());

        updateDeckView();

        VBox center = new VBox(10, deckBox, handBox1, handBox2, dealBtn);
        center.setPadding(new Insets(20));
        BorderPane root = new BorderPane(center);

        primaryStage.setScene(new Scene(root, 900, 600));
        primaryStage.setTitle("5-Card Deal Demo");
        primaryStage.show();
    }

    private void updateDeckView() {
        deckBox.getChildren().clear();
        List<Card> top10 = game.getDeck().subList(0, Math.min(10, game.getDeck().size()));
        for (Card c : top10) {
            if (c.isFaceUp()) c.flip();
            deckBox.getChildren().add(c);
        }
    }

    private void updateHandViews() {
        handBox1.getChildren().clear();
        handBox2.getChildren().clear();
        for (Card c : game.getHand1()) {
            if (c.isFaceUp()) c.flip();
            handBox1.getChildren().add(c);
        }
        for (Card c : game.getHand2()) {
            if (c.isFaceUp()) c.flip();
            handBox2.getChildren().add(c);
        }
    }

    private void onDeal() {
        boolean ok = game.deal();
        if (!ok) {
            System.out.println("No more full deals available after 5 deals. Exiting.");
            Platform.exit();
            return;
        }
        updateDeckView();
        updateHandViews();
        System.out.println("Dealt hand. Remaining deck: " + game.getDeck().size());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
