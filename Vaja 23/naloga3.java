/*
Ustvariti bi želeli YesNo gumb za JavaFX aplikacijo. Objekt vrste YesNo pri postavitvi na sceno prikazuje napis Yes, klik na gumbu zamenja vsebino napisa na No, vsak naslednji ponovno zamenja Yes z No oz. No z Yes.

Obstoječi gumb vrste  javafx.scene.control. Button je funkcionalno poln gumb, le da ima zgolj eno fiksno lastnost 'text' za prikazovanje vrednosti na gumbu. 
Pripravimo test dostopa do lastnosti 'text' gumba ob kliku:
Uporabimo obstoječo JavaFX aplikacijo, ki jo lahko naredimo z čarovnikom v BlueJ. Poiščemo
servisno metodo, ki se izvede ob kliku na gumb in kot zadnjo vrstico dodamo:

Button bb = (Button)event.getSource(); bb.setText("trilili");

a)	spišite mehanizem preklapljanja med Yes in No. Gumb naj bo vrste Button.
b)	Na osnovi Button kreirajte  razred YesNo Button. Konstruktor za novi gumb prejme dve besedi (Yes, No) in pri klikanju naj 
preklaplja med njima (preklaplja med poljubnima podanima dvema besedama). Dodajte še oba 'fall back' konstruktorja; 
če gumb naredite zgolj z eno besedo, je druga vedno 'N-e', če ga ustvarite brez, pa je prva 'Da', druga 'Ne'.
*/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

// Custom YesNoButton class extending Button
class YesNoButton extends Button {
    private String text1;
    private String text2;

    // Constructor with two words
    public YesNoButton(String text1, String text2) {
        super(text1);
        this.text1 = text1;
        this.text2 = text2;
        this.setOnAction(event -> toggleText());
    }

    // Constructor with one word
    public YesNoButton(String text1) {
        this(text1, "N-e");
    }

    // Default constructor
    public YesNoButton() {
        this("Da", "Ne");
    }

    // Method to toggle text
    private void toggleText() {
        if (this.getText().equals(text1)) {
            this.setText(text2);
        } else {
            this.setText(text1);
        }
    }
}

public class naloga3 extends Application {
    @Override
    public void start(Stage stage) {
        // Create a YesNoButton
        YesNoButton yesNoButton = new YesNoButton("Yes", "No");

        // Create a new grid pane
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setMinSize(300, 300);
        pane.setVgap(10);
        pane.setHgap(10);

        // Add the YesNoButton to the pane
        pane.add(yesNoButton, 0, 0);

        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(pane, 300, 100);
        stage.setTitle("YesNo Button Example");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
