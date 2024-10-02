/* Naloga 2 a)Napišite sled izvajanja danega programa.Na podlagi sledi ugotovite,kaj program izpiše.b)Program prepišite tako,da zanko do-while zamenjate z zanko while.
public class N04_02 {
    public static void main(String[] args) {
        char x = 'O'; // je črka O
        final char y = 'A'; // to je konstanta
        do {
            x--;
            x--;
            System.out.print(x);
        } while (x >= y);
    }
} */

/* 
Sled izvajanja:
----------------
1. krog:
----------------
x = "O" oz. 79
y = "A" oz. 65
izpis: /

----------------
2. krog:
----------------
x = "M" oz. 77
x = "K" oz. 75
izpis: "K"

----------------
3. krog:
----------------
x = "I" oz. 73
x = "G" oz. 71
izpis: "G"  

----------------
4. krog:
----------------
x = "E" oz. 69
x = "C" oz. 67
izpis: "C"

----------------
5. krog:
----------------
x = "A" oz. 65
x = "/" oz. 63
izpis: "/"

----------------
Konec izvajanja.
*/

public class vaja2 {
    public static void main(String[] args) {
        char x = 'O'; // je črka O
        final char y = 'A'; // to je konstanta
        while (x >= y) {
            x--;
            x--;
            System.out.print(x);
        }
    }
}
