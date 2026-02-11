/* Realizirajte izpis, kot je dan na spodnjem primeru. Upoštevajte, da je dolžina izpisa(število vrstic izpisa) vhoden
podatek programa. Dan je primer za vhodni parameter z vrednostjo 6.
5 4 3 2 1 0
4 3 2 1 0
3 2 1 0
2 1 0
1 0
0 */

public class vaja7 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
