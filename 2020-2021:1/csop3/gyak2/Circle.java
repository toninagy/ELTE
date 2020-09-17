
public class Circle {

    private double x, y, r;

    Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    Circle(double x, double y) {
        r=1;
        this.x = x;
        this.y = y;
    }
  
    public void enlarge(double f) {
      r *= f;
    }
  
    public double getarea() {
      return Math.PI*r*r;
    }
    
  }