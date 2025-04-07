package Vaja6;


/* 
Naredite še specializacijo Lik v Trikotnik. Ta je opredeljen s koordinatami svojih oglišč. Eno izmed oglišč
je tudi vedno prijemališče tega lika. Ustrezno opredelite potrebne konstruktorje in pazite, da se bo trkotnik
ob premiku tudi ustrezno premaknil. Vsa ostala funkcionalnost naj bo enakovredna tisti pri Krogec, ključno z
izračunom ploščine in obsega.
*/
import java.util.Arrays;

public class vaja6 {
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

      public String toString() {
         return "Krogec{" +
               "centerX=" + centerX +
               ", centerY=" + centerY +
               ", radij=" + radij +
               ", x=" + super.toString() +
               '}';
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

      public float obseg() {
         return (float) (2 * Math.PI * radij);
      }

      public float ploscina() {
         return (float) (Math.PI * radij * radij);
      }
   }

   static class Trikotnik extends Lik {
      private int[] xOglisca;
      private int[] yOglisca;

      public Trikotnik(int[] xOglisca, int[] yOglisca) {
         super(xOglisca[0], yOglisca[0], "gor"); // klic konstruktorja baznega razreda
         this.xOglisca = xOglisca;
         this.yOglisca = yOglisca;
      }

      public String toString() {
         return "Trikotnik{" +
               "xOglisca=" + Arrays.toString(xOglisca) +
               ", yOglisca=" + Arrays.toString(yOglisca) +
               ", x=" + super.toString() +
               '}';
      }

      public float obseg() {
         // Izračun obsega trikotnika
         return 0; // Placeholder, implementirajte dejanski izračun
      }

      public float ploscina() {
         // Izračun ploščine trikotnika
         return 0; // Placeholder, implementirajte dejanski izračun
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

      // e) Izračunamo obseg in ploščino
      System.out.println("Obseg kroga: " + k2.obseg());
      System.out.println("Ploščina kroga: " + k2.ploscina());

      System.out.println();

      // f) Preskusimo Trikotnik
      int[] xOglisca = { 0, 3, 0 };
      int[] yOglisca = { 0, 0, 4 };
      Trikotnik t = new Trikotnik(xOglisca, yOglisca);
      System.out.println(t); // Izpis vseh lastnosti

      // g) Izračunamo obseg in ploščino trikotnika
      System.out.println("Obseg trikotnika: " + t.obseg());
      System.out.println("Ploščina trikotnika: " + t.ploscina());

      // h) Premik trikotnika
      t.narediKorak(2);
      System.out.println("Po premiku: " + t);
   }
}
