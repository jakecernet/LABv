/*  
    V podjetju imamo 100 zaposlenih delavcev. Podatki o plačah so shranjeni v tabeli 'place'. Identiteta(ID)
    oz. šifra zaposlenega je predstavljena z indeksom v tabeli. V tabelo place vpišite naključne vrednosti iz
    intervala [500..15000].
        a) Programsko izpišite ugotovitev, ali je bila izplačana najvišja plača (15000).
        b) Spišite metodo, ki izračuna in vrne vsoto vseh plač ('maso' plač). Vrnjeno izpišite.
        c) Razredna metoda izpisite_IDje(tabela_plac) naj izpiše plače vseh zaposlenih, ki imajo plačo 680.
*/

public class vaja2 {
    public static void main(String[] args) {
        int[] place = new int[100];
        for (int i = 0; i < place.length; i++) {
            place[i] = (int) (Math.random() * 14501 + 500);
        }
        for (int i = 0; i < place.length; i++) {
            System.out.println("ID: " + i + " Plača: " + place[i]);
        }
        System.out.println();
        System.out.println("Najvišja plača je bila izplačana: " + najvisjaPlaca(place));
        System.out.println();
        System.out.println("Masa plač: " + masaPlac(place));
        System.out.println();
        izpis_IDje(place);
    }

    public static boolean najvisjaPlaca(int[] place) {
        for (int i = 0; i < place.length; i++) {
            if (place[i] == 15000) {
                return true;
            }
        }
        return false;
    }

    public static int masaPlac(int[] place) {
        int masa = 0;
        for (int i = 0; i < place.length; i++) {
            masa += place[i];
        }
        return masa;
    }

    public static void izpis_IDje(int[] place) {
        boolean izpis = false;
        for (int i = 0; i < place.length; i++) {
            if (place[i] == 680) {
                System.out.println("ID: " + i + " Plača: " + place[i]);
                izpis = true;
            }
        }

        if (!izpis) {
            System.out.println("Noben zaposleni nima plače 680.");
        }
    }
}
