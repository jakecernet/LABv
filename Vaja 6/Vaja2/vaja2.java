/* Program iz prve naloge predelaj tako, da deluje pravilno tudi v primeru, ko je prvo vpisano število
večje od drugega. */

public class vaja2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int stevec = 0;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                System.out.println("Število " + i + " je deljivo s številom " + c);
                stevec++;
            }
        }
        System.out
                .println("število števil med " + a + " in " + b + ", ki so deljiva s številom " + c + " je: " + stevec);
    }
}
