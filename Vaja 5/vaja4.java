/* Javanski program ugotovi ali se krožnici z radijem r1 in r2, prva v izhodišču(x1,y1) in druga v (x2,y2) sekata, ter
ugotovitev izpiše v obliki pravilno (se sekata) in nepravilno (se ne sekata). Spišite ga. Vse vrednosti v program
lahko naključno ustvarite z intervala npr. [1,6]. (preverite: k1(1,1) z r=1 in k2(3,3) z r=1 se ne sekata,… */

public class vaja4 {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int r1 = Integer.parseInt(args[2]);
        int x2 = Integer.parseInt(args[3]);
        int y2 = Integer.parseInt(args[4]);
        int r2 = Integer.parseInt(args[5]);

        double razdalja = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        if (razdalja < r1 + r2) {
            System.out.println("Pravilno AKA se sekata");
        } else {
            System.out.println("Nepravilno AKA se ne sekata");
        }
    }
}
