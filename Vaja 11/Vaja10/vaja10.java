/*  
  * Naloga 10
 * V nekem razredu je n dijakov. N je lahko celo število iz intervala [25..34]. Napišite program, ki omogoča vnos uspehov dijakov. Veljavni uspehi so: "nzd", "zd", "db", "pd", "odl" ali "neoc". Nato program izpiše posamezne uspehe in za vsak rang uspeha/uspeh število dijakov. Primer izpisa:
 * Uspehi: 2,1,1,1,3,3,3,3,3,3,4,4,4,4,2,4,5,5,neoc,5,....
 * Nezadostni: 3
 * Zadostni: 5
 * Dobri: 10
 * Pravdobri: 7
 * Odlični: 3
 * Neocenjeni: 2
*/

public class vaja10 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10) + 25;
        String[] uspehi = { "nzd", "zd", "db", "pd", "odl", "neoc" };
        String[] dijaki = new String[n];
        for (int j = 0; j < dijaki.length; j++) {
            dijaki[j] = uspehi[(int) (Math.random() * 6)];
        }
        int nzd = 0, zd = 0, db = 0, pd = 0, odl = 0, neoc = 0;
        for (int j = 0; j < dijaki.length; j++) {
            switch (dijaki[j]) {
                case "nzd":
                    nzd++;
                    break;
                case "zd":
                    zd++;
                    break;
                case "db":
                    db++;
                    break;
                case "pd":
                    pd++;
                    break;
                case "odl":
                    odl++;
                    break;
                case "neoc":
                    neoc++;
                    break;
            }
        }
        System.out.println("Uspehi: ");
        System.out.println("Nezadostni: " + nzd);
        System.out.println("Zadostni: " + zd);
        System.out.println("Dobri: " + db);
        System.out.println("Pravdobri: " + pd);
        System.out.println("Odlični: " + odl);
        System.out.println("Neocenjeni: " + neoc);
    }
}
