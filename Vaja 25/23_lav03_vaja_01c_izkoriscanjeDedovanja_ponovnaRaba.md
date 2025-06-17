# lav03 Laboratorijska vaja 23  
*(draft, april 2025)*  

---
V nalogi 1 vaje 22 smo definirali karto kot gumb z dvema slikama, ki sta predstavljala lice in hrbet karte. Karta v tej nalogi implementira vmesnik `Obracalna`:

```java
interface Obracalna {
    public void obrni();              // zamenja lice s hrbtom in obratno
    public int vrniVrednostKarte();   // vrne vrednost karte: 2,3,4, …., 9,10,11,12,13,14 ne glede na barvo
    public char vrniBarvoKarte();     // vrne eno od H, D, S, C
    public boolean jeLice();          // vrne stanje obrnjenosti karte
}
```

---
## Naloga 1  
Izdelajte razred `Karta`, izveden iz `javafx.scene.controls.Button`, z dodatno lastnostjo **še ene slike**, ki bo implementiral zahteve danega vmesnika.  
- Gumb mora ob kliku zamenjati na sebi prikazano sliko.  
- Na gumbu naj ne bo ničesar razen slike.  
- Dogodek (klik) naj bo na gumb navezan ob konstrukciji objekta (karta je **clickable** tisti trenutek, ko jo naredimo).  

---
## Naloga 2  
Razred `Duel` implementira igro *Vojna*, igre za 2 igralca, pri kateri sta na mizi z licem obrnjeni zgolj dve karti, vsakega igralca po ena.  
- Večja karta zagotavlja vzetek obeh kart.  
- *Vojne* (stanja dveh enakih kart) v tej realizaciji ni potrebno implementirati.  
- Predpostavite, da je vrstni red barv: **H > D > S > C**.  

Igro realizirajte kot dogodkovno usmerjeno aplikacijo z dvema dodatnima gumboma:  
1. **Gumb za začetek igre**: postavi igro v začetni položaj.  
2. **Gumb za korak igre**: izvaja korak igre.  

---
### Korak igre  
Korak igre se izvede kot:  
1. Obrne karto igralca.  
   - Avtomatično se obrne tudi karta drugega igralca (računalnik).  
2. Zapis vzetka:  
   - Izračuna se, katera karta je večja.  
   - Vzetek se pospravi na kup vzetkov igralca z večjo karto.  
   - Preveri se morebiten konec igre.  
   - Preveri se, ali je igralcema zmanjkalo kart v roki:  
     - Zamenja se kup vzetkov z roko.  

> **Opomba:**  
> Gumb *korak* ima dve vlogi oz. dve stanji.  

---
### Dodatne zahteve  
- Igra se z 52 kartami (tabela 52 kart).  
- Zagotovite začetno mešanje z implementacijo:  

```java
interface Mesalna {
    public void premesajKarte();
}
```

- Ob inicializaciji igre se karte v roki razdelijo na pol (2x26).  
- Pričakuje se neenakomerna porazdelitev ob obratu:  
  - 2 tabeli po 52 kart (vzetki so neenakomerno porazdeljeni).  

---
### Implementacija  
Mešanje kart dodajte kot princip, ki ga je potrebno implementirati:  

```java
class Duel implements Mesalna {
    // Implementacija
}
```

Končna realizacija se prepušča izvedbi.
