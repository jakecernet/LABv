/* 
    Metoda podčrtaj/2 prejme kot argumenta znak, ki se uporabi za podčrtovanje, in število znakov
    (dolžino) podčrtovanja. 
    Napišite jo, v zagonsko metodo razreda pa dodajte njen klic.
*/

public class vaja4 {
    public static void main(String[] args) {
        System.out.println("Začetek:");
        podcrtaj(60, 'o'); // klic metode podcrtaj()
        izpišiRobove(); // klic metode izpišiRobove()
        podcrtaj(60, 'o'); // klic metode podcrtaj()
        System.out.println("konec");
    }

    public static void podcrtaj() {
        System.out.println(("" + '-').repeat(60));
    }

    public static void podcrtaj(char znak) {
        System.out.println((znak + "").repeat(60));
    }

    public static void podcrtaj(int koliko) {
        System.out.println(("" + '-').repeat(koliko));
    }

    public static void podcrtaj(int koliko, char znak) {
        System.out.println((znak + "").repeat(koliko));
    }

    public static void izpišiRobove() {
        int I = 10;
        while (I > 0) {
            System.out.printf("|%58c|\n", ' ');
            I--;
        }
    }
}
