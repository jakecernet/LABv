/* 
    a)	Spišite javanski program, ki bo ustvaril dva objekta vrste Oseba; prvi naj bo mirko(ime:Mirko), drugi sabina(ime:Sabina). Nato izpišite oba objekta kot: System.out.println(sabina); in System.out.println(mirko);
a.	Ali se objekta izpišeta ali program pri izpisu javi napako?
b.	Kako se oba objekta izpišeta ?
c.	Ali se pri ponovnem zagonu izpišejo za ista objekta iste vrednosti? Kako si to razlagate?
b)	V definicijo razreda Oseba dodajte metodo
public String toString(){
    return "oseba:< "+ime+","+priimek+","+spol+">";
}
Pri predpostavki, da so v Oseba definirane objektne lastnosti poimenovane ime, priimek,spol. 
Ponovno poskusite z izpisom iz dela a) te naloge in podajte  odgovore na vsa tri vsebovana podvprašanja.


odgovori:
a) Program se izvede brez napake.
b) Izpišeta se vrednosti atributa ime.
c) Pri ponovnem zagonu se izpišejo iste vrednosti, ker se atributi niso spreminjali.
*/

class Oseba {
    String ime;
    String priimek;
    String spol;

    public Oseba(String ime) {
        this.ime = ime;
    }

    @Override
    public String toString() {
        return "oseba:< " + ime + "," + priimek + "," + spol + ">";
    }
}

public class naloga4 {
    public static void main(String[] args) {
        Oseba mirko = new Oseba("Mirko");
        Oseba sabina = new Oseba("Sabina");

        System.out.println(sabina);
        System.out.println(mirko);
    }
}