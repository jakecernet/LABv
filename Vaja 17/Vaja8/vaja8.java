/*  
    V javanskem programskem jeziku napišite program, ki izpiše naravna števila iz intervala [1,100000], ki so enaka
vsoti kubov svojih števk.
  Npr.: 153 = 1^3 + 5^3 + 3^3.
*/

public class vaja8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100000; i++) {
            if (i == kubi(i)) {
                System.out.println(i);
            }
        }
    }

    public static int kubi(int n) {
        int kub = 0;
        while (n != 0) {
            kub += Math.pow(n % 10, 3);
            n /= 10;
        }
        return kub;
    }
}
