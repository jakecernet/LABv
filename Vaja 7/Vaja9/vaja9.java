/* Realizirajte tudi (glej besedilo predhodne naloge):
0
0 1
0 1 2
0 1 2 3
0 1 2 3 4
0 1 2 3 4 5 */

public class vaja9 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
