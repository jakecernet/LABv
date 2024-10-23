/* Napišite javanski program ki na zaslon izriše podano obliko */

public class vaja3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        while (n > 0) {
            int temp = n;
            while (temp > 0) {
                System.out.print(temp);
                temp--;
            }
            System.out.println();
            n--;
        }
    }
}
