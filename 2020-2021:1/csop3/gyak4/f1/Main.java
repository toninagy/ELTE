import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Point[] pointsArray = new Point[3];
        // Point pointsArray2[] = new Point[3];
        // Point[] pointsArray3 = new Point[]{new Point(3.3,4.4), new Point(1.1,2.2)};

        for(int i=0; i<3; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            pointsArray[i] = new Point(x,y);
        }

        // double centerX = 0.0;
        // double centerY = 0.0;

        // for(int i=0; i<3; i++) {
        //     centerX += pointsArray[i].getX();
        //     centerY += pointsArray[i].getY();
        // }

        // Point centerOfMassPoint = new Point(centerX/3, centerY/3);

        Point centerOfMassPoint = Point.calculateCenterOfMass(pointsArray);

        System.out.println(centerOfMassPoint.getX());
        System.out.println(centerOfMassPoint.getY());

    }
}
