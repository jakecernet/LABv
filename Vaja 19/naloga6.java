/* Javanski program Naloga6 implementira tabelo kot objektno lastnost. Glavna metoda danega programa v komentarjih opredeli delovanje programa. 
Pri tem strukture razreda Naloga6 ne spreminjamo, temveč uporabimo glavno metodo zgolj kot ovojnico za kreiranje objekta  s katerim oz. nad katerim bomo izvedli s 
predhodnim besedilom zahtevano. (zasledujemo filozofijo, da v OO svetu obstajajo zgolj objekti in sporočila, prvega je pač nekako potrebno narediti; 
in to naredimo z zagonskim razredom oz. njegovo zagonsko metodo):

class Naloga6{
    private Oseba[] tabOseb = new Oseba[20];
    
    public static void main(String[] args){
        // vse dovoljene spremembe so znotraj tega bloka kode 
        // naredi 20 oseb in jih vpiši v this.tabOseba
        // izpiši vseh 20 oseb iz tabele
    }
}
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

public class naloga6 {
    private Oseba[] tabOseb = new Oseba[20];
    
    public static void main(String[] args){
        naloga6 n = new naloga6();
        for (int i = 0; i < n.tabOseb.length; i++) {
            n.tabOseb[i] = new Oseba("Oseba" + i);
        }

        n.izpisiVseOsebe();
    }

    public void izpisiVseOsebe() {
        for (Oseba oseba : tabOseb) {
            System.out.println(oseba);
        }
    }
}