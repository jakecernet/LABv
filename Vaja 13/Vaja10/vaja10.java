/*  
    Spišite metode in jih dodajte v razred MojeMetodeZaTabele:
    • Vrne tabelo lihih elementov podane tabele (lihi so tisti, ki so številsko lihi ali znaki na lihih
    mestih v kodni tabeli znakov.
    • Vrne tabelo sodih elementov tabele.
    • Iz znakovne tabele vrne tabelo brez samoglasnikov.
*/

public class vaja10 {
    public static void main(String[] args) {
        int[] tab = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] rez = tabeloLihihElementov(tab);
        for (int i = 0; i < rez.length; i++) {
            System.out.print(rez[i] + " ");
        }
        System.out.println();

        rez = tabeloSodihElementov(tab);
        for (int i = 0; i < rez.length; i++) {
            System.out.print(rez[i] + " ");
        }
        System.out.println();

        char[] tab2 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' };
        char[] rez2 = tabeloBrezSamoglasnikov(tab2);
        for (int i = 0; i < rez2.length; i++) {
            System.out.print((char) rez2[i] + " ");
        }
    }

    public static int[] tabeloLihihElementov(int[] tab) {
        int[] rez = new int[tab.length];
        int i = 0;
        for (int j = 0; j < tab.length; j++) {
            if (tab[j] % 2 != 0) {
                rez[i] = tab[j];
                i++;
            }
        }
        return rez;
    }

    public static int[] tabeloSodihElementov(int[] tab) {
        int[] rez = new int[tab.length];
        int i = 0;
        for (int j = 0; j < tab.length; j++) {
            if (tab[j] % 2 == 0) {
                rez[i] = tab[j];
                i++;
            }
        }
        return rez;
    }

    public static char[] tabeloBrezSamoglasnikov(char[] tab) {
        char[] chars = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        char rez[] = new char[tab.length];
        int i = 0;
        for (int j = 0; j < tab.length; j++) {
            boolean samoglasnik = false;
            for (int k = 0; k < chars.length; k++) {
                if (tab[j] == chars[k]) {
                    samoglasnik = true;
                    break;
                }
            }
            if (!samoglasnik) {
                rez[i] = tab[j];
                i++;
            }
        }
        return rez;
    }
}
