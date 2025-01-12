/* 
    Funkcija, ki v tabeli 15 cifer poišče bloke trerh zaporednih sodih števil in izpiše število blokov.
*/

public class dn2 {
    public static void main(String[] args) {
        int tabela[] = new int[15];
        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = (int) (Math.random() * 10);
            System.out.print(tabela[i] + " ");
        }
        System.out.println();
        System.out.println("Število blokov: " + bloki(tabela));
    }
    
    public static int bloki(int[] tabela) {
        int stevec = 0;
        for (int i = 0; i < tabela.length - 2; i++) {
            if (tabela[i] % 2 == 0 && tabela[i + 1] % 2 == 0 && tabela[i + 2] % 2 == 0) {
                stevec++;
            }
        }
        return stevec;
    }
}
