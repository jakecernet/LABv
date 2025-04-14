/* 
Deklarirajte razred AstralnoTelo, ki vsebuje lastnost ‘naziv' in konstruktor.
 
Iz njega izpeljite razred Zvezda, ki deduje lastnost naziv (pazite na opredelitev kvalifikatorja za dostopne pravice v razredu AstralnoTelo) tako, da je del razreda Zvezda. 
V razredu Zvezda definirajte še zaščitene(protected) lastnosti: nazivZvezde, radij in oddaljenostOdSonca. Zvezda naj vsebuje tudi konstruktor (lahko tudi več konstruktorjev),  
ter primerjalne metode:
•	razredna metoda vrniSoncuBlizjoZvezdo/2 dobi kot argument 2 zvezdi in vrne tisto, ki je bližje soncu;
•	razredna metoda vrniManjsoRazdaljo/2 vrne razdaljo tiste z argumentum podane zvezde, katere razdalja do Sonca je manjša;
•	objektno metodo manjsaOdRazdalj/1 primerja oddaljenost zvezde in z argumentum podane  in vrne manjso od obeh.
Razred naj vsebuje še metodo, ki zna sešteti in tudi sešteje dve Zvezdi - Zvezdi seštejemo tako, da radiju večje zvezde dodamo 10% radija manjše;  
oddaljenost postane oddaljenost bližje zvezde;  naziv nove zvezde pa se sestavi iz prvega znaka večje in prvega znaka manjše zvezde. 
Če sta radija obeh zvezd enaka, zvezdi ne moremo in ju NE seštejemo!
	       	   
V zagonski metodi demonstracijskega razreda (lahko je to tudi razred Zvezda) ustvarite 5 zvezd in jih inicializirajte (vpiši podatke). Programsko poiščite zvezdo najbližjo Soncu in jo izpišite. Nato prvi definirani zvezdi prištejte vse preostale zvezde, ki jih lahko (različna radija) in izpišite končni radij novonastale zvezde.
Izpis zvezde naj se izvede kot izpis n-členika z nazivom zvezde na začetku, ki mu sledijo vsi preostali atributi oz. lastnosti zvezde. 
*/

public class naloga1 {
    public static class AstralnoTelo {
        protected String naziv;

        public AstralnoTelo(String naziv) {
            this.naziv = naziv;
        }

        public String getNaziv() {
            return naziv;
        }
    }

    public static class Zvezda extends AstralnoTelo {
        protected String nazivZvezde;
        protected double radij;
        protected double oddaljenostOdSonca;

        public Zvezda(String naziv, String nazivZvezde, double radij, double oddaljenostOdSonca) {
            super(naziv);
            this.nazivZvezde = nazivZvezde;
            this.radij = radij;
            this.oddaljenostOdSonca = oddaljenostOdSonca;
        }

        public Zvezda vrniSoncuBlizjoZvezdo(Zvezda zvezda1, Zvezda zvezda2) {
            return zvezda1.oddaljenostOdSonca < zvezda2.oddaljenostOdSonca ? zvezda1 : zvezda2;
        }

        public double vrniManjsoRazdaljo(Zvezda zvezda1, Zvezda zvezda2) {
            return Math.min(zvezda1.oddaljenostOdSonca, zvezda2.oddaljenostOdSonca);
        }

        public double manjsaOdRazdalj(Zvezda zvezda) {
            return Math.min(this.oddaljenostOdSonca, zvezda.oddaljenostOdSonca);
        }

        public Zvezda seštej(Zvezda zvezda) {
            if (this.radij == zvezda.radij) {
                System.out.println("Zvezdi imata enak radij, ne moremo ju sešteti.");
                return null;
            } else {
                double novRadij = this.radij + (zvezda.radij * 0.1);
                double novaOddaljenost = Math.min(this.oddaljenostOdSonca, zvezda.oddaljenostOdSonca);
                String novNaziv = this.nazivZvezde.charAt(0) + "" + zvezda.nazivZvezde.charAt(0);
                return new Zvezda(novNaziv, novNaziv, novRadij, novaOddaljenost);
            }
        }
    }

    public static void main(String[] args) {
        Zvezda zvezda1 = new Zvezda("zvezda", "zd1", 5, 100);
        Zvezda zvezda2 = new Zvezda("zvezda", "zd2", 10, 24);
        Zvezda zvezda3 = new Zvezda("zvezda", "zd3", 15, 96);
        Zvezda zvezda4 = new Zvezda("zvezda", "zd4", 30, 69);
        Zvezda zvezda5 = new Zvezda("zvezda", "zd5", 48, 420);

        for (Zvezda zvezda : new Zvezda[] { zvezda1, zvezda2, zvezda3, zvezda4, zvezda5 }) {
            System.out.println("Zvezda: " + zvezda.nazivZvezde + ", Radij: " + zvezda.radij + ", Oddaljenost od Sonca: "
                    + zvezda.oddaljenostOdSonca);
        }

        Zvezda najblizjaZvezda = zvezda1.vrniSoncuBlizjoZvezdo(zvezda1, zvezda2);
        if (zvezda2.oddaljenostOdSonca < najblizjaZvezda.oddaljenostOdSonca) {
            najblizjaZvezda = zvezda2;
        }
        if (zvezda3.oddaljenostOdSonca < najblizjaZvezda.oddaljenostOdSonca) {
            najblizjaZvezda = zvezda3;
        }
        if (zvezda4.oddaljenostOdSonca < najblizjaZvezda.oddaljenostOdSonca) {
            najblizjaZvezda = zvezda4;
        }
        if (zvezda5.oddaljenostOdSonca < najblizjaZvezda.oddaljenostOdSonca) {
            najblizjaZvezda = zvezda5;
        }
        System.out.println("Najbližja zvezda Soncu: " + najblizjaZvezda.nazivZvezde + ", Oddaljenost: "
                + najblizjaZvezda.oddaljenostOdSonca);

        zvezda1 = zvezda1.seštej(zvezda2);
        zvezda1 = zvezda1.seštej(zvezda3);
        zvezda1 = zvezda1.seštej(zvezda4);
        zvezda1 = zvezda1.seštej(zvezda5);

        if (zvezda1 != null) {
            System.out.println("Končni radij novonastale zvezde: " + zvezda1.radij);
        } else {
            System.out.println("Zvezdi nista bili sešteti.");
        }

        for (Zvezda zvezda : new Zvezda[] { zvezda1, zvezda2, zvezda3, zvezda4, zvezda5 }) {
            System.out.println("Zvezda: " + zvezda.nazivZvezde + ", Radij: " + zvezda.radij + ", Oddaljenost od Sonca: "
                    + zvezda.oddaljenostOdSonca);
        }
    }
}
