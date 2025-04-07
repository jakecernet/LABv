/*
 * 2.	Deklarirajte razred Ulomek, ki vsebuje zaščitene (private) lastnosti stevec in imenovalec (lastnosti naj bosta celi števili. Razred naj vsebuje 3 konstruktorje:
a.	konstruktor, ki nima parametrov – default vrednosti sta 1, 1;
b.	konstruktor z enim argumentom (vrednost stevca) in postavi imenovalec na 1.
c.	konstruktor, ki dobi dva parametra, s katerima nastavi vrednosti obeh lastnosti.

Razred vsebuje še naslednje objektne metode :
a.	metodo, ki preveri, ali je možno pokrajšati ulomek in to tudi naredi (če je možno seveda),
b.	metodo enakaUlomka, ki preveri, ali sta dva ulomka enaka in to tudi vrne;
c.	metodo, ki vrne niz znakov, ki predstavlja ulomek. Metoda naj bo prekrivanje(overrun) metode toString in naj vrne niz kot za primer: če je števec – 12 in imenovalec 5, naj vrne "-12 / 5";
d.	metodo, ki sešteje dva ulomka in vrne novo nastali ulomek.

Kot demonstracijo delovanja ustvarite tri ulomke (uporabite različne konstruktorje), preverite ali je katerikoli ulomek možno okrajšati (in ga v tem primeru tudi okrajšajte). Izpišite, koliko ulomkov je enakih in tudi, kateri ulomki so enaki. Na koncu seštejte vse tri ulomke in seštet ulomek tudi izpiši (toString).

Po potrebi lahko dodate še kakšno objektno metodo. PAZI! Preverjaj vrednost imenovalca!

Narišite tudi ustrezen razredni diagram.
*/

public class Ulomek {
    private int stevec;
    private int imenovalec;

    // Konstruktor brez parametrov
    public Ulomek() {
        this.stevec = 1;
        this.imenovalec = 1;
    }

    // Konstruktor z enim argumentom
    public Ulomek(int stevec) {
        this.stevec = stevec;
        this.imenovalec = 1;
    }

    // Konstruktor z dvema argumentoma
    public Ulomek(int stevec, int imenovalec) {
        if (imenovalec == 0) {
            throw new IllegalArgumentException("Imenovalec ne sme biti 0.");
        }
        this.stevec = stevec;
        this.imenovalec = imenovalec;
    }

    // Metoda za preverjanje in okrajšanje ulomka
    public void okrajšaj() {
        int gcd = gcd(stevec, imenovalec);
        if (gcd > 1) {
            stevec /= gcd;
            imenovalec /= gcd;
        }
    }

    // Metoda za izračun največjega skupnega delitelja (GCD)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    // Metoda za preverjanje enakosti ulomkov
    public boolean enakaUlomka(Ulomek drugi) {
        return this.stevec * drugi.imenovalec == this.imenovalec * drugi.stevec;
    }

    // Prekrivanje metode toString
    @Override
    public String toString() {
        return stevec + " / " + imenovalec;
    }

    // Metoda za seštevanje dveh ulomkov
    public Ulomek seštej(Ulomek drugi) {
        int novStevec = this.stevec * drugi.imenovalec + drugi.stevec * this.imenovalec;
        int novImenovalec = this.imenovalec * drugi.imenovalec;
        return new Ulomek(novStevec, novImenovalec);
    }

    // Getterji in setterji
    public int getStevec() {
        return stevec;
    }

    public void setStevec(int stevec) {
        this.stevec = stevec;
    }

    public int getImenovalec() {
        return imenovalec;
    }

    public void setImenovalec(int imenovalec) {
        if (imenovalec == 0) {
            throw new IllegalArgumentException("Imenovalec ne sme biti 0.");
        }
        this.imenovalec = imenovalec;
    }

    public static void main(String[] args) {
        // Ustvarimo tri ulomke
        Ulomek ulomek1 = new Ulomek(12, 5);
        Ulomek ulomek2 = new Ulomek(6, 10);
        Ulomek ulomek3 = new Ulomek(3, 5);

        // Preverimo in okrajšamo ulomke
        ulomek1.okrajšaj();
        ulomek2.okrajšaj();
        ulomek3.okrajšaj();

        // Preverimo enakost ulomkov
        int enakiUlomki = 0;
        if (ulomek1.enakaUlomka(ulomek2)) {
            enakiUlomki++;
            System.out.println("Ulomek1 in Ulomek2 sta enaka: " + ulomek1 + " = " + ulomek2);
        }
        if (ulomek1.enakaUlomka(ulomek3)) {
            enakiUlomki++;
            System.out.println("Ulomek1 in Ulomek3 sta enaka: " + ulomek1 + " = " + ulomek3);
        }
        if (ulomek2.enakaUlomka(ulomek3)) {
            enakiUlomki++;
            System.out.println("Ulomek2 in Ulomek3 sta enaka: " + ulomek2 + " = " + ulomek3);
        }

        System.out.println("Število enakih ulomkov: " + enakiUlomki);

        // Seštejemo vse tri ulomke
        Ulomek vsota = ulomek1.seštej(ulomek2).seštej(ulomek3);
        System.out.println("Vsota vseh treh ulomkov: " + vsota);
    }

}
