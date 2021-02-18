public class Circle {
    double x;
    double y;
    double radius;
    // boolean big;

    void enlarge(double f) {
        radius *= f;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    // boolean isBig() {
    //     return big;
    // }

}
