## LAV03 Laboratorijska vaja 18 (draft, mar.2025)

### Vsebina

-   Objekti
-   Konstrukcija razredov/objektov glede na zahteve opisa
-   Interpretacija besedilnega opisa, predstavitev z razrednim diagramom
-   Getterji, setterji
-   'Vizualizacija' konstrukcije
-   Objekti z referenčnimi lastnostmi (lastni objekti)
-   Programska dokumentacija (API) in generiranje dokumentacije

---

### Naloga 1

---

Objekt vrste `Smer` predstavlja trenutno smer gibanja lika, s katerim je povezan. Gibanje je ravninsko in zgolj ortogonalno (recimo vzporedno z osmi koordinatnega sistema ravnine).  
Vektor (normaliziran) gibanja je/sta privatni lastnosti objekta in lahko zavzema samo 4 vrednosti, za vsako od smeri po ena.  
Tipično objekt vrste `Smer` inicializiramo z smerjo gibanja. Objektu, ki ga ne inicializiramo s smerjo, določimo privzeto smer gibanja 'desno'. Za vsako komponento vektorja gibanja mora obstajati vračalec (getter). Zagotovite možnost kontroliranega izpisa objekta na zaslon.  
Objekt vsebuje metodi `obrniLevo()` in `obrniDesno()`, ki popravita smer tako, da v prvem primeru 'zasuka' smer za 90 stopinj v smeri nasprotni urinemu kazalcu, v drugem pa za 90 stopinj v smeri urnega kazalca.

-   a) Iz opisa konstruirajte ustrezen razred, kreirajte par objektov te vrste in preskusite:

    -   Omejitve pri konstrukciji objekta
    -   Zmožnost spreminjanja smeri v skladu z opisom  
        _(Preskus in dokazovanje delovanja sta v vaši domeni)_

-   b) Izrišite razredni diagram za razred `Smer`.

---

### Naloga 2

---

Lik v tej nalogi bo dokaj abstraktna zadeva. Ni opredeljen z obliko, temveč zgolj s pozicijo v ravnini in smerjo gibanja, ki jo določa vsebovan objekt vrste `Smer`. Seveda so vse lastnosti vsakega `Lik`-a privatne.  
`Lik` kreiramo tako, da mu podamo pozicijo v ravnini in smer gibanja. V primeru, da smeri ne podamo, se uporabi privzeta smer.  
Če `Lik` kreiramo brez argumentov, se postavi v izhodišče koordinatnega sistema s privzeto smerjo gibanja.  
Javna metoda `premakni()` premakne objekt za 1 v trenutno z objektom določeni smeri gibanja.  
Javni metodi `obrniLevo()` in `obrniDesno()` lik obrneta, kot je opisano v `Smer`. Za pozicijo lika mora v objektu obstajati ustrezen vračalec.

-   a) Iz opisa konstruirajte ustrezen razred, kreirajte par objektov te vrste in preskusite:

    -   Premikanje
    -   Zmožnost spreminjanja smeri pri gibanju lika

-   b) Izrišite razredni diagram (nivo podrobnosti: omejite vsebino na zgolj javne člane).

---

### Naloga 3

---

Javanski program kreira 15 objektov tipa `Lik` in jih shrani v ustrezno tabelo. Pozicijo prvega lika ustvarite naključno v ravnini (obseg naj bo `[-50, 50][-50, 50]`). Vsak naslednji naj bo za 3 enote oddaljen v smeri, ki jo določa smer predhodnega.

-   a) Vizualizacija pozicij mora pokazati vrsto (daljica?).

-   b) Izvedite gibanje likov v smeri 'glave' zaporedja v tabeli (pomnite: smer je določal vedno element, ki je bil zadnji dodan
    v tabelo) za npr. 10 premikov.

    -   Nastavljalcev za objekt vrste `Lik` nimate, lahko pa naredite nov lik.
    -   Če bi odstranili prvi element tabele (indeks 0) in dodali nov element na mesto N v tabeli, bi se zaporedje
        navidezno premaknilo v smeri predhodno zadnjega elementa.
    -   Predlagam, da naredite krožno vrsto.

-   c) Preverite pravilnost delovanja še s postopkom:
    -   Naredite 10 korakov v dani smeri, nato `obrniDesno`, naredite še 10 korakov.

---

### Naloga 4

---

Za `Lik` (naloga 2) in `Smer` (naloga 1) izdelajte minimum programske dokumentacije.  
(V poročilu naj bo zgolj komentirana koda obeh razredov, ne pa tudi zgenerirana dokumentacija.)

-   Čarovnik za class v BlueJ je že tak, da se iz njega avtomatično generira dokumentacija.

-   `javadoc` je standardno orodje za generiranje programske dokumentacije. Uporabite kot:

    -   `javadoc ime_datoteke` ali `javadoc ime_paketa`
        (npr. `javadoc Test.java` ali `javadoc vaja18`, pri čemer je vaja18 paket oz. direktorij s tem imenom).
    -   Orodje zgenerira dokumentacijo za brskanje na spletu (HTML).
    -   BlueJ ponuja alternativo urejevalnik/dokumentacija (izbira desno nad urejevalnikom), pri
        čemer se generacija avtomatično generira ob preklopu v način dokumentacija.

-   Dokumentator upošteva strukturo razreda in posebno vrsto komentarjev, t.i. doc-bloke:

    ```java
    /**
     * Tole je doc block za metodo naredi.
     * Metoda ne naredi nič pametnega, je tu zgolj za demonstracijo.
     *
     * @param starost
     * @param velikost
     * @return novaStarost
     *
     * @author Ime Priimek
     * @version 0.01
     *
     * 'Komentar' je oblike /** --- */
     * Med koncem doc bloka in opisom NI nobene prazne vrstice (pripadnost).
     *
     * Opisujemo: razred, metodo, lastnost.
     */
    int naredi(int starost, int velikost) {
        return novaStarost;
    }
    ```
