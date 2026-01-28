/* Recimo, da si izberemo neko neceloštevilsko vrednost. Program primerja vrednost celega dela (tistega pred
decimalno vejico) z vrednostjo necelega dela (za decimalno vejico) kot da bi bili to dve celoštevilski vrednosti,
ter ustrezno rezultatu primerjave izpiše pravilno (če je celi večji) ali nepravilno (če je celi del manjši). Recimo, da
sta celi in neceli del vedno dolžine 4 decimalnih mest */

public class vaja3 {
    public static void main(String[] args) {
        double vrednost = 69.420;
        int celi = (int) vrednost;
        int neceli = (int) ((vrednost - celi) * 10000);
        System.out.println("Celi del: " + celi);
        System.out.println("Ne-celi del: " + neceli);
        if (celi > neceli) {
            System.out.println("Pravilno");
        } else {
            System.out.println("Nepravilno");
        }
    }
}
