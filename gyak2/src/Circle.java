package trig;

public class Circle {
    private double x;
    private double y;
    double radius; //package private or default access modifier

    //ctor overloading
    public Circle(double x, double y, double radius) {
        this(x, y); //inner ctor call followed by additional logic exclusive to this ctor
        if(radius <= 0) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void enlarge(int f) {
        if(f > 0) {
            this.radius *= f;
        }
        else {
            System.out.println("Negative f");
        }
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
}