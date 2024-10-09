/* Z javansko kodo izvedite dejavnosti, podane z diagramom na levi strani. Zajemanje
koordinat izvedite kot preprosto prirejanje (testnih) vrednosti, pri tem se omejite na
velikost ravnine, v kateri pravokotnik nastopa na 30x30.
V drugi, popravljeni različici, popravite implementacijo tako, da se bosta točki naključno
ustvarili v dani ravnini in da bo program poleg ploščine izračunal in izpisal tudi obseg
pravokotnika. */

public class vaja6 {
    public static void main(String[] args) {
        int x1 = 5;
        int y1 = 5;
        int x2 = 15;
        int y2 = 15;

        int len1 = Math.abs(x2 - x1);
        int len2 = Math.abs(y2 - y1);

        int ploscina = len1 * len2;
        System.out.println("točka 1: (" + x1 + ", " + y1 + ")");
        System.out.println("točka 2: (" + x2 + ", " + y2 + ")");
        System.out.println("Ploščina pravokotnika: " + ploscina);
    }
}
