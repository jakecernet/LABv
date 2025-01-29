/**
 * razred First
 * ovojni razred za demonstracijo delovanja Sklada
 * Sklad je reliziran kot notanji razred razreda First,
 * dejansko je njegov član, kot sta lahko poljubna razredna
 * lastnost ali razredna metoda
 * 
 * naj razredna lastnost 'stevilo' vsebuje število elementov v
 * skladu
 * 
 * naj razredna metoda 'main/1' služi demonstraciji delovanja sklada
 */
public class First {
    // stevilo NI del Sklad-a !
    static int stevilo = 0;

    /**
     * razred Sklad
     * je razredna komponenta razreda First
     * kot taka dosegljiva iz vse vsebine razreda First
     * - private/public znotraj razreda ne igrajo vloge ....
     * 
     * Opis strukture in delovanja:
     * sklad je struktura, ki:
     * - ima definirana 2 kazalca : dno in vrh
     * - ima dfinirani metodi dajNaSklad(push) in vzemiIzSklada(pop)
     * - metodi sta izvedba algoritma LIFO (tist' k' zad'n pride, gre prv' v'n)
     * 
     * Če kazalca dno in vrh kažeta na isto lokacijo, je skad prazen, vrh kaže
     * na lokacijo, kamor vstavimo nov element v postopku vstavljanja
     * dajNaSklad : na pozicijo kazalca vrh damo nov element, kazalec vrh ustrezno
     * ažuriramo, da kaže na prvo naslednjo 'prazno' lokacijo
     * vzemiIzSklada : ažuriramo kazalec vrh, da kaže na zadnjo zasedeno lokacijo
     * in vrnemo vrednost s te lokacije
     * 
     * realizacija spodaj vsebuje 3 utility/covenience metode, za
     * simpatičnejše delo (empty,full-diagnostični ter show-ugodna) :
     * 
     * 
     */
    static class Sklad {
        private static Integer[] kontejner = new Integer[30];
        private static int vrh = 0;
        private static int dno = 0;

        static boolean empty() {
            return vrh == dno;
        }

        static boolean full() {
            return vrh == kontejner.length;
        }

        /**
         * izriše celoten sklad vrtikalno
         */
        static void show() {
            int lvrh = vrh;
            System.out.println();
            System.out.print("vrh--> ");
            if (vrh != dno)
                System.out.println();
            while (--lvrh > dno) {
                System.out.println();
                System.out.print("              "); // 14 presledkov, neinteligentno
                System.out.println(kontejner[lvrh]);
            }

            if (vrh != dno) {
                System.out.print("       dno--> ");
                System.out.println(kontejner[lvrh]);
            } else {
                System.out.println("dno--> ");
            }
            System.out.println("------ ------ ------");
            System.out.println();
        }

        /**
         * izriše vsebino celotnega sklada brez kazalcev
         */
        static void showSimple() {
            int lvrh = vrh;
            System.out.println();

            while (--lvrh >= dno) {
                System.out.println(kontejner[lvrh]);
            }

        }

        /**
         * prijazno ne naredi ničesar, če je sklad pred dodajanjem že poln
         * 
         * @param vrednost, ki jo dajemo na vrh sklada
         */
        static void push(Integer vrednost) {
            if (full())
                return;

            kontejner[vrh] = vrednost;
            vrh++;

            stevilo++;
        }

        /**
         * vrne vrednost vrha slada
         * Če ni kaj vrniti, sklad prazen, vrne -1, ker pač nekaj mora vrniti
         * 
         * @return vrhnja vrednost s sklada
         */
        static Integer pop() {
            if (Sklad.empty())
                return -1;
            vrh--;
            return kontejner[vrh];
        }

        /**
         * vrne vrednost vrha sklada, ne da bi jo odstranil
         * 
         * @return vrhnja vrednost sklada
         */
        static Integer peek() {
            if (Sklad.empty())
                return -1;
            return kontejner[vrh - 1];
        }
    }

    static class LinearnaVrsta {
        private static Integer[] kontejner = new Integer[30];
        private static int zacetek = 0;
        private static int konec = 0;

        static boolean empty() {
            return zacetek == konec;
        }

        static boolean full() {
            return (konec + 1) % kontejner.length == zacetek;
        }

