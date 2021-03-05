public class Point {
    private double x;
    private double y;
    public static int counter = 1;
    private int ID;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        ID = counter++;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //private -> package private "nothing" -> protected -> public
    public void move(double dx, double dy) {
        x += dx;
        y += dy;
        // int c;
    }

    public void mirror(double cx, double cy) {
        x = 2*cx - x;
        y = 2*cy - y;
    }

    public void mirror(Point p) {
        x = 2 * p.x - x; 
        y = 2 * p.y - y; 
    }

    public double distance(Point p) {
        double resX = x - p.x;
        double resY = y - p.y;
        return Math.sqrt(resX*resX + resY*resY);
    }

    public static double distance(Point p1, Point p2) {
        double resX = p1.x - p2.x;
        double resY = p1.y - p2.y;
        return Math.sqrt(resX*resX + resY*resY);
    }

    @Override
    public String toString() {
        return ID + ":(" + x + "," + y + ")";
    }

    public static Point centerOfMass(Point[] pointArray) {
        double centerX = 0;
        double centerY = 0;

        for(int i=0; i<pointArray.length; i++) {
            centerX += pointArray[i].getX();
            centerY += pointArray[i].getY();
        }

        centerX /= pointArray.length;
        centerY /= pointArray.length;

        return new Point(centerX, centerY);
    }

}