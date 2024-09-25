public class Square2 {
    public static void main(String[] args) {
        int corner1x = (int) (Math.random() * 10);
        int corner1y = (int) (Math.random() * 10);

        int corner2x = (int) (Math.random() * 10);
        int corner2y = (int) (Math.random() * 10);

        int pointx = (int) (Math.random() * 10);
        int pointy = (int) (Math.random() * 10);

        System.out.println("corner1: (" + corner1x + ", " + corner1y + ")");
        System.out.println("corner2: (" + corner2x + ", " + corner2y + ")");
        System.out.println("point: (" + pointx + ", " + pointy + ")");

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
