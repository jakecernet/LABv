/* 
    V razredu imate sedaj opredeljeni dve metodi kvadrat():
        kvadrat/3 : kvadrat(int,char,char) in
        kvadrat/2 : kvadrat(int,char)
    Primera klicev posameznih metod sta podana v nalogi 6b.
    Zanima nas:
        a) Ali lahko metodo kvadrat() kličemo zgolj z enim argumentom (int ali char)?
        b) Ali lahko metodo kvadrat() kličemo s 4 argumenti npr. int,char,char, int ?
        c) Ali lahko metodo kvadrat/2 pokličemo z argumentoma double, char, (recimo:
           kvadrat(5.5,'+') ?
        d) Ali lahko metodo kvadrat/2 pokličemo z argumentoma int, int (recimo:
           kvadrat(10,65) ?
        e) Ali lahko metodo kvadrat/2 pokličemo z argumentoma char, char (recimo:
           kvadrat('!','!') ?
    Obrazložite dobljene rezultate.

    a) Ne, ker imamo dve metodi z enakim imenom in različnim številom argumentov.
    b) Ne, ker imamo dve metodi z enakim imenom in različnim številom argumentov.
    c) Ne, ker je prvi argument tipa double, metoda pa pričakuje int.
    d) Ne, ker je drugi argument tipa int, metoda pa pričakuje char.
    e) Ne, ker sta oba argumenta tipa char, metoda pa pričakuje int in char.
*/
