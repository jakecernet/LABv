/*  
    Predelajte mehanizma metod iz Naloga5 v metodi kjeVTabeliJe/2, kjer pa ti nalogi vrneta poziciji
    iskanih elementov v tabeli. Metodi naj vrneta: -1 v primeru, da številskega elementa ni v tabeli, znak
    na poziciji 0 v kodni tabeli, v primeru iskanja znakovnega elementa.
*/

public class vaja7 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        for (int i = 0; i < 10; i++) {
            tab[i] = (int) (Math.random() * 100);
        }
        System.out.println("zanak se nahaja na poziciji " + kjeVTabeliJe1(tab, 50));
        System.out.println("zanak se nahaja na poziciji " + kjeVTabeliJe2(tab, 50));
    }

    public static int kjeVTabeliJe1(int[] tab, int x) {
        int i = 0;
        while (i < tab.length) {
            if (tab[i] == x) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int kjeVTabeliJe2(int[] tab, int x) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == x) {
                return i;
            }
        }
        return tab[0];
    }

}
