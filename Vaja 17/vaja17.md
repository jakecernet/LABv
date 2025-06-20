# LAV03 Vaje 17
*(različica februar 2025)*

## Ponovitve
- enorazsežne tabele
- postopki iskanj, razvrščanj
- sklad
- razredni člani

---

Spodaj je 8 nalog, originalno zastavljenih v realizacijo s Pascal-om oz. C/C++ -om prevedenih za 
realizacijo z javanskim programskim jezikom. Naloge niso naše (no, nekatere dejansko so), avtorstvo 
nalog ni navedeno, je pa  pri vsaki navedena identifikacija v viru po katerem je bila povzeta.

---

> !- nobena izmed opomb ni del originalnega besedila nalog.  
> !- obvezna izvedba vseh nalog; pri nalogah, kjer imate specificiran original, je obvezna izvedba zgolj tega
>    dela (kot je bila originalno zastavljena naloga)

## NALOGA 1

Točka v ravnini je podana kot `(x[i],y[i],barva[i])`, pri čemer sta x in y ravninski koordinati, barva pa barva točke. 
Množico javanskih točk popisujejo javanske definicije:
```
int[] x, y;
char[] barva;
```

---
**original)**  Napišite zaporedje ukazov, katerih rezultat je številka kvadranta, v katerem se nahaja točka t.  
/izbira točke ni opredeljena, je pa ena izmed obstoječih točk/

Kvadranti so okoli ravninskega izhodišča porazdeljeni v smeri ccw:
```
       drugi    |     prvi
      --------(0,0)--------
       tretji   |   četrti
```

---

**a)** Spišite razredno metodo, ki kot argument prejme zaporedno št. točke (tabela!). Metoda določi kvadrant  
v katere leži točka in vrne njegovo številko. Če kvadranta ni mogoče določiti, naj metoda vrne vrednost 0. 
 
---
**b)** Razredna metoda `kateriNajvec/0` vrne številko tistega kvadranta, v katerem leži največ točk.  

---
**c)** Razredna metoda `najdaljVKvadrantu/1` za izbrani kvadrant vrne točko, ki je v tem kvadrantu najdlje od (0,0). 

---
**d)** Razredna metoda `kateriZNajdalj/0` vrne številko tistega kvadranta, v katerem leži točka, ki je najdlje od koordinatnega izhodišča.  

---
**e)** Razredna metoda `izpisiNajboljOddaljene/0` izpiše točke za vsakega izmed kvadrantov, ki so najbolj oddaljene  od koordinatnega izhodišča. Izpis naj bo v obliki:
```
I kvadrant - (x-koordinata,y-koordinata)   barva
II kvadrant - (x2-koordinata,y2-koordinata) barva2
...
```

---
**f)** Razredna metoda `vrniNajboljOddaljene/0` vrne točke, ki so v vsakem izmed kvadrantov najbolj oddajene.  

---
**g)** Razredna metoda `vrniDolzinoPoti/0` vrne dolžino ciklične poti, ki jo definira zaporeden obisk najbolj  
oddaljenih točk v vsakem izmed kvadrantov. Pot se prične v kvadrantu 1, nadaljuje zaporedno preko drugega,  tretjega, četrtega, nazaj do prvega.  

---
**h)** ‘rezultate’ metod iz c), f), g) bi želeli vizualizirati, grafično. Izberite eno izmed omenjenih in  
izvedite vizualizacijo (uporabite enega od načinov : besedilna grafika, Lantena, JavaFx)

---

## NALOGA 2

Napišite program, ki dobi celo število. Program števke prebranega števila zapiše v tabelo šetnajstih znakov tako, da so 
desno poravnane. V preostale celice tabele naj se vpišejo presledki.  
Primer:  če je vneseno/prebrano št. 1524, naj bo vsebina tabele:
```
----------------------------------------------------------------
|' '|' '|' '|' '|' '|' '|' '|' '|' '|' '|' '|' '|'1'|'5'|'2'|'4'|
----------------------------------------------------------------
```
pri negativni vrednosi -10599, naj bo vsebina tabele:
```
-----------------------------------------------------------------
|' '|' '|' '|' '|' '|' '|' '|' '|' '|' '|'-'|'1'|'0'|'5'|'9'|'9'|
-----------------------------------------------------------------
```
(opomba: znaki so enkapsulirani v `'...'`, da slučajno ne bi pozabili, da so v tabeli znaki.)

