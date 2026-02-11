/* 
    a) identificiraj metode (podprograme, procedure, funkcije, ...) oz. naštej in zapiši metode,
       opredeljene znotraj danega programa,

       Metode: podcrtaj(), izpišiRobove()

    b) preimenuj elemente danega programa v skladu s konvencijami o poimenovanju elementov
       javanskih programov, zapiši ustrezno popravljeni razred,

    c) identificiraj in označi klice vseh javanskih metod danega programa,

    d) ugotovi, katera izmed metod se kliče največkrat.

       metoda podcrtaj() se kliče 2x
*/

public class vaja1 {
    public static void main(String[] args) {
        System.out.println("Začetek:");
        podcrtaj(); // klic metode podcrtaj()
        izpišiRobove(); // klic metode izpišiRobove()
        podcrtaj(); // klic metode podcrtaj()
        System.out.println("konec");
    }

    public static void podcrtaj() {
        System.out.println(("" + '-').repeat(60));
    }

    public static void izpišiRobove() {
        int I = 10;
        while (I > 0) {
            System.out.printf("|%58c|\n", ' ');
            I--;
        }
    }
}