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

import java.util.Random;


public class naloga6 {
    class Oseba {
        private String ime;
        private String priimek;
        private String spol;
        private String razred;
        private int vpisnaStevilka;
        private static final String[] IMENA = {"Ana", "Bojan", "Cvetka", "Denis", "Eva"};
        private static final String[] PRIIMKI = {"Novak", "Kovač", "Horvat", "Zupan", "Mlakar"};
        private static final String[] SPOLI = {"m", "ž"};
        private static final String[] RAZREDI = {"g1a", "g2b", "g3a", "g4b"};
        
        public Oseba(String ime, String priimek, String spol, String razred, int vpisnaStevilka) {
            setIme(ime);
            setPriimek(priimek);
            setSpol(spol);
            setRazred(razred);
            this.vpisnaStevilka = vpisnaStevilka;
        }
        
        public Oseba() {
            Random rand = new Random();
            setIme(IMENA[rand.nextInt(IMENA.length)]);
            setPriimek(PRIIMKI[rand.nextInt(PRIIMKI.length)]);
            setSpol(SPOLI[rand.nextInt(SPOLI.length)]);
            setRazred(RAZREDI[rand.nextInt(RAZREDI.length)]);
            this.vpisnaStevilka = 10000 + rand.nextInt(90000);
        }
        
        public String getIme() {
            return ime;
        }
        
        public void setIme(String ime) {
            if (ime.length() < 3) {
                ime = ime + (new Random().nextInt(90) + 10);
            }
            this.ime = ime.substring(0, Math.min(ime.length(), 15));
        }
        
        public String getPriimek() {
            return priimek;
        }
        
        public void setPriimek(String priimek) {
            if (priimek.length() < 3) {
                priimek = priimek + (new Random().nextInt(90) + 10);
            }
            this.priimek = priimek.substring(0, Math.min(priimek.length(), 15));
        }
        
        public String getSpol() {
            return spol;
        }
        
        public void setSpol(String spol) {
            if (!spol.equals("m") && !spol.equals("ž")) {
                throw new IllegalArgumentException("Neveljaven spol.");
            }
            this.spol = spol;
        }
        
        public String getRazred() {
            return razred;
        }
        
        public void setRazred(String razred) {
            this.razred = razred;
        }
        
        public boolean siDekle() {
            return spol.equalsIgnoreCase("ž");
        }
        
        public String kakoTiJeIme() {
            return ime;
        }
        
        public boolean biŠlaNaZmenek() {
            return new Random().nextBoolean();
        }
        
        public boolean grevaNaSok() {
            return new Random().nextBoolean();
        }
        
        @Override
        public String toString() {
            return "oseba:< " + ime + ", " + priimek + ", " + spol + ", " + razred + ", " + vpisnaStevilka + ">";
        }
    }

    private Oseba[] tabOseb = new Oseba[20];
    
    public static void main(String[] args){
        naloga6 n = new naloga6();
        for (int i = 0; i < n.tabOseb.length; i++) {
            n.tabOseb[i] = n.new Oseba();
        }

        n.izpisiVseOsebe();
    }

    public void izpisiVseOsebe() {
        for (Oseba oseba : tabOseb) {
            System.out.println(oseba);
        }
    }
}