---

## NALOGA 3

Dana je metoda `pop/1` za jemanje vrednosti s sklada, ki je realiziran kot razredna metoda:
```java
static void pop(float[] x){
   if ( top > -1 ) {
     x[0] = sklad[top];
     top--;
   } else
      System.out.println("sklad je prazen");
} 
```

---
**original)**  Ugotovite, kam se sklad širi in kam kaže kazalec vrha sklada.

---
**a)** Kako metoda vrača vrednosti z vrha sklada? / kako je potrebno metodo klicati  

---
**b)** Ali je poskrbljeno za ‘pravilno’ vračanje vrednosti, ko je sklad prazen?

---

## NALOGA 4

Na osnovi sledi spreminjanja tabelarične spremenljivke `tabela` ugotovite, kateri algoritem je bil uporabljen
pri urejanju.

| prehod | tabela            |
|--------|-------------------|
| 0      | [2,8,9,3,1,6]     |
| 1      | [1,8,9,3,2,6]     |
| 2      | [1,2,9,3,8,6]     |
| 3      | [1,2,3,9,8,6]     |
| 4      | [1,2,3,6,8,9]     |
| 5      | [1,2,3,6,8,9]     |

---
**opombe:**  
a) izmed notranjih enostavnih postopkov  
b) zame: brez argumentacije ni rešitev vredna nič ( recimo: zakaj ne more biti eden ostalih dveh enostavnih)

---

## NALOGA 5

V razredu `Nal21` deklarirajte razredno tabelo stotih pozitivnih celih števil in spišite metodo, ki izpiše tiste
elemente tabele, katerih vrednost se razlikuje od povprečja vrednosti vseh elementov tabele za več kot 10%.
*(opomba: povprečje tabele == povprečna vrednost elementov v tabeli)*

---

## NALOGA 6

Dano imamo zaporedje: 1, 5, 6, 11, 17, 28, 45, …  
Napišite metodo, ki vrne n-ti člen tega zaporedja, pri tem je n argument metode.

---
*(opomba: n lahko omejite z N, pri tem pa naj N ne bo manjši od 100, s čimer zagotovite, da lahko dobite vsakega izmed prvih 100 členov. In da, zaporedje morate analizirati sami.)*

---

## NALOGA 7

Imamo enorazsežno tabelo meritev dolžine `n (n=6)` z vsebino:
```
-------------
|5|3|1|2|7|8|
-------------
```
Kakšna bo vsebina tabele po izvedbi naslednjega algoritma, če za vrednost spremenljivke `nova` vpišemo 9?
```
začetek:
 vpiši nova
 i <-- 2
 ponavljaj
  meritev(i-1) <-- meritev(i)
  i <-- i + 1
 dokler ni i>n
 meritev(i-1) <-- nova
```
*(opomba: program zgoraj ni izvedljiv na stroju. Lahko ga za test prepišete v javansko kodo, izvedete in … )*

---

## NALOGA 8

**original)**  V javanskem programskem jeziku napišite program, ki izpiše naravna števila iz intervala `[1,100000]`, ki so enaka vsoti kubov svojih števk.  

Npr.: `153 = 1^3 + 5^3 + 3^3`.

---
**a)** Spišite razredno metodo, ki vrne število naravnih števil iz intervala `[1,N]`, ki so enaka vsoti kubov svojih števk. `N` naj se določi pri klicu metode.  

---
**b)** Vse števke, ki ustrezajo kriteriju v osnovni nalogi iz intervala `[1..N]` bi želeli shraniti v tabelo ustrezne
dolžine (mišljeno je ravno prav dolge). Spišite metodo, ki bo to storila.

---