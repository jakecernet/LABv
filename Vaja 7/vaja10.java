/* Sestavite' predhodne štiri naloge v :
          0 0
        1 0 0 1
      2 1 0 0 1 2
    3 2 1 0 0 1 2 3
  4 3 2 1 0 0 1 2 3 4
5 4 3 2 1 0 0 1 2 3 4 5
5 4 3 2 1 0 0 1 2 3 4 5
  4 3 2 1 0 0 1 2 3 4
    3 2 1 0 0 1 2 3
      2 1 0 0 1 2
        1 0 0 1
          0 0 */

public class vaja10 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.print("0 ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.print("0 ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
