/* a) Napišite sled izvajanja spodnjega programa.

    Sled izvajanja:
    1. i = 1
    2. i <= 15
    3. i = 2
    4. i <= 15
    5. i = 3
    6. i <= 15
    7. i = 4
    8. i <= 15
    9. i = 5
    10. i <= 15
    11. i = 6
    12. i <= 15
    13. i = 7
    14. i <= 15
    15. i = 8
    16. i <= 15
    17. i = 9
    18. i <= 15
    19. i = 10
    20. i <= 15
    21. i = 11
    22. i <= 15
    23. i = 12
    24. i <= 15
    25. i = 13
    26. i <= 15
    27. i = 14
    28. i <= 15
    29. i = 15
    30. i <= 15
    31. i = 16
    32. Konec programa

b) Ugotovite, kaj izpiše.
    
    Izpiše: !!!*!!!*!!!*!!*

c) Kaj se spremeni, če v zanki pred if dodamo ukaz za negacijo spremenljivke pogoj? Razložite
odgovor.
    
    Če dodamo ukaz za negacijo spremenljivke pogoj, se izpiše: *!!!*!!!*!!!*!!!, saj se vrednost
    spremenljivke pogoj spremeni iz true v false in obratno.
    
d) Kaj se spremeni, če v zanki pred if spremenimo vrednost spremenljivke pogoj v
(!pogoj)?!pogoj:pogoj;? Razložite odgovor.

    Če spremenimo vrednost spremenljivke pogoj v (!pogoj)?!pogoj:pogoj;, se izpiše: !!!*!!!*!!!*!!!,
    saj se vrednost spremenljivke pogoj spremeni iz true v false in obratno.


*/

public class Naloga1 {
    public static void main(String[] args) {
        int i;
        boolean pogoj;
        for (i = 1; i <= 15; i++) {
            pogoj = (i % 4 == 0) || (i % 3 == 0) && (i % 5 == 0);
            // c// pogoj = !pogoj;
            // d// pogoj = (!pogoj)?!pogoj:pogoj;
            if (pogoj)
                System.out.print('*');
            else
                System.out.print('!');
        }
    }
}