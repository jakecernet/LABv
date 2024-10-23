/* In še naslednjo modifikacijo :
          0
        1   1
      2       2
    3           3
  4               4
5                   5
  4               4
    3           3
      2       2
        1   1
          0 */

public class vaja12 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print("  ");
            }
            if (i == 0) {
                System.out.print(i);
            } else {
                System.out.print(i);
                for (int j = 0; j < 4 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                System.out.print("  ");
            }
            if (i == 0) {
                System.out.print(i);
            } else {
                System.out.print(i);
                for (int j = 0; j < 4 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
