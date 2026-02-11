/*  
    Z zaporednimi klici izpisovalnih metod iz glavne metode razreda Vizualizacija00 je mogoče izvesti
    vizualizacijo postopka zaporednega iskanja, korak po korak. Izvedite jo. Pri tem podajte primer za
    iskanja za obstoječo vrednost in za neobstoječo vrednost. Naj bo zakasnitev med posameznimi
    koraki izvajanja vsaj 1.5s
*/

public class vaja7 {
    static int dolzinaTabele = 12;

    public static void main(String[] args) {
        int[] tabela = generirajTabelo(dolzinaTabele);
        int iskanaVrednost = tabela[5];
        int neobstojecaVrednost = 999999;

        izpisiPrvoVrsticoTabele(tabela);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] == iskanaVrednost) {
                izpisiKazelecElemTabele(tabela, i);
                break;
            }
            izpisiKazelecElemTabele(tabela, i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        izpisiPrvoVrsticoTabele(tabela);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] == neobstojecaVrednost) {
                izpisiKazelecElemTabele(tabela, i);
                break;
            }
            izpisiKazelecElemTabele(tabela, i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
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
