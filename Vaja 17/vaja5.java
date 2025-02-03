/*  
    V razredu deklarirajte razredno tabelo stotih pozitivnih celih števil in spišite metodo, ki izpiše tiste
    elemente tabele, katerih vrednost se razlikuje od povprečja vrednosti vseh elementov tabele za več kot 10%.
    (opomba: povprečje tabele == povprečna vrednost elementov v tabeli)
*/

public class vaja5 {
    static int[] tabela = new int[100];

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            tabela[i] = (int) (Math.random() * 100);
        }

        izpisi(tabela);
        System.out.println();
        System.out.println("Povprečje: " + povprecje(tabela));
        System.out.println();
        System.out.println("Elementi, ki se razlikujejo od povprečja za več kot 10%: ");
        System.out.println();
        izpisiRazlike(tabela);
        System.out.println();
        System.out.println("Elementi, ki so znotraj 10% odstopanja od povprečja: ");
        System.out.println();
        izpisiValidne(tabela);
    }

    public static float povprecje(int[] tabela) {
        float povprecje = 0;
        for (int i = 0; i < tabela.length; i++) {
            povprecje += tabela[i];
        }
        return povprecje / tabela.length;
    }

    public static void izpisi(int[] tabela) {
        for (int i = 0; i < tabela.length; i++) {
            System.out.print(tabela[i] + " ");
        }
        System.out.println();
    }

    public static void izpisiRazlike(int[] tabela) {
        float povprecje = povprecje(tabela);
        for (int i = 0; i < tabela.length; i++) {
            if (Math.abs((float)tabela[i] - povprecje) > 10) {
                System.out.print(tabela[i] + " ");
            }
        }
        System.out.println();
    }

    public static void izpisiValidne(int[] tabela) {
        float povprecje = povprecje(tabela);
        for (int i = 0; i < tabela.length; i++) {
            if (Math.abs((float)tabela[i] - povprecje) < 10) {
                System.out.print(tabela[i] + " ");
            }
        }
        System.out.println();
    }
}
