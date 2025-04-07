/*
Dobili smo naročilo za razred, s katerim bi lahko sledili drevesnim vrstam v gozdu. Seveda bi želeli imeti tudi njegovo realizacijo oz. razred, ki bo demonstriral delovanje. 

Torej, razred Drevo naj bi vseboval podatke o vrsti drevesa (bor, smreka,…), letnici (kdaj je vsajeno), obsegu in višini drevesa. Vse lastnosti naj bodo zaščitene (privatne, private). 
Razred naj vsebuje tudi ustrezni(e) konstruktor(je) in:
a.	 metodo, ki izračuna in vrne, kako hitro raste posamezno drevo (povprečni letni prirast v cm);
b.	metodo, ki preveri, ali dve drevesi iste drevesne vrste rasteta enako hitro oz. imata enako povprečni letni prirast.

•	Dodajte razredno metodo, ki bo omogočila računanje največje razlike v obsegu debla med enako starimi drevesi iste drevesne vrste 
•	Dodajte tudi razredno metodo, ki bo omogočila računanje največje razlike s smislu »Kakšna je maksimalna razlika v obsegu debla med enako starimi drevesi različnih drevesnih vrst«.
	
Po potrebi lahko dodate še kakšno objektno metodo.

•	Ustvarite 4 objekte razreda Drevo – podatke podaj v konstruktorju, kot argument(e) konstruktorja in s pomočjo nastavljalcev(setterjev). Izpišite povprečno rast posameznega drevesa (objekta). 
•	Preverite, koliko zasajenih smrek raste enako hitro kot prva smreka in to izpiši. 
•	Izračunajte in izpiši največjo razliko v obsegu debla med drevesi iste vrste in različnih vrst.

•	Narišite ustrezen razredni diagram.
*/

public class Drevo {
    private String vrsta;
    private int letnica;
    private double obseg;
    private double visina;

    public Drevo(String vrsta, int letnica, double obseg, double visina) {
        this.vrsta = vrsta;
        this.letnica = letnica;
        this.obseg = obseg;
        this.visina = visina;
    }

    public String getVrsta() {
        return vrsta;
    }

    public int getLetnica() {
        return letnica;
    }

    public double getObseg() {
        return obseg;
    }

    public double getVisina() {
        return visina;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public void setLetnica(int letnica) {
        this.letnica = letnica;
    }

    public void setObseg(double obseg) {
        this.obseg = obseg;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    // Izračuna povprečno letno rast drevesa v cm
    public double izracunajPovprecnoRast() {
        int trenutnaLeta = 2025; // Trenutno leto, lahko bi bilo dinamično
        return (visina / (trenutnaLeta - letnica));
    }

    // Preveri, ali dve drevesi rasteta enako hitro
    public boolean enakaPovprecnaRast(Drevo drugoDrevo) {
        return Double.compare(this.izracunajPovprecnoRast(), drugoDrevo.izracunajPovprecnoRast()) == 0;
    }

    // Izračuna največjo razliko v obsegu debla med enako starimi drevesi iste vrste
    public static double maxRazlikaObseg(Drevo[] drevesa) {
        double maxRazlika = 0;
        for (int i = 0; i < drevesa.length; i++) {
            for (int j = i + 1; j < drevesa.length; j++) {
                if (drevesa[i].getVrsta().equals(drevesa[j].getVrsta())
                        && drevesa[i].getLetnica() == drevesa[j].getLetnica()) {
                    double razlika = Math.abs(drevesa[i].getObseg() - drevesa[j].getObseg());
                    if (razlika > maxRazlika) {
                        maxRazlika = razlika;
                    }
                }
            }
        }
        return maxRazlika;
    }

    // Izračuna največjo razliko v obsegu debla med enako starimi drevesi različnih
    // vrst
    public static double maxRazlikaObsegRazlicneVrste(Drevo[] drevesa) {
        double maxRazlika = 0;
        for (int i = 0; i < drevesa.length; i++) {
            for (int j = i + 1; j < drevesa.length; j++) {
                if (!drevesa[i].getVrsta().equals(drevesa[j].getVrsta())
                        && drevesa[i].getLetnica() == drevesa[j].getLetnica()) {
                    double razlika = Math.abs(drevesa[i].getObseg() - drevesa[j].getObseg());
                    if (razlika > maxRazlika) {
                        maxRazlika = razlika;
                    }
                }
            }
        }
        return maxRazlika;
    }

    public static void main(String[] args) {
        // Ustvarjanje objektov razreda Drevo
        Drevo drevo1 = new Drevo("Smreka", 2010, 30.5, 15.0);
        Drevo drevo2 = new Drevo("Smreka", 2012, 28.0, 12.0);
        Drevo drevo3 = new Drevo("Bor", 2011, 35.0, 18.0);
        Drevo drevo4 = new Drevo("Jelka", 2013, 25.0, 10.0);

        // Izpis povprečne rasti posameznega drevesa
        System.out.println("Povprečna rast drevesa 1: " + drevo1.izracunajPovprecnoRast() + " cm/leto");
        System.out.println("Povprečna rast drevesa 2: " + drevo2.izracunajPovprecnoRast() + " cm/leto");
        System.out.println("Povprečna rast drevesa 3: " + drevo3.izracunajPovprecnoRast() + " cm/leto");
        System.out.println("Povprečna rast drevesa 4: " + drevo4.izracunajPovprecnoRast() + " cm/leto");

        // Preverjanje števila smrek, ki rastejo enako hitro kot prva smreka
        int enakoHitriSmreke = 0;
        if (drevo1.getVrsta().equals("Smreka")) {
            if (drevo1.enakaPovprecnaRast(drevo2) && drevo2.getVrsta().equals("Smreka"))
                enakoHitriSmreke++;
            if (drevo1.enakaPovprecnaRast(drevo3) && drevo3.getVrsta().equals("Smreka"))
                enakoHitriSmreke++;
            if (drevo1.enakaPovprecnaRast(drevo4) && drevo4.getVrsta().equals("Smreka"))
                enakoHitriSmreke++;
        }
        System.out.println("Število smrek, ki rastejo enako hitro kot prva smreka: " + enakoHitriSmreke);

        // Izračun največjih razlik v obsegu debla
        Drevo[] drevesa = { drevo1, drevo2, drevo3, drevo4 };
        System.out.println("Največja razlika v obsegu debla med enako starimi drevesi iste vrste: " +
                maxRazlikaObseg(drevesa));
        System.out.println("Največja razlika v obsegu debla med enako starimi drevesi različnih vrst: " +
                maxRazlikaObsegRazlicneVrste(drevesa));
    }
}
