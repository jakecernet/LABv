# lav03: Laboratorijska vaja 22  
*(draft, mar. 2025)*  

---
### 1. Izdelava igralne karte  
- Ustvarite igralno karto z licem in hrbtom.  
    - Lice predstavlja slika igralne karte (npr. srce 7 oz. H7).  
    - Hrbet predstavlja uniformno izbrana slika za celoten kupček kart.  
- Poiščite slike za karte na spletu.  
- Prilagodite konstrukcijo karte, da omogoča podajanje dveh slik.  
- Dodajte naslednje javne metode:  
    - `zamenjaj()`: Zamenja lice s hrbtom ali obratno.  
    - `vrniVrednostKarte()`: Vrne vrednost in barvo karte, npr. H7.  
    - `vrniStanje()`: Pove, ali je karta obrnjena z licem ali hrbtom navzgor.  

- Vizualizirajte karto v testni FX aplikaciji in preskusite delovanje:  
    - S klikom na karto se mora zamenjati slika.  
    - V terminal (konzolo) izpišite rezultate izvedbe ostalih metod.  

- Pomagajte si z dokumentacijo:  [JavaFX Button Control](https://docs.oracle.com/javafx/2/ui_controls/button.htm)  

---
### 2. Razred Igra  
- Definira kupček igralnih kart in dve roki za dva igralca.  
- Inicializacija:  
    - 52 različne igralne karte.  
    - Dve roki za dva igralca (vsaka roka lahko drži po 5 kart).  

- Vizualizacija na namizju:  
    - Kupček kart.  
    - Roki igralcev (ločeno za oba igralca).  
    - Gumb.  

- Obnašanje aplikacije:  
    - Ob zagonu:  
        - Kupček vsebuje vse karte.  
        - Roki igralcev sta prazni.  
        - Karte kupčka so prikazane z licem navzgor.  
    - Pritisk na gumb:  
        - Karte se delijo iz kupčka med obe roki, izmenično po eno karto med oba igralca.  
        - Karte v rokah so prikazane z licem navzdol.  
    - Naslednji pritisk na gumb:  
        - Obstoječe karte rok igralcev se zavržejo.  
        - Dodelijo se nove karte.  

- Preverite:  
    - Ali lahko po peti delitvi (ob poskusu šeste delitve) zaključite z izvajanjem programa.  