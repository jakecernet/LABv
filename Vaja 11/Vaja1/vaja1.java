/* 
    Spišite funkcijo najblizjaPotenca2stevilu, ki kot argument prejme celoštevilsko vrednost.
    Funkcija ugotovi, kateremu številu, ki je potenca števila 2 je vneseno število najbližje in njegovo potenco vrne.
    npr.: 9 > 8=2^3 && 16=2^4 > 9, torej vrne 3
    npr.: 15 < 16=2^4 && 8=2^3 < 15, torej vrne 4
*/

public class vaja1 {
    public static void main(String[] args) {
        System.out.println(najblizjaPotenca2stevilu(Integer.parseInt(args[0])));
    }

    public static int najblizjaPotenca2stevilu(int stevilo) {
        int potenca = 0;
        int steviloNaPotenco = 1;
        while (steviloNaPotenco < stevilo) {
            steviloNaPotenco *= 2;
            potenca++;
        }
        if (Math.abs(steviloNaPotenco - stevilo) > Math.abs(steviloNaPotenco / 2 - stevilo)) {
            potenca--;
        }
        return potenca;
    }
}