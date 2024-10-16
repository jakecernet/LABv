/* Napiši program, ki prebere tri števila, nato preveri, koliko števil med prvim in drugim številom
(vključno-vključno) je deljivih s tretjim številom ter to izpiše. */

public class vaja1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int stevec = 0;
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                System.out.println("Število " + i + " je deljivo s številom " + c);
                stevec++;
            }
        }
        System.out.println("število števil med " + a + " in " + b + ", ki so deljiva s številom " + c + " je: " + stevec);
    }
}