        static void show() {
            int lvrh = zacetek;
            System.out.println();
            System.out.print("zacetek--> ");
            if (zacetek != konec)
                System.out.println();
            while (lvrh < konec) {
                System.out.println();
                System.out.print("              "); // 14 presledkov, neinteligentno
                System.out.println(kontejner[lvrh]);
                lvrh++;
            }

            if (zacetek != konec) {
                System.out.print("       konec--> ");
                System.out.println(kontejner[lvrh]);
            } else {
                System.out.println("konec--> ");
            }
            System.out.println("------ ------ ------");
            System.out.println();
        }

        static void push(Integer vrednost) {
            if (full())
                return;

            kontejner[konec] = vrednost;
            konec++;

            stevilo++;
        }

        static Integer pop() {
            if (LinearnaVrsta.empty())
                return -1;
            return kontejner[zacetek++];
        }
    }

    static class LinearnaVrstazInti {
        private static int[] kontejner = new int[30];
        private static int zacetek = 0;
        private static int konec = 0;

        static boolean empty() {
            return zacetek == konec;
        }

        static boolean full() {
            return (konec + 1) % kontejner.length == zacetek;
        }

        static void show() {
            int lvrh = zacetek;
            System.out.println();
            System.out.print("zacetek--> ");
            if (zacetek != konec)
                System.out.println();
            while (lvrh < konec) {
                System.out.println();
                System.out.print("              "); // 14 presledkov, neinteligentno
                System.out.println(kontejner[lvrh]);
                lvrh++;
            }

            if (zacetek != konec) {
                System.out.print("       konec--> ");
                System.out.println(kontejner[lvrh]);
            } else {
                System.out.println("konec--> ");
            }
            System.out.println("------ ------ ------");
            System.out.println();
        }

        static void push(int vrednost) {
            if (full())
                return;

            kontejner[konec] = vrednost;
            konec++;

            stevilo++;
        }

        static int pop() {
            if (LinearnaVrsta.empty())
                return -1;
            return kontejner[zacetek++];
        }
    }

    static class KroznaVrsta {
        private static Integer[] kontejner = new Integer[30];
        private static int zacetek = 0;
        private static int konec = 0;

        static boolean empty() {
            return zacetek == konec;
        }

        static boolean full() {
            return (konec + 1) % kontejner.length == zacetek;
        }

        static void show() {
            int lvrh = zacetek;
            System.out.println();
            System.out.print("zacetek--> ");
            if (zacetek != konec)
                System.out.println();
            while (lvrh < konec) {
                System.out.println();
                System.out.print("              "); // 14 presledkov, neinteligentno
                System.out.println(kontejner[lvrh]);
                lvrh++;
            }

            if (zacetek != konec) {
                System.out.print("       konec--> ");
                System.out.println(kontejner[lvrh]);
            } else {
                System.out.println("konec--> ");
            }
            System.out.println("------ ------ ------");
            System.out.println();
        }

        static void push(Integer vrednost) {
            if (full())
                return;

            kontejner[konec] = vrednost;
            konec = (konec + 1) % kontejner.length;

            stevilo++;
        }

        static Integer pop() {
            if (KroznaVrsta.empty())
                return -1;
            Integer vrednost = kontejner[zacetek];
            zacetek = (zacetek + 1) % kontejner.length;
            return vrednost;
        }

    }

    public static void main(String[] args) {
        // System.out.println(Sklad.dno);
        Sklad.push(32);
        Sklad.push(61);
        Sklad.show();
        System.out.println("size: " + stevilo);
        if (!Sklad.empty()) {
            System.out.println("  ---> pop-ing :" + Sklad.pop());
            stevilo--;
        }
        Sklad.show();
        if (!Sklad.empty()) {
            System.out.println("  ---> pop-ing :" + Sklad.pop());
            stevilo--;
        }
        Sklad.show();
        System.out.println("size: " + stevilo);
        System.out.printf("\n\n\n\n\n\n\n");


        LinearnaVrsta.push(32);
        LinearnaVrsta.push(61);
        LinearnaVrsta.show();
        System.out.println("size: " + stevilo);
        if (!LinearnaVrsta.empty()) {
            System.out.println("  ---> pop-ing :" + LinearnaVrsta.pop());
            stevilo--;
        }
        LinearnaVrsta.show();
    }
}
