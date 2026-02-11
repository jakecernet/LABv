/* Za osvežitev spomina; dan je program, ki uporabi razred z razrednim (statičnim) kontekstom.
 * Oglejte si načine naslavljanja lastnosti in njihove značilnosti, nato odgovorite na vprašanja spodaj.
 *
 * Potrdite ali zavrzite izjave (nanašajo se na definicijo razreda Zero_01_ra):
 * a) ne glede na to koliko objektov naredimo, imamo na razpolago zgolj en nabor podatkov
 *    __Potrjeno__
 * b) vsi objekti iste vrste (v primeru tipa Zero_01_ra) si očitno 'delijo' iste podatke 
 *    __Potrjeno__
 * c) z vsebino razreda lahko manipuliramo (spreminjamo, nastavljamo, ...) ne da bi bilo potrebno
 *    narediti kakršen koli objekt
 *    __Potrjeno__
 * d) tudi razredno metodo lahko kličemo, ne da bi bilo predhodno potrebno ustvariti objekt
 *    __Potrjeno__
 */

/**
 * razred;
 * celoten kontekst je razredne vrste
 * (vsi člani so razredni člani /static/)
 */
class Zero_01_ra {
    static int x;
    static int y;
}

public class vaja4 {
    public static void main(String[] args) {
        // --------- a
        Zero_01_ra.x = 3;
        Zero_01_ra.y = 4;
        System.out.println("----------------------------- vsebina: class members  --");
        System.out.println(Zero_01_ra.x + " " + Zero_01_ra.y);

        // malo preglejmo
        System.out.println("----------------------------- vsebina iz obeh objektov  --");
        System.out.println(Zero_01_ra.x + " " + Zero_01_ra.y);
        System.out.println(Zero_01_ra.x + " " + Zero_01_ra.y);
        // še malo manipulacije
        Zero_01_ra.x = 131;
        Zero_01_ra.y = 898;
        // in preglejmo:
        System.out.println("----------------------------- vsi 'trije'  --");
        System.out.println(Zero_01_ra.x + " " + Zero_01_ra.y);
        System.out.println(Zero_01_ra.x + " " + Zero_01_ra.y);
        System.out.println(Zero_01_ra.x + " " + Zero_01_ra.y);
    }
}