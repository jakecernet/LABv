/*  
    Naloga 6
    Med obe izpisni vrstici v razredu Vizualizacija00 vrinite naslednje zaporedje stavkov:

    try{
        Thread.sleep(2000);
    } catch(InterruptedException e){}

    Obrazložite, kaj se je med izvajanjem zgodilo. Povečajte še vrednost argumenta metode sleep na
    npr. 7000 in opazujte razliko.

    Program čaka 2 sekundi, nato pa izpiše kazalec na element tabele z indeksom 6.
    Če povečamo vrednost argumenta metode sleep na 7000, bo program čakal 7 sekund.
*/

public class vaja6 {
    static int dolzinaTabele = 12;

    public static void main(String[] args) {
        int[] tab = generirajTabelo(dolzinaTabele);
        izpisiPrvoVrsticoTabele(tab);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        izpisiKazelecElemTabele(tab, 6);
    }

    public static int[] generirajTabelo(int dolzina) {
        int[] tab = new int[dolzina];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 100000);
        }
        return tab;
    }

    public static void izpisiPrvoVrsticoTabele(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public static void izpisiKazelecElemTabele(int[] tab, int indeks) {
        System.out.println("Kazalec kaže na element: " + tab[indeks]);
    }
}
