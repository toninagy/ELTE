public class PointMain {
    public static void main(String[] args) {
        Point[] pointArray = new Point[3];

        for(int i=0; i<3; ++i) {
            double x = Double.parseDouble(System.console().readLine());
            double y = Double.parseDouble(System.console().readLine());

            pointArray[i] = new Point(x,y);
            System.out.println(pointArray[i]);
        }

        // double centerX = 0;
        // double centerY = 0;

        // for(int i=0; i<3; i++) {
        //     centerX += pointArray[i].getX();
        //     centerY += pointArray[i].getY();
        // }

        // centerX /= 3;
        // centerY /= 3;

        Point center = Point.centerOfMass(pointArray);
        System.out.println(center);
    }
}
