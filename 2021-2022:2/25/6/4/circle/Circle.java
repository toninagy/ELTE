package circle;

import circle.utils.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Circle {
    private double x = 0;
    private double y = 0;
    private double radius = 1;

    public Circle(){}

    public Circle(double x, double y, double radius) {
        setX(x);
        setY(y);
        setRadius(radius);
    }

    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        if(radius <= 0) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
    }

    void enlarge(double f) {
        radius *= f;
    }

    double getArea() {
        return Math.PI*radius*radius;
    }

    public Point getCenter() {
        return new Point(x,y);
    }

    public static Circle readFromFile(String fileName) {
        File file = new File(fileName);
        Circle c;

        try(FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr)) {
            double x = Double.parseDouble(br.readLine());
            double y = Double.parseDouble(br.readLine());
            double radius = Double.parseDouble(br.readLine());

            c = new Circle(x, y, radius);
        } catch(IOException ex) {
            c = new Circle(0, 0, 1);
        }

        return c;
    }

    public void saveToFile(String fileName) {
        File file = new File(fileName);

        try(PrintWriter pw = new PrintWriter(file)) {
            pw.println(x);
            pw.println(y);
            pw.println(radius);
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
