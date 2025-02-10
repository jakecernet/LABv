/*  
    V javanskem programskem jeziku napišite program, ki izpiše naravna števila iz intervala [1,100000], ki so enaka
vsoti kubov svojih števk.
  Npr.: 153 = 1^3 + 5^3 + 3^3.

  b) Vse števke, ki ustrezajo kriteriju v osnovni nalogi iz intervala [1..N] bi želeli shraniti v tabelo ustrezne 
   dolžine (mišljeno je ravno prav dolge). Spišite metodo, ki bo to storila.
*/

public class vaja8b {
    public static void main(String[] args) {
        for (int i = 1; i <= 100000; i++) {
            if (i == kubi(i)) {
                System.out.println(i);
            }
        }

        System.out.println(stevilo(100000));
    }

    public static int kubi(int n) {
        int kub = 0;
        while (n != 0) {
            kub += Math.pow(n % 10, 3);
            n /= 10;
        }
        return kub;
    }

    public static int[] stevila(int N) {
        int[] stevila = new int[stevilo(N)];
        int j = 0;
        for (int i = 1; i <= N; i++) {
            if (i == kubi(i)) {
                stevila[j] = i;
                j++;
            }
        }
        return stevila;
    }

    public static int stevilo(int N) {
        int stevilo = 0;
        for (int i = 1; i <= N; i++) {
            if (i == kubi(i)) {
                stevilo++;
            }
        }
        return stevilo;
    }
}
