public class Point {
    public double x;
    public double y;

    private static int ID = 1;
    private int myID;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        myID = ID++;
    }

    public Point(){}

    // public Point(Point p) {
    //     this.x = p.x;
    //     this.y = p.y;
    // }

    //private -> "nothing" package private -> protected -> public 
    void move(double x, double y) {
        this.x += x;
        this.y += y;
    } 

    void mirror(double cx, double cy) {
        x = 2*cx - x;
        y = 2*cy - y;
    }

    void mirror(Point p) {
        this.x = 2*p.x - this.x;
        this.y = 2*p.y - this.y;
    }

    double distance(Point p) {
        double dx = x - p.x;
        double dy = y - p.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    @Override
    public String toString() {
        return myID + ":(" + x + "," + y + ")";
    }

    public static Point centerOfMass(Point[] pointArray) {
        double centerX = 0;
        double centerY = 0;

        for(int i=0; i<pointArray.length; i++) {
            centerX += pointArray[i].x;
            centerY += pointArray[i].y;
        }

        return new Point(centerX/pointArray.length, centerY/pointArray.length);
    }
}