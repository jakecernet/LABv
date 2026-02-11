/* 
    V zagonski(driver) metodi razreda MojeMetodeZaTabele obstaja delaracija tabele z inicializacijo elementov:
    int[] ti = {12,3,5,9,-2,4};
    Spišite razredni metodi vrniPrvega/1 in vrniZadnjega/1, ki bosta kot argument prejeli tabelo, kot je
    podana in: prva naj vrne vrednost prvega elementa tabele, druga vrednost zadnjega elementa tabele.
    Za vsak slučaj: vrniPrvega/1 interpretirate kot (verjetno static) int vrniPrvega(int[] tab) ….
*/

public class vaja1 {
    public static void main(String[] args) {
        int[] ti = { 12, 3, 5, 9, -2, 4 };
        System.out.println("prvi element: " + vrniPrvega(ti));
        System.out.println("zadnji element: " + vrniZadnjega(ti));
    }

    public static int vrniPrvega(int[] tab) {
        return tab[0];
    }

    public static int vrniZadnjega(int[] tab) {
        return tab[tab.length - 1];
    }
}