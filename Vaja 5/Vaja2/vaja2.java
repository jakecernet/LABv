/* Javanski program opredeli podatek za poljubno neceloštevilsko vrednost z intervala -10 do 110 (izberite si jo
sami). Privzemite, da ta vrednost predstavlja temperaturo v stopinjah Celzija, ki pa bi jo želeli izraziti glede na
lestvice : Kelvin, Fahrenheit, Rømer, Delisle, Réaumur,Rankine, Newton. Preračun iz teh v stopinje Celzija se
izvede:
C = (F -32 ) * 9/5;
C = (K-273.15);
C = (R - 7.5) * 1.9047619; danska skala oz. Rømer
C = (150 - D) * 2/3; Delisle
C = (R - 491.67) / 1.79999999; Rankine
C = R * 1.25; Réaumur
C = N * 3.03030303; Newton - tudi ta je imel svojo : vre pa očitno pri 33 stopinjah N
Napišite program, program naj izpiše tudi vreliščne in lediščne vrednosti za vse omenjene lestvice */

public class vaja2 {
    public static void main(String[] args) {
        double C = 33;
        double F = (C * 9/5) + 32;
        double K = C + 273.15;
        double R = (C * 1.25);
        double D = 150 - (C * 2/3);
        double Re = (C * 1.25);
        double Ra = (C * 1.79999999) + 491.67;
        double N = C * 0.33030303;
        System.out.println("Vrednost v Celzijih: " + C);
        System.out.println("Vrednost v Fahrenheitih: " + F);
        System.out.println("Vrednost v Kelvinih: " + K);
        System.out.println("Vrednost v Rømerjih: " + R);
        System.out.println("Vrednost v Delislejih: " + D);
        System.out.println("Vrednost v Réaumurjih: " + Re);
        System.out.println("Vrednost v Rankinejih: " + Ra);
        System.out.println("Vrednost v Newtonih: " + N);
        System.out.println("Vrelišče v Celzijih: 100");
        System.out.println("Vrelišče v Fahrenheitih: 212");
        System.out.println("Vrelišče v Kelvinih: 373.15");
        System.out.println("Vrelišče v Rømerjih: 60");
        System.out.println("Vrelišče v Delislejih: 0");
        System.out.println("Vrelišče v Réaumurjih: 80");
        System.out.println("Vrelišče v Rankinejih: 671.67");
        System.out.println("Vrelišče v Newtonih: 33");
        System.out.println("Lednišče v Celzijih: 0");
        System.out.println("Lednišče v Fahrenheitih: 32");
        System.out.println("Lednišče v Kelvinih: 273.15");
        System.out.println("Lednišče v Rømerjih: 7.5");
        System.out.println("Lednišče v Delislejih: 150");
        System.out.println("Lednišče v Réaumurjih: 0");
        System.out.println("Lednišče v Rankinejih: 491.67");
    }
}
