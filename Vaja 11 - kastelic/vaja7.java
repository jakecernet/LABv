/*  
  * Naloga 7
 * Spišite razredno metodo, ki ji s klicem posredujete celoštevilsko vrednost s pomenom letnice rojstva. 
 * Metoda v tabelo štirih celih števil vpišite števke, ki se nahajajo v letnici rojstva. Nato oba podatka , letnico in tabelo, zaporedno izpiše v naslednji obliki:
 * Letnica rojstva: 1995
 * Razčlenjena letnica rojstva: 1 – 9 – 9 – 5
*/

public class vaja7 {
    public static void main(String[] args) {
        int leto = 1995;
        int[] tabela = new int[4];
        int i = 0;
        while (leto > 0) {
            tabela[i] = leto % 10;
            leto /= 10;
            i++;
        }
        System.out.println("Letnica rojstva: 1995");
        System.out.print("Razčlenjena letnica rojstva: ");
        for (int j = tabela.length - 1; j >= 0; j--) {
            System.out.print(tabela[j]);
            if (j != 0) {
                System.out.print(" - ");
            }
        }
    }
}
