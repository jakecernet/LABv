/*  
    Dana je razredna metoda s kodnim/razvojnim imenom x_32_v4.
*/

public class vaja1 {
    public static void main(String[] args) {
        System.out.println(x_32_v4(1234567890));
    }

    static int x_32_v4(long abc) {
        int ll = 1;
        for (; (abc /= 10) != 0; ll++)
            ;
        return Math.max(1, ll);
    }
}

/*
 * − Analizirajte njeno delovanje in ugotovite, kaj počne
 * − Glede na ugotovitev dokažite pravilnost (ugotovljenega) delovanja (dokazi
 * bazirajo na osnovi
 * sledi izvajanj). Dokazi morajo pokrivati/dokazovati pravilnost/ vseh vstopnih
 * možnosti za dani
 * postopek (oziroma vsako vrednost argumenta).
 * − Spišite demonstracijski program, ki bo pokazal pričakovano delovanje metode
 * pri klicu s
 * poljubno celoštevilsko vrednostjo.
 * − Obrazložite, zakaj iz metode vračamo večjo od specificiranih vrednosti.
 * − Predlagajte ime metode, ki bo dovolj opisno za funkcijo, ki jo opravlja.
 */

/*
 * Odgovori:
 * - Metoda x_32_v4 vrne število števk v številu, ki ga podamo kot argument.
 * - Metoda deluje tako, da zanka odšteva 10 od števila, dokler ne pride do 0.
 * Vsakič, ko odšteje 10, poveča števec za 1.
 * - Dokaz pravilnosti:
 * - Če je število 0, bo število števk 1.
 * - Če je število pozitivno, bo število števk enako številu korakov, ki jih
 * naredimo, da pridemo do 0.
 * - Če je število negativno, bo število števk enako številu korakov, ki jih
 * naredimo, da pridemo do 0, brez znaka.
 * - Iz metode vračamo večjo od specificiranih vrednosti, ker je to edina
 * vrednost, ki je lahko večja od 1.
 * - Predlagano ime metode: steviloStevk
 */
