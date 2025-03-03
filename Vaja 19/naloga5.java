/* 
    Spišite javanski program Naloga5, ki bo implementiral tabelo 20-tih oseb (kot v naloga 3). Programu dodajte metodo izpisiVseOsebe. 
    Ta bo vse osebe tabele 20-tih oseb (podane kot argument metodi ?) izpisala na zaslon s pomočjo metode toString/0, kot je definirana v 4.b) .
*/
import java.util.Random;

public class naloga5 {
    public static class Oseba {
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

    public static void main(String[] args) {
        Oseba[] osebe = new Oseba[20];
        for (int i = 0; i < osebe.length; i++) {
            osebe[i] = new Oseba();
        }

        izpisiVseOsebe(osebe);
    }

    public static void izpisiVseOsebe(Oseba[] osebe) {
        for (Oseba oseba : osebe) {
            System.out.println(oseba);
        }
    }
}