
# Naloga 1
Dana je sekvenca programskih stavkov:
```java
int i = 5;
int[] t;
t = new int[5];
System.out.println(t[0]);
System.out.println(t.length);
t[t.length - 3] = 5;
```
Ugotovite in označite:
- Kateri stavek izpiše število elementov v tabeli.
- Kateri v srednji element tabele vpiše vrednost 5.
- Kateri izmed stavkov deklarira tabelo.
- Kateri izmed stavkov predstavi vrednost prvega elementa tabele.
- Kateri izmed stavkov rezervira prostor za 5 elementov tabele.

---

# Naloga 2
Recimo, da zaporedje iz naloge 1 razširimo z:
```java
t = new int[12];
t[12] = 12;
t[-2] = 12;
```
Kateri izmed naštetih so lahko uspešni in kateri ne? Obrazložite.

---

# Naloga 3
- Deklarirajte tabelo znakov.
- Ustvarite tabelo celih števil z dvanajstimi elementi.
- Rezervirajte prostor za 10 celih števil v tabeli znakov.
- Deklarirajte tabelo logičnih vrednosti.
- Za tabelo logičnih vrednosti rezervirajte prostor v pomnilniku velikosti 15.
- Inicializirajte tabelo logičnih vrednosti, da bodo vsi elementi imeli vrednost `false`, zgolj zadnji vrednost `true`.
- Ustvarite tabelo necelih števil z vrednostmi `12.5`, `3.33`, `4.0`, `12` in `31.13`.

---

# Naloga 4
Dani sta tabeli:
```java
int[] it = new int[5];
boolean[] bt = new boolean[5];
```
Spišite sekvenco stavkov, ki bo izpisala vrednosti prvega in zadnjega elementa obeh tabel. Kakšne so te vrednosti?

---

# Naloga 5
Dano je zaporedje: `5, 10, 25, 60, 145, 350, ...`.
- Napišite program, ki v tabelo vpiše prvih 10 elementov zaporedja in nato izpiše vsebino tabele od največjega do najmanjšega elementa.
- V zaporedju sta prva dva elementa dana, vse ostale pa je moč izračunati s pomočjo predhodnih dveh.

---

# Naloga 6
a) Napišite program, s katerim v tabelo vpišete 20 naključnih samoglasnikov. Nato izpišite vsebino tabele, črko, ki se nahaja na začetku in črko, ki se nahaja na koncu tabele.

b) Predelajte zgornji program tako, da bo velikost tabele neko naključno število iz intervala `[10..20]`. Nato izpišite vsebino tabele, črki, ki se nahajata na začetku tabele in črki, ki se nahajata na koncu tabele. Glej primer:

---

# Naloga 7
Spišite razredno metodo, ki ji s klicem posredujete celoštevilsko vrednost s pomenom letnice rojstva. Metoda v tabelo štirih celih števil vpiše števke, ki se nahajajo v letnici rojstva. Nato oba podatka, letnico in tabelo, zaporedno izpiše v naslednji obliki:
```
Letnica rojstva: 1995
Razčlenjena letnica rojstva: 1 – 9 – 9 – 5
```

---

# Naloga 8
Razredni metodi s klicem posredujete velikost. Ta v izvajanju v tabelo znakov posredovane velikosti vpiše naključne črke po pravilu:
- Na lihih indeksih tabele morajo biti samoglasniki.
- Na sodih indeksih tabele morajo biti soglasniki.

Po končanem vpisu metoda izpiše vsebino tabele.

---

# Naloga 9
a) Narišite pomnilniško sliko naslednjega programa.
```java
public class MyClass {
  public static void main(String[] args) {
    int[] t1 = {1, 2, 3, 4};
    int[] t2 = t1;
    t2[1] = 6;
    t2[3] = 9;
    int i = 0;
    System.out.print("Prva tabela: ");
    for (i = 0; i < t1.length; i++) {
      System.out.print(t1[i] + " ");
    }
    System.out.println();
    System.out.print("Druga tabela: ");
    for (i = 0; i < t2.length; i++) {
      System.out.print(t2[i] + " ");
    }
  }
}
```

b) Kaj izpiše ta program?

c) Popravite program tako, da v resnici dela z dvema objektoma `t1` in `t2`, oz. da bo vsebina tabele `t1` `1, 2, 3, 4` in vsebina tabele `t2` `1, 6, 3, 9`.

Opomba: lahko si pomagate s programom Jeliot 3 za animacijo in vizualizacijo izvajanja javanskega programa.

---

# Naloga 10
V nekem razredu je `n` dijakov. `n` je lahko celo število iz intervala `[25..34]`. Napišite program, ki omogoča vnos uspehov dijakov. Veljavni uspehi so: `"nzd"`, `"zd"`, `"db"`, `"pd"`, `"odl"` ali `"neoc"`. Nato program izpiše posamezne uspehe in za vsak rang uspeha/uspeh število dijakov. Primer izpisa:
```
Uspehi: 2, 1, 1, 1, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 2, 4, 5, 5, neoc, 5, ....
Nezadostni: 3
Zadostni: 5
Dobri: 10
Pravdobri: 7
Odlični: 3
Neocenjeni: 2
```