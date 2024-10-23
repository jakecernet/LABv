/* Realizirajte izpis, kot je dan na spodnjem primeru. Upoštevajte, da je dolžina izpisa(število vrstic izpisa) vhoden
podatek programa. Dan je primer za vhodni parameter z vrednostjo 6.
0 1 2 3 4 5
0 1 2 3 4
0 1 2 3
0 1 2
0 1
0 */

public class vaja6 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
