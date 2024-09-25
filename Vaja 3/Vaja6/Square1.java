public class Square1 {
    public static void main(String[] args) {
        int corner1x = Integer.valueOf(args[0]);
        int corner1y = Integer.valueOf(args[0]);

        int corner2x = Integer.valueOf(args[1]);
        int corner2y = Integer.valueOf(args[1]);

        int pointx = Integer.valueOf(args[2]);
        int pointy = Integer.valueOf(args[3]);

        if (corner1x < pointx && pointx < corner2x && corner1y < pointy && pointy < corner2y
                || corner2x < pointx && pointx < corner1x && corner2y < pointy && pointy < corner1y) {
            System.out.println("Točka je znotraj kvadrata.");
        } else if ((pointx == corner1x || pointx == corner2x) && corner1y <= pointy && pointy <= corner2y
                || (pointy == corner1y || pointy == corner2y) && corner1x <= pointx && pointx <= corner2x) {
            System.out.println("Točka je na robu kvadrata.");
        } else {
            System.out.println("Točka je zunaj kvadrata.");
        }
    }
}
