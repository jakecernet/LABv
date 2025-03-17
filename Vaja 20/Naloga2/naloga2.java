/*
    Lik v tej nalogi bo dokaj abstraktna zadeva. Ni opredeljen z obliko, temveč zgolj s pozicijo v ravnini in smerjo gibanja,
    ki jo določa vsebovan objekt vrste Smer. Seveda so vse lastnosti vsakega Lik-a privatne. Lik kreiramo tako, da mu
    podamo pozicijo v ravnini in smer gibanja. V primeru, da smeri ne podamo, se uporabi privzeta smer. Če Lik kreiramo brez
    argumentov, se postavi v izhodišče koordinatnega sistema s privzeto smerjo gibanja. Javna metoda premakni/0 premakne
    objekt za 1 v trenutno z objektom določeni smeri gibanja. Javni metodi obrniLevo/0 in obrniDesno/0 lik obrneta, kot je
    opisano v Smer. Za pozicijo lika mora/ta v objektu obstajati ustrezna vračalca.
    
    a) Iz opisa konstruirajte ustrezen razred, kreirajte par objektov te vrste in preskusite:
        - premikanje
        - zmožnost spreminjanja smeri pri gibanju lika
    b) Izrišite razredni diagram / nivo podrobnosti: omejite vsebino na zgolj javne člane
*/

public class naloga2 {
    public static void main(String[] args) {
        Lik lik1 = new Lik(0, 0);
        Lik lik2 = new Lik(5, 5, "gor");

        lik1.premakni();
        lik2.premakni();

        lik2.obrniLevo();
        lik2.premakni();

        System.out.println("Lik1: x = " + lik1.getX() + ", y = " + lik1.getY());
        System.out.println("Lik2: x = " + lik2.getX() + ", y = " + lik2.getY());

        lik1.obrniDesno();
        lik1.premakni();
    }
}

/**
 * Razred Lik predstavlja lik v ravnini.
 * 
 * @param x    X koordinata lika.
 * @param y    Y koordinata lika.
 * @param smer Smer gibanja lika.
 * 
 * @method premakni() Premakne lik za 1 v trenutno določeni smeri gibanja.
 * @method obrniLevo() Spremeni smer gibanja za 90 stopinj v smeri nasprotni
 *         urinemu kazalcu.
 * @method obrniDesno() Spremeni smer gibanja za 90 stopinj v smeri urinega
 *         kazalca.
 * @method getX() Vrne X koordinato lika.
 * @method getY() Vrne Y koordinato lika.
 * 
 * @example
 *          Lik lik1 = new Lik(0, 0);
 *          Lik lik2 = new Lik(5, 5, "gor");
 *          lik1.premakni();
 *          lik2.premakni();
 *          lik2.obrniLevo();
 *          lik2.premakni();
 */
class Lik {
    private int x;
    private int y;
    private Smer smer;

    private static class Smer {
        private String smer;

        public Smer(String smer) {
            this.smer = smer;
        }

        public String getSmer() {
            return smer;
        }

        public void obrniDesno() {
            switch (smer) {
                case "gor":
                    smer = "desno";
                    break;
                case "desno":
                    smer = "dol";
                    break;
                case "dol":
                    smer = "levo";
                    break;
                case "levo":
                    smer = "gor";
                    break;
            }
        }

        public void obrniLevo() {
            switch (smer) {
                case "gor":
                    smer = "levo";
                    break;
                case "levo":
                    smer = "dol";
                    break;
                case "dol":
                    smer = "desno";
                    break;
                case "desno":
                    smer = "gor";
                    break;
            }
        }
    }

    public Lik(int x, int y, String smer) {
        this.x = x;
        this.y = y;
        this.smer = new Smer(smer);
    }

    public Lik(int x, int y) {
        this(x, y, "gor");
    }

    public Lik() {
        this(0, 0, "gor");
    }

    public void premakni() {
        switch (smer.getSmer()) {
            case "gor":
                y++;
                break;
            case "dol":
                y--;
                break;
            case "levo":
                x--;
                break;
            case "desno":
                x++;
                break;
        }
    }

    public void obrniLevo() {
        smer.obrniLevo();
    }

    public void obrniDesno() {
        smer.obrniDesno();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
