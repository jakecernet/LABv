/* 
Lik specializiramo v krožnico (Krogec) s tem da dodamo lastnosti, ki opredelijo krožnico : 
središče(ravninska koordinata), radij (neceloštevilska vrednost). Npr.
class Krogec extends Lik {
   int centerX, centerY;
   double radij;   
}
a) preskusite, če lahko Krogec naredite s 'privzetim konstruktorjem', kot npr.: Krogec k = new Krogec();
   Če se da, izpišite vrednosti VSEH lastnosti iz objekta 'k' in preverite, če deluje enako, kot konstruktor
   brez argumentov baznega razreda (Lik).
b) dodajte v definicijo Krogec kontruktor : Krogec(){super();} . Ponovite zahteve pod alinejo a). Kaj opazite.
c) dodajte lasten konstruktor (preobložitev/overload), ki bo ob kreiranju objekta vrste Krogec tega inicializiral s središčem, smerjo
   gibanja in radijem. Prijemališče lika/krožnice naj bo podano središče. Prijemališče in smer inicializirajte
   s klicem konstruktorja baznega razreda (Lik-a).
d) preverite, ali delujejo funkcije obračanja smeri podedovane iz Lik
e) preverite, ali deluje funkcija izpisa Krogca, kadar ga želite izpisati kot : System.out.println(k); 
*/

public class vaja3 {
   static class Lik {
      private int x;
      private int y;
      private Smer smer;

      public Lik() {
         this.x = 0;
         this.y = 0;
         this.smer = new Smer("gor");
      }

      public Lik(int x, int y, String smer) {
         this.x = x;
         this.y = y;
         this.smer = new Smer(smer);
      }

      public void obrniDesno() {
         smer.obrniDesno();
      }

      public void obrniLevo() {
         smer.obrniLevo();
      }

      public void narediKorak(int koraki) {
         switch (smer.getSmer()) {
            case "gor":
               y += koraki;
               break;
            case "desno":
               x += koraki;
               break;
            case "dol":
               y -= koraki;
               break;
            case "levo":
               x -= koraki;
               break;
         }
      }

      public String toString() {
         return "Lik{" +
               "x=" + x +
               ", y=" + y +
               ", smer=" + smer.getSmer() +
               '}';
      }

      private static class Smer {
         private String smer;

         public Smer(String smer) {
            this.smer = smer;
         }

         public String getSmer() {
            return smer;
         }

         public void obrniDesno() {
            switch (smer) {
               case "gor":
                  smer = "desno";
                  break;
               case "desno":
                  smer = "dol";
                  break;
               case "dol":
                  smer = "levo";
                  break;
               case "levo":
                  smer = "gor";
                  break;
            }
         }

         public void obrniLevo() {
            switch (smer) {
               case "gor":
                  smer = "levo";
                  break;
               case "levo":
                  smer = "dol";
                  break;
               case "dol":
                  smer = "desno";
                  break;
               case "desno":
                  smer = "gor";
                  break;
            }
         }
      }

   }

   static class Krogec extends Lik {
      private int centerX;
      private int centerY;
      private double radij;

      public Krogec() {
         super();
         this.centerX = 0;
         this.centerY = 0;
         this.radij = 1.0; // privzeti radij
      }

      public Krogec(int centerX, int centerY, double radij) {
         super(centerX, centerY, "gor"); // klic konstruktorja baznega razreda
         this.centerX = centerX;
         this.centerY = centerY;
         this.radij = radij;
      }

      public Krogec(int centerX, int centerY, String smer, double radij) {
         super(centerX, centerY, smer); // klic konstruktorja baznega razreda
         this.centerX = centerX;
         this.centerY = centerY;
         this.radij = radij;
      }

      public void obrniDesno() {
         super.obrniDesno();
      }

      public void obrniLevo() {
         super.obrniLevo();
      }

      public void narediKorak(int koraki) {
         super.narediKorak(koraki);
      }
   }

   public static void main(String[] args) {
      // a) Preskusimo privzeti konstruktor
      Krogec k = new Krogec();
      System.out.println(k); // Izpis vseh lastnosti

      // b) Preskusimo konstruktor s super()
      Krogec k2 = new Krogec(5, 5, "desno", 2.0);
      System.out.println(k2); // Izpis vseh lastnosti

      // c) Preskusimo funkcije obračanja smeri
      k2.obrniDesno();
      System.out.println("Po obračanju desno: " + k2);

      k2.obrniLevo();
      System.out.println("Po obračanju levo: " + k2);

      // d) Naredimo korak
      k2.narediKorak(3);
      System.out.println("Po koraku: " + k2);
   }
}