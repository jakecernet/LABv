import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.*;

// Interface for shuffling cards
interface Mesalna {
    void premesajKarte();
}

// Class representing a card
class Karta extends ImageView {
    private final String code; // Card code (e.g., "H10" for 10 of Hearts)
    private final Image face; // Image of the card's face
    private final Image back; // Image of the card's back
    private boolean faceUp = false; // Whether the card is face up

    public Karta(String code) {
        this.code = code;
        this.face = new Image("file:karte/" + code + ".png");
        this.back = new Image("file:karte/back.png");
        setImage(back); // Initially show the back of the card
        setFitHeight(150); // Set card height
        setFitWidth(100); // Set card width
    }

    // Flip the card (toggle between face and back)
    public void flip() {
        faceUp = !faceUp;
        setImage(faceUp ? face : back);
    }

    // Show the face of the card
    public void showFace() {
        faceUp = true;
        setImage(face);
    }

    // Show the back of the card
    public void showBack() {
        faceUp = false;
        setImage(back);
    }

    // Get the card code
    public String getCode() {
        return code;
    }

    // Get the rank value of the card (e.g., 2 for "2", 14 for "A")
    public int getRankValue() {
        String rank = code.substring(1);
        return switch (rank) {
            case "2" -> 2;
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            case "6" -> 6;
            case "7" -> 7;
            case "8" -> 8;
            case "9" -> 9;
            case "10" -> 10;
            case "J" -> 11;
            case "Q" -> 12;
            case "K" -> 13;
            case "A" -> 14;
            default -> 0;
        };
    }

    // Get the suit value of the card (e.g., 4 for Hearts, 1 for Clubs)
    public int getSuitValue() {
        char suit = code.charAt(0);
        return switch (suit) {
            case 'H' -> 4;
            case 'D' -> 3;
            case 'S' -> 2;
            case 'C' -> 1;
            default -> 0;
        };
    }

    // Check if the card is face up
    public boolean isFaceUp() {
        return faceUp;
    }
}

// Main class for the Duel Game
public class DuelGameFX extends Application implements Mesalna {
    private Deque<Karta> deck; // Deck of cards
    private Deque<Karta> hand1; // Player 1's hand
    private Deque<Karta> hand2; // Player 2's hand
    private List<Karta> vzetki1 = new ArrayList<>(); // Player 1's collected cards
    private List<Karta> vzetki2 = new ArrayList<>(); // Player 2's collected cards

    private Karta trenutna1, trenutna2; // Current cards in play
    private boolean karta1Razkrita = false; // Whether Player 1's card is revealed
    private boolean karta2Razkrita = false; // Whether Player 2's card is revealed

    private final HBox igralec1Box = new HBox(10); // Box for Player 1's card
    private final HBox igralec2Box = new HBox(10); // Box for Player 2's card
    private final Label rezultatLabel = new Label(); // Label to display results
    private final Button naslednjaRunda = new Button("Naslednja runda"); // Button for the next round

    @Override
    public void start(Stage primaryStage) {
        Button novaIgra = new Button("Nova igra"); // Button to start a new game

        novaIgra.setOnAction(e -> novaIgra()); // Set action for new game button
        naslednjaRunda.setOnAction(e -> naslednjaRunda()); // Set action for next round button
        naslednjaRunda.setVisible(false); // Hide next round button initially

        igralec1Box.setAlignment(Pos.CENTER); // Center Player 1's card
        igralec2Box.setAlignment(Pos.CENTER); // Center Player 2's card
        HBox center = new HBox(20, igralec1Box, igralec2Box); // Center area for cards
        VBox mainCenter = new VBox(20, center, rezultatLabel); // Main center layout
        mainCenter.setAlignment(Pos.CENTER);

        HBox gumbi = new HBox(20, novaIgra, naslednjaRunda); // Buttons at the bottom
        gumbi.setAlignment(Pos.CENTER);

        BorderPane root = new BorderPane(); // Main layout
        root.setCenter(center);
        root.setBottom(gumbi);

        Scene scene = new Scene(root, 600, 450); // Create the scene
        primaryStage.setScene(scene);
        primaryStage.setTitle("Vojna - Duel"); // Set the title
        primaryStage.show();

        novaIgra(); // Start a new game
    }

