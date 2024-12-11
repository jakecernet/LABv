/*  
    V razred dodajte še (dve) enakovredni metodi, ki bosta cilje iz naloge 1 izvedli na tabeli znakov, kot npr.:
    char[] tc = new char[]{'a','h','H','j','X'};
    (metodi opravljata enako delo kot tisti iz Naloga1. Zaslužita enako ime? 
*/

public class vaja2 {
    public static void main(String[] args) {
        char[] tc = new char[] { 'a', 'h', 'H', 'j', 'X' };
        System.out.println("prvi znak: " + vrniPrviZnak(tc));
        System.out.println("zadnji znak: " + vrniZadnjiZnak(tc));
    }

    public static char vrniPrviZnak(char[] tab) {
        return tab[0];
    }

    public static char vrniZadnjiZnak(char[] tab) {
        return tab[tab.length - 1];
    }
}
