/* Napišite javanski program ki na zaslon izriše kvadrat s števkami N s stranico N */

public class vaja2 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int i = 0;
       while (i < N) {
            for (int j = 0; j < N; j++) {
                System.out.print(N);
            }
            System.out.println();
            i++;
        }
    }
}
