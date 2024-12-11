/*  
    Spišite metode in jih dodajte v razred MojeMetodeZaTabele:
    • Vrne tabelo lihih elementov podane tabele (lihi so tisti, ki so številsko lihi ali znaki na lihih
    mestih v kodni tabeli znakov.
    • Vrne tabelo sodih elementov tabele.
    • Iz znakovne tabele vrne tabelo brez samoglasnikov.
*/

public class vaja10 {
    public static void main(String[] args) {
        
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

    public static int[] tabeloBrezSamoglasnikov(int[] tab) {
        char[] chars = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int[] rez = new int[tab.length];
        int i = 0;
        for (int j = 0; j < tab.length; j++) {
            if (Arrays.binarySearch(chars, tab[j]) < 0) {
                rez[i] = tab[j];
                i++;
            }
        }
        return rez;
    }
}
