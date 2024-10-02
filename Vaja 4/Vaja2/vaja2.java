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
x = "O"
y = "A"

----------------
2. krog:
----------------
x = "M"
x = "K"
izpis: "K"

----------------
3. krog:
----------------
x = "I"
x = "G"
izpis: "G"

----------------
4. krog:
----------------
x = "E"
x = "C"
izpis: "C"

----------------
5. krog:
----------------
x = "A"
x = "A"
izpis: "A"

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
