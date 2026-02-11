/* 
 Malo začinimo nalogo 3 te vaje in jo vizualizirajmo. Uporabili bomo tehnologijo (ogrodje) FX, točke pa vizualizirali kot krožnico z radijem 3.
 Da ne bo pretežko, je na voljo del programa z izrisanim koordinatnim sistemom in eno točko (krožnico). 
 Predlagam, da uporabite točke, kot v nalogi 3, FX pa uporabite zgolj kot vizualizacijo. Naprej preglejte naslednje:

- dodajte 150 točk (tabela 150 točk)
- po dodajanju skušajte vizualizirati
- po kreiranju točk določite najbolj oddaljeno, določite črto med to točko in 0,0, jo dodajte v grupo g, - vizualizirajte
- po določitvi črte, poiščite točko najbližjo povprečju razdalje, obarvajte (fill) jo zeleno

* seveda je celoten zahtevan izpis iz naloge 3 v konzoli (terminalu) še vedno zaželen, ni pa obvezen, ker imamo sedaj drug način vizualizacije
*/
import java.util.Random;

public class vaja5 {

    static class TTocka {
        double x, y;

        TTocka(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    private TTocka[] points;
    private TTocka mostDistant;
    private TTocka closestToAverage;

    public vaja5() {
        // Add 150 points
        points = new TTocka[150];
        Random rand = new Random();
        for (int i = 0; i < points.length; i++) {
            points[i] = new TTocka(rand.nextDouble() * 500 - 250, rand.nextDouble() * 500 - 250);
        }

        // Find the most distant point from (0,0)
        mostDistant = points[0];
        double maxDistance = 0;
        for (TTocka point : points) {
            double distance = Math.sqrt(point.x * point.x + point.y * point.y);
            if (distance > maxDistance) {
                maxDistance = distance;
                mostDistant = point;
            }
        }

        // Find the point closest to the average distance
        double totalDistance = 0;
        for (TTocka point : points) {
            totalDistance += Math.sqrt(point.x * point.x + point.y * point.y);
        }
        double averageDistance = totalDistance / points.length;

        closestToAverage = points[0];
        double minDifference = Math.abs(Math.sqrt(points[0].x * points[0].x + points[0].y * points[0].y) - averageDistance);
        for (TTocka point : points) {
            double distance = Math.sqrt(point.x * point.x + point.y * point.y);
            double difference = Math.abs(distance - averageDistance);
            if (difference < minDifference) {
                minDifference = difference;
                closestToAverage = point;
            }
        }

        // Print results
        System.out.println("Most distant point: (" + mostDistant.x + ", " + mostDistant.y + ")");
        System.out.println("Point closest to average distance: (" + closestToAverage.x + ", " + closestToAverage.y + ")");

        // Visualize the points on a grid
        char[][] canvas = new char[50][50];
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
            canvas[i][j] = ' ';
            }
        }

        // Plot all points as '.'
        for (TTocka point : points) {
            int x = (int) ((point.x + 250) / 10);
            int y = (int) ((point.y + 250) / 10);
            if (x >= 0 && x < 50 && y >= 0 && y < 50) {
            canvas[y][x] = '.';
            }
        }

        // Plot the most distant point as 'O'
        int mostDistantX = (int) ((mostDistant.x + 250) / 10);
        int mostDistantY = (int) ((mostDistant.y + 250) / 10);
        if (mostDistantX >= 0 && mostDistantX < 50 && mostDistantY >= 0 && mostDistantY < 50) {
            canvas[mostDistantY][mostDistantX] = 'O';
        }

        // Plot the closest to average point as 'X'
        int closestToAverageX = (int) ((closestToAverage.x + 250) / 10);
        int closestToAverageY = (int) ((closestToAverage.y + 250) / 10);
        if (closestToAverageX >= 0 && closestToAverageX < 50 && closestToAverageY >= 0 && closestToAverageY < 50) {
            canvas[closestToAverageY][closestToAverageX] = 'X';
        }

        // Print the canvas with a big cross at the center using '|' and '-'
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
            if (i == 25) {
                System.out.print('-');
            } else if (j == 25) {
                System.out.print('|');
            } else {
                System.out.print(canvas[i][j]);
            }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new vaja5();
    }
}

