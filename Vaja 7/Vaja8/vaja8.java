/* Realizirajte tudi (glej besedilo predhodne naloge):
          0
        1 0
      2 1 0
    3 2 1 0
  4 3 2 1 0
5 4 3 2 1 0 */

public class vaja8 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
