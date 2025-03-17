/*
    Javanski program kreira 15 objektov tipa lik in jih shrani v ustrezno tabelo. Pozicijo prvega lika ustvarite
    naključno v ravnini (obseg naj bo [-50,50][-50,50]). Vsak naslednji naj bo za 3 enote oddaljen v smeri, ki jo
    določa smer predhodnega. 
    a) Vizualizacija pozicij mora pokazati vrsto (daljica?).
    b) Izvedite gibanje likov v smeri 'glave' zaporedja v tabeli (pomnite; smer je določal vedno element, ki je bil zadnji dodan
       v tabelo) za npr. 10 premikov.
       :: nastavljalcev za objekt vrste Lik nimate, lahko pa naredite nov lik
       :: če bi odstrani prvi element tabele (index 0) in dodali nov element na mesto N v tabeli, bi se zaporedje
          navidezno premaknilo v smeri predhodno zadjega elementa
       :: predlagam, da naredite krožno vrsto
    c) preverite pravilnost delovanja še s postopkom:
        - naredi 10 korakov dani smeri, nato obrniDesno, naredi še 10 korakov 
*/

public class naloga3 {
    public static void main(String[] args) {
        Lik[] tabelaLikov = new Lik[15];
        tabelaLikov[0] = new Lik((int)(Math.random()*100-50), (int)(Math.random()*100-50));
        for (int i = 1; i < tabelaLikov.length; i++) {
            tabelaLikov[i] = new Lik(tabelaLikov[i-1].getX() + 3, tabelaLikov[i-1].getY() + 3);
        }
        for (int i = 0; i < tabelaLikov.length; i++) {
            System.out.println(tabelaLikov[i]);
        }
        for (int i = 0; i < 10; i++) {
            tabelaLikov[0] = tabelaLikov[tabelaLikov.length-1];
            for (int j = tabelaLikov.length-1; j > 0; j--) {
                tabelaLikov[j] = tabelaLikov[j-1];
            }
            tabelaLikov[0] = new Lik(tabelaLikov[1].getX() + 3, tabelaLikov[1].getY() + 3);
            for (int j = 0; j < tabelaLikov.length; j++) {
                System.out.println(tabelaLikov[j]);
            }
        }
    }
}

class Lik {
    private int x;
    private int y;

    public Lik(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "x: " + x + ", y: " + y;
    }
}
