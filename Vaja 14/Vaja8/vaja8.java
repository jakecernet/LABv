/*  
    Na podoben način, kot je izvedena animacija vizualizacije postopka v nalogi 4, izvedite tudi za
    binarno iskanje. Za to:
    − Dodajte metodo generirajUrejenoTabelo/1
    − Dodajte kot prvi klic izpisnih metod še klic metode
    izpisiPredPrvoVrsticoTabele(tab,spod,zgor); , ki bo izrisal meje iskalnega
    zaporedja v postopku binarnega iskanja v vrstici nad vsebino elementov tabele. Npr.:
    0 2 15 55 88 89 432 444 12321 56781
    Razmislite tudi o spremembi znaka, ko sta obe meji postavljeni na isti element tabele.
*/

public class vaja8 {
    public static void main(String[] args) {
        int[] tab = generirajUrejenoTabelo(10);
        int spod = 0;
        int zgor = tab.length - 1;
        izpisiPredPrvoVrsticoTabele(tab, spod, zgor);
        int kljuc = 12321;
        int pozicija = binarnoIskanje(tab, kljuc, spod, zgor);
        System.out.println("Element " + kljuc + " je na poziciji " + pozicija);

    }

    public static int[] generirajUrejenoTabelo(int n) {
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = (int) (Math.random() * 100);
        }
        java.util.Arrays.sort(tab);
        return tab;
    }

    public static void izpisiPredPrvoVrsticoTabele(int[] tab, int spod, int zgor) {
        for (int i = 0; i < tab.length; i++) {
            if (i == spod) {
                System.out.print("spod ");
            } else if (i == zgor) {
                System.out.print("zgor ");
            } else {
                System.out.print("     ");
            }
        }
        System.out.println();
    }

    public static int binarnoIskanje(int[] tab, int kljuc, int spod, int zgor) {
        while (spod <= zgor) {
            int sredina = (spod + zgor) / 2;
            if (tab[sredina] == kljuc) {
                return sredina;
            } else if (tab[sredina] < kljuc) {
                spod = sredina + 1;
            } else {
                zgor = sredina - 1;
            }
        }
        return -1;
    }
}
