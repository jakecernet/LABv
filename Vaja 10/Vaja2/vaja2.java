/* 
    V razred iz naloge 1 dopišite metodo podčrtaj/1 kot
    public static void podčrtaj(char znak) { }

    a) ugotovi, ali lahko obe metodi (podčrtaj/0 in podčrtaj/1) sočasno obstajata v
       programu (se program prevede brez napak),

    b) dopiši telo metode podčrtaj/1 tako, da se bo pri podčrtovanju izpisoval znak, ki ga podaš
       pri klicu metode, npr. če metodo kličeš s podčrtaj('o'); se bo na zaslon izpisalo 60
       znakov o.
*/

public class vaja2 {
    public static void main(String[] args) {
        System.out.println("Začetek:");
        podcrtaj('o'); // klic metode podcrtaj()
        podcrtaj(); // klic metode podcrtaj()
        izpišiRobove(); // klic metode izpišiRobove()
        podcrtaj(); // klic metode podcrtaj()
        podcrtaj('o'); // klic metode podcrtaj()
        System.out.println("konec");
    }

    public static void podcrtaj() {
        System.out.println(("" + '-').repeat(60));
    }

    public static void podcrtaj(char znak) {
        System.out.println((znak + "").repeat(60));
    }

    public static void izpišiRobove() {
        int I = 10;
        while (I > 0) {
            System.out.printf("|%58c|\n", ' ');
            I--;
        }
    }
}
