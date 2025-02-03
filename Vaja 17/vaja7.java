/*  
    Imamo enorazsežno tabelo meritev dolžine n (n=6) z vsebino:
            -------------
meritev:    |5|3|1|2|7|8|
            -------------
Kakšna bo vsebina tabele po izvedbi naslednjega algoritma, če za vrednost spremenljivke nova vpišemo 9?

začetek:
 vpiši nova
 i <-- 2
 ponavljaj
  meritev(i-1) <-- meritev(i)
  i <-- i + 1
 dokler ni i>n
 meritev(i-1) <-- nova
*/

public class vaja7 {
    public static void main(String[] args) {
        int[] tabela = {5, 3, 1, 2, 7, 8};
        int nova = 9;
        int i = 2;

        tabela[i - 1] = nova;
        i++;

        while (i <= tabela.length) {
            tabela[i - 1] = tabela[i - 2];
            i++;
        }

        tabela[i - 2] = nova;

        for (int j = 0; j < tabela.length; j++) {
            System.out.print(tabela[j] + " ");
        }
    }
}
