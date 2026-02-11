
/**
 * Glavna metoda (driver method) razreda v štirih ločenih zaporedih fazah (1)
 * ustvari 150 objektov
 * vrste (tipa) ZeroTocka. Vsakega naj inicializira s pseudo-naključno
 * vrednostjo ravninske
 * koordinate iz obsega [0-200.0,0-200.0]. Nato naj izmed ustvarjenih poišče (2)
 * tisto točko, ki
 * je najbolj oddaljena od točke (0,0), izpiše (3) koordinate te točke ter njeno
 * oddaljenost od
 * točke (0,0). Nato najde točko vrste ZeroTocka, ki je najbližje povprečni
 * oddaljenosti vseh takih
 * točk od točke (0,0), izpiše oddaljenost povprečja, oddaljenost najdene točke
 * in njeno koordinato.
 * 
 * No ja, ustvarjalcu opisane zamisli se je nekje vmes ustavilo. Pomagajte mu
 * zamisel iz/s/peljati do konca.
 */

public class vaja3 {
    public static void main(String[] args) {
        // (1)
        ZeroTocka[] tocke = new ZeroTocka[150];
        for (int i = 0; i < tocke.length; i++) {
            tocke[i] = new ZeroTocka();
            tocke[i].x = Math.random() * 200.0;
            tocke[i].y = Math.random() * 200.0;
        }

        // (2)
        ZeroTocka najboljOddaljena = tocke[0];
        double maxOddaljenost = razdalja(tocke[0], new ZeroTocka(0, 0));
        for (ZeroTocka tocka : tocke) {
            double oddaljenost = razdalja(tocka, new ZeroTocka(0, 0));
            if (oddaljenost > maxOddaljenost) {
                maxOddaljenost = oddaljenost;
                najboljOddaljena = tocka;
            }
        }

        // (3)
        System.out.println("Najbolj oddaljena tocka: (" + najboljOddaljena.x + ", " + najboljOddaljena.y + ")");
        System.out.println("Oddaljenost: " + maxOddaljenost);

        // (4)
        double skupnaOddaljenost = 0;
        for (ZeroTocka tocka : tocke) {
            skupnaOddaljenost += razdalja(tocka, new ZeroTocka(0, 0));
        }
        double povprecnaOddaljenost = skupnaOddaljenost / tocke.length;

        ZeroTocka najblizjaPovprecju = tocke[0];
        double minRazlika = Math.abs(razdalja(tocke[0], new ZeroTocka(0, 0)) - povprecnaOddaljenost);
        for (ZeroTocka tocka : tocke) {
            double razlika = Math.abs(razdalja(tocka, new ZeroTocka(0, 0)) - povprecnaOddaljenost);
            if (razlika < minRazlika) {
                minRazlika = razlika;
                najblizjaPovprecju = tocka;
            }
        }

        System.out.println("Povprecna oddaljenost: " + povprecnaOddaljenost);
        System.out.println("Najblizja tocka povprecju: (" + najblizjaPovprecju.x + ", " + najblizjaPovprecju.y + ")");
        System.out.println("Oddaljenost najblizje tocke: " + razdalja(najblizjaPovprecju, new ZeroTocka(0, 0)));
    }

    public static double razdalja(ZeroTocka a, ZeroTocka b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}

class ZeroTocka {
    double x;
    double y;

    ZeroTocka() {
        this.x = 0;
        this.y = 0;
    }

    ZeroTocka(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
