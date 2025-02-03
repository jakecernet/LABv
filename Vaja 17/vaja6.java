/*  
    Dano imamo zaporedje: 1, 5, 6, 11, 17, 28, 45, ...
Napišite metodo, ki vrne n-ti člen tega zaporedja, pri tem je n argument metode.

(opomba: n lahko omejite z N, pri tem pa naj N ne bo manjši od 100, s čimer zagotovite, da lahko dobite
 vsakega izmed prvih 100 členov. In da, zaporedje morate analizirati sami. )
*/

public class vaja6 {
    public static void main(String[] args) {
        System.out.println(zaporedje(1));
        System.out.println(zaporedje(2));
        System.out.println(zaporedje(3));
        System.out.println(zaporedje(4));
        System.out.println(zaporedje(5));
        System.out.println(zaporedje(6));
        System.out.println(zaporedje(7));
        System.out.println(zaporedje(8));
        System.out.println(zaporedje(9));
        System.out.println(zaporedje(10));
    }

    public static int zaporedje(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 5;
        } else if (n == 3) {
            return 6;
        } else {
            return zaporedje(n - 1) + zaporedje(n - 2);
        }
    }
}
