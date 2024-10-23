/* Naloge od 1 do 4 rešite z uporabo stavka for. */

public class vaja5 {
    public class vaja1 {
        public static void main(String[] args) {
            int N = Integer.parseInt(args[0]);
            for (int i = 0; i < N; i++) {
                System.out.print(N);
            }
        }
    }

    public class vaja2 {
        public static void main(String[] args) {
            int N = Integer.parseInt(args[0]);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(N);
                }
                System.out.println();
            }
        }
    }

    public class vaja3 {
        public static void main(String[] args) {
            int n = Integer.parseInt(args[0]);
            for (; n > 0; n--) {
                int temp = n;
                for (; temp > 0; temp--) {
                    System.out.print(temp);
                }
                System.out.println();
            }
        }
    }

    public class vaja4 {
        public static void main(String[] args) {
            int N = Integer.parseInt(args[0]);
            int stevka;
            StringBuilder reverse = new StringBuilder();
            for (; N > 0; N /= 10) {
                stevka = N % 10;
                reverse.append(stevka).append("\n");
            }
            System.out.print(reverse.reverse().toString());
        }
    }
}
