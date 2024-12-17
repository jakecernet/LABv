/* 
    Metoda razreda statZnakov/1 na podani tabeli izvede statistiko pojavitev posameznih črk v tabeli. 
    Statistiko izmed vseh znakov zapisanih v tabeli izvajate zgolj za črkovne znake, pri čemer 'a' in 'A' 
    predstavljata isto črko. Rezultat izvedbe naj bo tabela, ki za vsako zahtevano črko vsebuje število 
    njenih pojavitev. Metoda naj to metodo vrne klicočemu delu programa. Lahko uporabite 
    poenostavitev in uporabite zgolj angleško abecedo. 
    /uporabite (direktno) razprševanje : črk je v ang. Abecedi 26, torej potrebujete tabelo števil te 
    velikosti; A je prva črka in njene pojavitve zapisujemo na 1. el tabele (indeks 0), B druga itd. .. A in a 
    preslikamo v isti element (o)... torej je logika : if(crka=='A' || or crka=='a') tabelaStevil[ 0 ]++;
*/

public class vaja11 {
    public static void main(String[] args) {
        char[] tabela = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        int[] tabelaStevil = statZnakov(tabela);
        for (int i = 0; i < tabelaStevil.length; i++) {
            System.out.println((char) (i + 65) + " : " + tabelaStevil[i]);
        }
    }

    public static int[] statZnakov(char[] tabela) {
        int[] tabelaStevil = new int[26];
        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] >= 'A' && tabela[i] <= 'Z') {
                tabelaStevil[tabela[i] - 65]++;
            } else if (tabela[i] >= 'a' && tabela[i] <= 'z') {
                tabelaStevil[tabela[i] - 97]++;
            }
        }
        return tabelaStevil;
    }    
}
