import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Point[] points = new Point[]{new Point(2,2)};
        Point[] points = new Point[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("3 points please:\n");

        for(int i=0; i<3; i++) {
            double x = sc.nextInt();
            double y = sc.nextInt();
            points[i] = new Point(x,y);
        }

        System.out.println(Point.calculateCenterOfMass(points));

        // double resultPointX = 0.0;
        // double resultPointY = 0.0;

        // for(int i=0; i<3; i++) {
        //     resultPointX += points[i].getX();
        //     resultPointY += points[i].getY();
        // }

        // Point resPoint = new Point(resultPointX/3, resultPointY/3);
        // System.out.println(resPoint.toString());
    } 
}
