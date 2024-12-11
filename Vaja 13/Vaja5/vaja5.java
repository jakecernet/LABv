/*  
    (linearno oz. zaporedno iskanje) Spišite razredno metodo aliJeVTabeli/2 oz. static boolean
    aliJeVTabeli(int[] t, int iskana); . Metoda vrne vrednost true, če se vrednost argumenta iskana nahaja
    v tabeli, sicer vrne vrednost false; . Dodajte tudi metodo za enako iskanje po tabeli znakov. Metodi
    naj bosta del razreda iz Naloga 1.
*/

public class vaja5 {
    public static void main(String[] args) {
        int[] tab1 = new int[Integer.parseInt(args[0])];
        char[] tab2 = new char[Integer.parseInt(args[0])];
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = (int) (Math.random() * Integer.MAX_VALUE);
            tab2[i] = (char) (Math.random() * 150);
        }

        System.out.println(
                aliJeVTabeli(tab1, Integer.parseInt(args[1])) ? "nahaja se v tabeli" : "ne nahaja se v tabeli");
        System.out.println(aliJeVTabeli(tab2, args[2].charAt(0)) ? "nahaja se v tabeli" : "ne nahaja se v tabeli");
    }

    public static boolean aliJeVTabeli(int[] tabela, int iskana) {
        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] == iskana) {
                return true;
            }
        }
        return false;
    }

    public static boolean aliJeVTabeli(char[] tabela, char iskana) {
        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] == iskana) {
                return true;
            }
        }
        return false;
    }
}
