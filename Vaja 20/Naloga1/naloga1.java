/*
    Objekt vrste Smer predstavlja trenutno smer gibanja lika, s katerim je povezan. Gibanje je ravninsko in zgolj
    ortogonalno (recimo vzporedno z osmi koordinatnega sistema ravnine).

    Vektor (normaliziran) gibanja je/sta privatni lastnosti objekta in lahko zavzema samo 4 vrednosti, za vsako od smeri 
    po ena. Tipično objekt vrste Smer inicializiramo z smerjo gibanja, objektu, ki ga ne inicializiramo s smerjo določimo
    privzeto smer gibanja 'desno'. Za vsako komponento vektorja gibanja mora obstajati vračalec (getter). 

    Zagotovite možnost kontroliranega izpisa objekta na zaslon. Objekt vsebuje metodi obrniLevo() in obrniDesno(), ki 
    popravi smer tako, da v prvem primeru 'zasuka' smer za 90 stopinj v smeri nasprotni urinemu kazalcu, in v drugem 
    primeru za 90 stopinj v smeri urinega kazalca.

    a) Iz opisa konstruirajte ustrezen razred, kreirajte par objektov te vrste in preskusite:
        - omejitve pri konstrukciji objekta
        - zmožnost spreminjanja smeri v skladu z opisom
      (Preskus in dokazovanje delovanja sta v vaši domeni.)

    b) Izrišite razredni diagram za razred Smer.
*/

public class naloga1 {
    public static void main(String[] args) {
        Smer s1 = new Smer();
        Smer s2 = new Smer("gor");
        Smer s3 = new Smer("levo");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println();

        s1.obrniLevo();
        s2.obrniDesno();
        s3.obrniLevo();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

/**
 * Razred Smer predstavlja smer gibanja lika.
 * 
 * @param smer Smer gibanja lika.
 * 
 * @method getSmer() Vrne trenutno smer gibanja.
 * @method obrniLevo() Spremeni smer gibanja za 90 stopinj v smeri nasprotni
 *         urinemu kazalcu.
 * @method obrniDesno() Spremeni smer gibanja za 90 stopinj v smeri urinega
 *         kazalca.
 * @method toString() Vrne niz z informacijo o smeri gibanja.
 * 
 * @throws IllegalArgumentException Če je podana napačna smer.
 * 
 * @example
 *          Smer s1 = new Smer();
 *          Smer s2 = new Smer("gor");
 *          Smer s3 = new Smer("levo");
 */
class Smer {
    private String smer;

    public Smer() {
        this.smer = "desno";
    }

    public Smer(String smer) {
        if (smer != "gor" && smer != "dol" && smer != "levo" && smer != "desno") {
            throw new IllegalArgumentException("Napacna smer!");
        }
        this.smer = smer;
    }

    public String getSmer() {
        return this.smer;
    }

    public void obrniLevo() {
        this.smer = switch (this.smer) {
            case "gor" -> "desno";
            case "desno" -> "dol";
            case "dol" -> "levo";
            case "levo" -> "gor";
            default -> this.smer;
        };
    }

    public void obrniDesno() {
        this.smer = switch (this.smer) {
            case "gor" -> "levo";
            case "levo" -> "dol";
            case "dol" -> "desno";
            case "desno" -> "gor";
            default -> this.smer;
        };
    }

    @Override
    public String toString() {
        return "Smer: " + this.smer;
    }
}
