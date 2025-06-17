# LAV03 Laboratorijska vaja 19  
*(draft, mar. 2025)*  

## Vsebina  
- Objekti  
- Specializacija (izkoriščanje dedovanja)  
- Polimorfizmi (vsled dedovanja)  
- Programska dokumentacija (API) in generiranje dokumentacije  

---

## Naloga 1  
Objekt vrste `Smer` predstavlja trenutno smer gibanja lika, s katerim je povezan. Gibanje je ravninsko in zgolj ortogonalno (recimo vzporedno z osmi koordinatnega sistema ravnine).  

- Vektor (normaliziran) gibanja je/sta privatni lastnosti objekta in lahko zavzema samo 4 vrednosti, za vsako od smeri po ena.  
- Tipično objekt vrste `Smer` inicializiramo z smerjo gibanja. Objektu, ki ga ne inicializiramo s smerjo, določimo privzeto smer gibanja `'desno'`.  
- Za vsako komponento vektorja gibanja mora obstajati vračalec (getter).  
- Zagotovite možnost kontroliranega izpisa objekta na zaslon.  
- Objekt vsebuje metodi `obrniLevo()` in `obrniDesno()`, ki popravita smer tako, da v prvem primeru "zasuka" smer za 90 stopinj v smeri nasprotni urinemu kazalcu, v drugem pa za 90 stopinj v smeri urinega kazalca.  
---
### Naloge:  
- a) Iz opisa konstruirajte ustrezen razred, kreirajte par objektov te vrste in preskusite:  
   - Omejitve pri konstrukciji objekta  
   - Zmožnost spreminjanja smeri v skladu z opisom  
   *(Preskus in dokazovanje delovanja sta v vaši domeni.)*  

- b) Izrišite razredni diagram za razred `Smer`.  

---

## Naloga 2  
`Lik` v tej nalogi bo dokaj abstraktna zadeva. Ni opredeljen z obliko, temveč zgolj s pozicijo v ravnini in smerjo gibanja, ki jo določa vsebovan objekt vrste `Smer`.  

- Vse lastnosti vsakega `Lik-a` so privatne.  
- `Lik` kreiramo tako, da mu podamo pozicijo v ravnini in smer gibanja.  
  - Če smeri ne podamo, se uporabi privzeta smer.  
  - Če `Lik` kreiramo brez argumentov, se postavi v izhodišče koordinatnega sistema s privzeto smerjo gibanja.  
- Javna metoda `premakni()` premakne objekt za 1 v trenutno z objektom določeni smeri gibanja.  
- Javni metodi `obrniLevo()` in `obrniDesno()` lik obrneta, kot je opisano v `Smer`.  
- Za pozicijo lika mora v objektu obstajati ustrezen vračalec.  
---
### Naloge:  
- a) Iz opisa konstruirajte ustrezen razred, kreirajte par objektov te vrste in preskusite:  
   - Premikanje  
   - Zmožnost spreminjanja smeri pri gibanju lika  

- b) Izrišite razredni diagram *(nivo podrobnosti: omejite vsebino na zgolj javne člane)*.  

---

## Naloga 3  
`Lik` specializiramo v krožnico (`Krogec`) s tem, da dodamo lastnosti, ki opredelijo krožnico:  
- Središče (ravninska koordinata)  
- Radij (neceloštevilska vrednost)  

```java
class Krogec extends Lik {
   int centerX, centerY;
   double radij;   
}
```
---
### Naloge:  
- a) Preskusite, če lahko `Krogec` naredite s "privzetim konstruktorjem", kot npr.:  
   ```java
   Krogec k = new Krogec();
   ```  
   Če se da, izpišite vrednosti VSEH lastnosti iz objekta `k` in preverite, če deluje enako kot konstruktor brez argumentov baznega razreda (`Lik`). 

  ---
- b) Dodajte v definicijo `Krogec` konstruktor:  
   ```java
   Krogec() { super(); }
   ```  
   Ponovite zahteve pod alinejo a). Kaj opazite?  

   ---
- c) Dodajte lasten konstruktor (preobložitev/overload), ki bo ob kreiranju objekta vrste `Krogec` tega inicializiral s središčem, smerjo gibanja in radijem. Prijemališče lika/krožnice naj bo podano središče. Prijemališče in smer inicializirajte s klicem konstruktorja baznega razreda (`Lik-a`).  

   ---
- d) Preverite, ali delujejo funkcije obračanja smeri podedovane iz `Lik`.  

   ---
- e) Preverite, ali deluje funkcija izpisa `Krogca`, kadar ga želite izpisati kot:  
   ```java
   System.out.println(k);
   ```  

---

## Naloga 4  
Metoda `toString` v `Krogec` ni ustrezna. Radija ne dobite vizualiziranega. Popravite mehanizem tako, da se bo izpisal še radij krožnice. *(Prekrivanje/override metode)*  

---

## Naloga 5  
V definicijo `Krogec` dodajte metodi, ki bosta izračunali in vrnili obseg ter ploščino krožnice na osnovi radija zapisanega v objektu.  

---

## Naloga 6  
Naredite še specializacijo `Lik` v `Trikotnik`. Ta je opredeljen s koordinatami svojih oglišč.  

- Eno izmed oglišč je tudi vedno prijemališče tega lika.  
- Ustrezno opredelite potrebne konstruktorje in pazite, da se bo trikotnik ob premiku tudi ustrezno premaknil.  
- Vsa ostala funkcionalnost naj bo enakovredna tisti pri `Krogec`, ključno z izračunom ploščine in obsega.  

---

## Naloga 7  
Ponovite 3. in 4. nalogo 18. vaje. Pri realizaciji kolekcije naredite 2 tabeli; ločeno za `Trikotnike` in `Krogce`.  

**Če se vam da:**  
Uporabite tabelo likov, kot je v vaja18/3, nato v tabelo dodajajte naključno trikotnik ali krogec. Pri premikanju in vizualizaciji, ko imate dostop do elementa tabele, glede na to, ali je v tabeli vpisan `Trikotnik` ali `Krogec` (`t[i] instanceof Trikotnik`), izvedite vsiljeno pretvorbo v ta tip in šele nato npr. vizualizacijo objekta.  
