public class Circle {
    double x = 0;
    double y = 0;
    double radius = 1;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
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
            throw new IllegalArgumentException("Radius cannot be 0 or less");
        }
        this.radius = radius;
    } 
}

class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5, 2, 10);
        System.out.println(circle.getArea());
        circle.setRadius(5);
        System.out.println(circle.getArea());
        circle.setRadius(-5);
        System.out.println(circle.getArea());
    }
}
