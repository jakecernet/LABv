/*  
    Metodi razreda iz Naloga 1 z imenom skrajsajTabeloNa/2, skrajša z argumentom podano tabelo na
    dolžino, podano z vrednostjo drugega argumenta in skrajšano vrne. Predpostavite, da v tabeli pri
    krajšanju zavržemo konec v tabelo zapisanega zaporedja (ohranimo prve elemente tabele, tiste na
    nižjih indeksih).
    Metodi zanemariPrviZadnji/1 vrneta tabelo brez prvega in zadnjega elementa z argumentom podane
    tabele.
*/

public class vaja8 {
    public static void main(String[] args) {
        int[] tab = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        printShorter(skrajsajTabeloNa(tab, 5));
        printZanemarjeno(zanemariPrviZadnji(tab));
    }

    public static int[] skrajsajTabeloNa(int[] tab, int n) {
        int[] rez = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            rez[i] = tab[i];
        }
        return rez;
    }

    public static int[] zanemariPrviZadnji(int[] tab) {
        int[] rez = new int[tab.length - 1];
        for (int i = 1; i < tab.length - 1; i++) {
            rez[i] = tab[i];
        }
        return rez;
    }

    public static void printShorter(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public static void printZanemarjeno(int[] tab) {
        for (int i = 1; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
}
