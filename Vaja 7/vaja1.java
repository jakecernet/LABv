/* Napišite javanski program, ki vrednost N na zaslon izpiše N-krat. N naj bo pri tem vhodni parameter programa */

public class vaja1 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int i = 0;
        while( i < N) {
            System.out.print(N);
            i++;
        }
    }
}