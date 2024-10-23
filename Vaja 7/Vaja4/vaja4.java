/* Program naj razstavi s parametrom vneseno število na posamezne števke. Vsako števko podanega števila naj
izpiše v drugi vrstici. */

public class vaja4 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int stevka;
        StringBuilder reverse = new StringBuilder();
        while (N > 0) {
            stevka = N % 10;
            reverse.append(stevka).append("\n");
            N = N / 10;
        }
        System.out.print(reverse.reverse().toString());
    }
}
