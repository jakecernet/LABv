/* 
    Spišite javanski program Naloga5, ki bo implementiral tabelo 20-tih oseb (kot v naloga 3). Programu dodajte metodo izpisiVseOsebe. 
    Ta bo vse osebe tabele 20-tih oseb (podane kot argument metodi ?) izpisala na zaslon s pomočjo metode toString/0, kot je definirana v 4.b) .
*/

class Oseba {
    String ime;
    String priimek;
    String spol;

    public Oseba(String ime) {
        this.ime = ime;
    }

    @Override
    public String toString() {
        return "oseba:< " + ime + "," + priimek + "," + spol + ">";
    }
}

public class naloga5 {
    public static void main(String[] args) {
        Oseba[] osebe = new Oseba[20];
        for (int i = 0; i < osebe.length; i++) {
            osebe[i] = new Oseba("Oseba" + i);
        }

        izpisiVseOsebe(osebe);
    }

    public static void izpisiVseOsebe(Oseba[] osebe) {
        for (Oseba oseba : osebe) {
            System.out.println(oseba);
        }
    }
}