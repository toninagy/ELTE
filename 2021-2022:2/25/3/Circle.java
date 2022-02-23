public class Circle {
    private double x;
    private double y; 
    private double radius = 1;

    public Circle() {

    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        setRadius(radius);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setRadius(double radius) {
        if(radius <= 0) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

}

class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getArea());
        c.setX(5);
        c.setY(2);
        c.setRadius(10);
        System.out.println(c.getArea());

        Circle c2 = new Circle(1,2,100);
    }
}