import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

class PlayingCard extends Button {
    private final Image faceImage;
    private final Image backImage;
    private boolean showingFace;
    private final String suitAndValue; // e.g. "H7"

    /**
     * Constructs a PlayingCard.
     * 
     * @param faceUrl      URL or path to the face image
     * @param backUrl      URL or path to the back image
     * @param suitAndValue string code of the card, e.g. "H7"
     */
    public PlayingCard(String faceUrl, String backUrl, String suitAndValue) {
        this.faceImage = new Image(faceUrl);
        this.backImage = new Image(backUrl);
        this.suitAndValue = suitAndValue;
        this.showingFace = true;
        setGraphic(new ImageView(faceImage));
        setOnAction(e -> swap());
    }

    /**
     * Swap face and back.
     */
    public void swap() {
        showingFace = !showingFace;
        ImageView iv = new ImageView(showingFace ? faceImage : backImage);
        setGraphic(iv);
        System.out.println("swap(): now showing " + (showingFace ? "face" : "back"));
        System.out.println("getValue(): " + getValue());
        System.out.println("getState(): " + getState());
    }

    /**
     * Returns the card code, e.g. H7.
     */
    public String getValue() {
        return suitAndValue;
    }

    /**
     * Returns "face" or "back" depending on state.
     */
    public String getState() {
        return showingFace ? "face" : "back";
    }
}

/**
 * Test JavaFX application to demonstrate PlayingCard.
 */
public class PlayingCardFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        String k1 = "E:/Github/LABv/Vaja 24/Naloga1/k1.jpg";
        String k2 = "E:/Github/LABv/Vaja 24/Naloga1/k2.jpg";
        String k3 = "E:/Github/LABv/Vaja 24/Naloga1/k3.jpg";
        String backUrl = "E:/Github/LABv/Vaja 24/Naloga1/zadi.jpg";

        PlayingCard card = new PlayingCard(backUrl, k1, "floyd");
        PlayingCard card2 = new PlayingCard(backUrl, k2, "floyd2");
        PlayingCard card3 = new PlayingCard(backUrl, k3, "jelinko");

        StackPane root = new StackPane(card, card2, card3);
        card.setTranslateX(-500);
        card2.setTranslateX(500);
        Scene scene = new Scene(root, 200, 300);

        primaryStage.setTitle("Playing Card Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
