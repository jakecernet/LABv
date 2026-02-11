/*
Zapišite definicijo razreda Racunalnik, ki  vsebuje naslednje lastnosti: vrsto CPE, velikost trdega diska, velikost pomnilnika ter cena.  Dodajte konstruktor z inicializacijo lasnosti in metode za vnos in vračanje njegovih lastnosti (setterje in getterje). 

Iz razreda Racunalnik izpeljite razred Prenosnik, z dodatnimi lastnostmi velikost zaslona ter trajanje(čas avtonomije) baterije. Razred Prenosnik naj vsebuje konstruktor, setterje in getterje ter metodo, ki vrne velikosti zaslona v cm (vrednost lastnosti velikost zaslona je zapisana v palcih). 

Zagonska metoda razreda Računalnik naj služi kot ovojnica za preskus definicij in delovanja:
V njej definirajte, skreirajte in inicializirajte dva prenosnika (objekta razreda Prenosnik), ter izvedite  demonstracijo rabo vseh metod.  Na koncu izpiši, kateri izmed obeh prenosnikov ima boljše razmerje med trajanjem baterije in ceno.

Po potrebi v definicijo razredov lahko dodate še kakšno metodo.
*/

public class naloga2 {
    public static class Racunalnik {
        private String vrstaCPE;
        private double velikostTrdegaDiska;
        private double velikostPomnilnika;
        private double cena;

        public Racunalnik(String vrstaCPE, double velikostTrdegaDiska, double velikostPomnilnika, double cena) {
            this.vrstaCPE = vrstaCPE;
            this.velikostTrdegaDiska = velikostTrdegaDiska;
            this.velikostPomnilnika = velikostPomnilnika;
            this.cena = cena;
        }

        public String getVrstaCPE() {
            return vrstaCPE;
        }

        public void setVrstaCPE(String vrstaCPE) {
            this.vrstaCPE = vrstaCPE;
        }

        public double getVelikostTrdegaDiska() {
            return velikostTrdegaDiska;
        }

        public void setVelikostTrdegaDiska(double velikostTrdegaDiska) {
            this.velikostTrdegaDiska = velikostTrdegaDiska;
        }

        public double getVelikostPomnilnika() {
            return velikostPomnilnika;
        }

        public void setVelikostPomnilnika(double velikostPomnilnika) {
            this.velikostPomnilnika = velikostPomnilnika;
        }

        public double getCena() {
            return cena;
        }

        public void setCena(double cena) {
            this.cena = cena;
        }
    }

    public static void main(String[] args) {

        Racunalnik prenosnik1 = new Racunalnik("Prenosnik", 512, 16, 800);
        Racunalnik prenosnik2 = new Racunalnik("Prenosnik", 256, 8, 600);

        System.out.println("Prenosnik 1: " + prenosnik1.getVrstaCPE() + ", Velikost trdega diska: " + prenosnik1.getVelikostTrdegaDiska() + "GB, Velikost pomnilnika: " + prenosnik1.getVelikostPomnilnika() + "GB, Cena: " + prenosnik1.getCena() + "€");
        System.out.println("Prenosnik 2: " + prenosnik2.getVrstaCPE() + ", Velikost trdega diska: " + prenosnik2.getVelikostTrdegaDiska() + "GB, Velikost pomnilnika: " + prenosnik2.getVelikostPomnilnika() + "GB, Cena: " + prenosnik2.getCena() + "€");

        double razmerje1 = (prenosnik1.getVelikostPomnilnika() / prenosnik1.getCena());
        double razmerje2 = (prenosnik2.getVelikostPomnilnika() / prenosnik2.getCena());

        if (razmerje1 > razmerje2) {
            System.out.println("Prenosnik 1 ima boljše razmerje med trajanjem baterije in ceno.");
        } else {
            System.out.println("Prenosnik 2 ima boljše razmerje med trajanjem baterije in ceno.");
        }

        if (prenosnik1.getVelikostTrdegaDiska() > prenosnik2.getVelikostTrdegaDiska()) {
            System.out.println("Prenosnik 1 ima večji trdi disk.");
        } else if (prenosnik1.getVelikostTrdegaDiska() < prenosnik2.getVelikostTrdegaDiska()) {
            System.out.println("Prenosnik 2 ima večji trdi disk.");
        } else {
            System.out.println("Oba prenosnika imata enako velikost trdega diska.");
        }

        if (prenosnik1.getVelikostPomnilnika() > prenosnik2.getVelikostPomnilnika()) {
            System.out.println("Prenosnik 1 ima večji pomnilnik.");
        } else if (prenosnik1.getVelikostPomnilnika() < prenosnik2.getVelikostPomnilnika()) {
            System.out.println("Prenosnik 2 ima večji pomnilnik.");
        } else {
            System.out.println("Oba prenosnika imata enako velikost pomnilnika.");
        }

        if (prenosnik1.getCena() > prenosnik2.getCena()) {
            System.out.println("Prenosnik 1 je dražji.");
        } else if (prenosnik1.getCena() < prenosnik2.getCena()) {
            System.out.println("Prenosnik 2 je dražji.");
        } else {
            System.out.println("Oba prenosnika imata enako ceno.");
        }

        if (prenosnik1.getVrstaCPE().equals(prenosnik2.getVrstaCPE())) {
            System.out.println("Oba prenosnika imata iste vrste CPE.");
        } else {
            System.out.println("Prenosnika imata različen CPE.");
        }
    }
}
