/*  
    Dan javanski program izvaja sekvenco aktivnosti, kot je prikazano na diagramu:
    Dopolnite dano kodo z realizacijo ne-implementiranih metod.
    Pri tem predpostavite:
    − tabela lahko vsebuje zgolj do 5 mestna psevdo-naključna pozitivna števila z vključeno vrednostjo 0;
    − izpis prve vrstice tabele izpiše števila v eni sami vrstici, pri tem se med posameznimi števili izpiše en sam presledek
    − izpis kazalca se izvrši pod izpisom tabele na sredini pod število, na katerega kaže. Npr. kaže na element z zaporedno številko (indeksom) 6, 
      kot je dano s primerom delne realizacije programa, danega v nadaljevanju:
*/

public class vaja5 {
    static int dolzinaTabele = 12;

    public static void main(String[] args) {
        int[] tab = generirajTabelo(dolzinaTabele);
        izpisiPrvoVrsticoTabele(tab);
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