    // Start a new game
    private void novaIgra() {
        List<Karta> noveKarte = new ArrayList<>();
        String[] suits = { "C", "D", "H", "S" }; // Card suits
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" }; // Card ranks

        // Create a deck of cards
        for (String s : suits)
            for (String r : ranks)
                noveKarte.add(new Karta(s + r));
        Collections.shuffle(noveKarte); // Shuffle the deck

        deck = new ArrayDeque<>(noveKarte); // Initialize the deck
        hand1 = new ArrayDeque<>(); // Initialize Player 1's hand
        hand2 = new ArrayDeque<>(); // Initialize Player 2's hand
        vzetki1.clear(); // Clear Player 1's collected cards
        vzetki2.clear(); // Clear Player 2's collected cards

        // Distribute cards to players
        while (!deck.isEmpty()) {
            hand1.add(deck.poll());
            if (!deck.isEmpty())
                hand2.add(deck.poll());
        }

        karta1Razkrita = false; // Reset Player 1's card reveal status
        karta2Razkrita = false; // Reset Player 2's card reveal status
        igralec1Box.getChildren().clear(); // Clear Player 1's card box
        igralec2Box.getChildren().clear(); // Clear Player 2's card box
        rezultatLabel.setText(""); // Clear result label
        naslednjaRunda.setVisible(false); // Hide next round button

        // Set up the first round
        if (!hand1.isEmpty() && !hand2.isEmpty()) {
            trenutna1 = hand1.poll(); // Draw Player 1's card
            trenutna2 = hand2.poll(); // Draw Player 2's card

            trenutna1.showBack(); // Show the back of Player 1's card
            trenutna2.showBack(); // Show the back of Player 2's card

            trenutna1.setOnMouseClicked(e -> razkrijKarto1()); // Set click action for Player 1's card
            trenutna2.setOnMouseClicked(e -> razkrijKarto2()); // Set click action for Player 2's card

            igralec1Box.getChildren().setAll(trenutna1); // Add Player 1's card to the box
            igralec2Box.getChildren().setAll(trenutna2); // Add Player 2's card to the box
        }
    }

    // Reveal Player 1's card
    private void razkrijKarto1() {
        if (!karta1Razkrita) {
            trenutna1.showFace(); // Show the face of Player 1's card
            karta1Razkrita = true; // Mark Player 1's card as revealed
            preveriZmagovalca(); // Check the winner
        }
    }

    // Reveal Player 2's card
    private void razkrijKarto2() {
        if (!karta2Razkrita) {
            trenutna2.showFace(); // Show the face of Player 2's card
            karta2Razkrita = true; // Mark Player 2's card as revealed
            preveriZmagovalca(); // Check the winner
        }
    }

    // Check the winner of the current round
    private void preveriZmagovalca() {
        if (karta1Razkrita && karta2Razkrita) {
            int rez = primerjaj(trenutna1, trenutna2); // Compare the cards
            if (rez > 0) {
                vzetki1.add(trenutna1); // Player 1 collects the cards
                vzetki1.add(trenutna2);
                rezultatLabel.setText("Igralec 1 pobere vzetek."); // Display result
            } else {
                vzetki2.add(trenutna1); // Player 2 collects the cards
                vzetki2.add(trenutna2);
                rezultatLabel.setText("Igralec 2 pobere vzetek."); // Display result
            }

            naslednjaRunda.setVisible(true); // Show next round button
        }
    }

    // Start the next round
    private void naslednjaRunda() {
        karta1Razkrita = false; // Reset Player 1's card reveal status
        karta2Razkrita = false; // Reset Player 2's card reveal status
        naslednjaRunda.setVisible(false); // Hide next round button

        // Check if there are more cards to play
        if (!hand1.isEmpty() && !hand2.isEmpty()) {
            trenutna1 = hand1.poll(); // Draw Player 1's card
            trenutna2 = hand2.poll(); // Draw Player 2's card

            trenutna1.showBack(); // Show the back of Player 1's card
            trenutna2.showBack(); // Show the back of Player 2's card

            trenutna1.setOnMouseClicked(e -> razkrijKarto1()); // Set click action for Player 1's card
            trenutna2.setOnMouseClicked(e -> razkrijKarto2()); // Set click action for Player 2's card

            igralec1Box.getChildren().setAll(trenutna1); // Add Player 1's card to the box
            igralec2Box.getChildren().setAll(trenutna2); // Add Player 2's card to the box
        } else {
            // Determine the winner
            String winner = (vzetki1.size() > vzetki2.size()) ? "Igralec 1 je zmagal!" : "Igralec 2 je zmagal!";
            rezultatLabel.setText("Konec igre. " + winner); // Display the winner
        }
    }

    // Compare two cards
    private int primerjaj(Karta k1, Karta k2) {
        int r1 = k1.getRankValue(), r2 = k2.getRankValue();
        if (r1 != r2)
            return Integer.compare(r1, r2); // Compare by rank
        return Integer.compare(k1.getSuitValue(), k2.getSuitValue()); // Compare by suit if ranks are equal
    }

    @Override
    public void premesajKarte() {
        Collections.shuffle((List<?>) deck); // Shuffle the deck
    }

    public static void main(String[] args) {
        launch(args); // Launch the application
    }
}
