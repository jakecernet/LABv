/* Program Naloga3 predstavlja simulacijo streljanja serije desetih strelov v tarčo. Odstopanje strela od
centra tarče znaša največ 60 % oziroma +-6 v x in v y smeri (6 pomeni razdaljo od središča tarče oz.
10, kar pomeni, da je strelec pač zadel 4). Programsko izvedite simulacijo 10-tih strelov in določite
rezultat glede na doseženo vrednost strela. Točnost strela se določa na ena decimalko natančno.
Primer izpisa simulacije streljanja:
serija 1: Vrednost strela: 10.0 akumulacija: 10.0
serija 2: Vrednost strela: 7.3 akumulacija: 17.3
serija 3: Vrednost strela: 4.6 akumulacija: 21.9
serija 4: Vrednost strela: 8.2 akumulacija: 30.1
serija 5: Vrednost strela: 5.9 akumulacija: 36.0
serija 6: Vrednost strela: 5.2 akumulacija: 41.2
serija 7: Vrednost strela: 5.4 akumulacija: 46.6
serija 8: Vrednost strela: 8.9 akumulacija: 55.5
serija 9: Vrednost strela: 6.9 akumulacija: 62.4
serija 10: Vrednost strela: 6.2 akumulacija: 68.6
Rezultat: 68.6
Program naj dodatno izpiše še :
- vrednost najboljšega strela in v kateri seriji je bil dosežen,
- vrednost najslabšega strela ter serija, v kateri je bil dosežen. */

public class vaja3 {
    public static void main(String[] args) {
        double akumulacija = 0;
        double najboljsiStrel = 0;
        double najslabsiStrel = 10;
        int serijaNajboljsi = 0;
        int serijaNajslabsi = 0;
        for (int i = 1; i <= 10; i++) {
            double vrednostStrela = Math.random() * 12 - 2;
            akumulacija += vrednostStrela;
            if (vrednostStrela > najboljsiStrel) {
                najboljsiStrel = vrednostStrela;
                serijaNajboljsi = i;
            }
            if (vrednostStrela < najslabsiStrel) {
                najslabsiStrel = vrednostStrela;
                serijaNajslabsi = i;
            }
            System.out.println("serija " + i + ": Vrednost strela: " + String.format("%.1f", vrednostStrela) + " akumulacija: " + String.format("%.1f", akumulacija));
        }
        System.out.println("Rezultat: " + String.format("%.1f", akumulacija));
        System.out.println("Najboljši strel: " + String.format("%.1f", najboljsiStrel) + " v seriji " + serijaNajboljsi);
        System.out.println("Najslabši strel: " + String.format("%.1f", najslabsiStrel) + " v seriji " + serijaNajslabsi);
    }
}
