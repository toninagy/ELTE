package circle;

import java.io.*;

import circle.utils.Point;

public class Circle {
    private Point center;
    private double radius;
    private String label;
    private static final String defaultLabel = "unnamed";

    public Circle(Point center, double radius, String label) {
        this.center = new Point(center); //defensive copying
        this.radius = radius;
        this.label = (label == null) ? defaultLabel : label;
    }

    public Circle(double x, double y, double radius, String label) {
        this(new Point(x,y), radius, label);
    }

    public static Circle readFromFile(String fileName) throws IOException, FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
        double x = Double.parseDouble(br.readLine());
        double y = Double.parseDouble(br.readLine());
        double radius = Double.parseDouble(br.readLine());
        String label = br.readLine();

        br.close();

        return new Circle(x,y,radius,label);
    }

    public void saveToFile(String fileName) throws IOException, FileNotFoundException {
        try(PrintWriter pw = new PrintWriter(new File(fileName))) {
            pw.println(center.getX());
            pw.println(center.getY());
            pw.println(radius);
            pw.println(label);
        }
    }

    public void enlarge(double f) {
        radius *= f;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return label + ": " + "(" + center.getX() + "," + center.getY() + "), r = " + radius;
    }
}
