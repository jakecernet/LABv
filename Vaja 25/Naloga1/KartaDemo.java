import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

interface Obracalna {
      public void obrni();              // zamenja lice s hrbtom in obratno
      public int vrniVrednostKarte();   // vrne vrednost karte: 2,3,4, …., 9,10,11,12,13,14 ne glede na barvo
      public char vrniBarvoKarte();     // vrne eno od H,D,S,C
      public boolean jeLice();          // vrne stanje obrnjenosti karte
}

class Karta extends Button implements Obracalna {
    private final Image face;
    private final Image back;
    private boolean faceUp = false;

    @Override
    public void obrni() {
        faceUp = !faceUp;
        setGraphic(new ImageView(faceUp ? face : back));
    }
    @Override
    public int vrniVrednostKarte() {
        String fileName = face.getUrl();
        String value = fileName.substring(fileName.lastIndexOf('/') + 1, fileName.lastIndexOf('.'));
        return Integer.parseInt(value);
    }
    @Override
    public char vrniBarvoKarte() {
        String fileName = face.getUrl();
        return fileName.charAt(fileName.lastIndexOf('/') + 1);
    }
    @Override
    public boolean jeLice() {
        return faceUp;
    }

    public Karta(String facePath, String backPath) {
        this.face = new Image(getClass().getResourceAsStream(facePath));
        this.back = new Image(getClass().getResourceAsStream(backPath));

        setGraphic(new ImageView(back));
        setStyle("-fx-background-color: transparent;");

        this.setOnAction(e -> flip());
    }

    public void flip() {
        faceUp = !faceUp;
        setGraphic(new ImageView(faceUp ? face : back));
    }
}

public class KartaDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        Karta karta = new Karta("/karte/H7.png", "/karte/back.png");

        StackPane root = new StackPane(karta);
        Scene scene = new Scene(root, 600, 600);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Ena karta demo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
