import java.util.*;

public class DoubleVector {
    double[] coords;

    public DoubleVector(double x1, double x2) {
        this.coords = new double[2];
        this.coords[0] = x1;
        this.coords[1] = x2;
    }

    @Override
    public String toString() {
        return "(" + this.coords[0] + "," + this.coords[1] + ")";
    }

    //erroneous !!!
    // public boolean equals(DoubleVector that) {
    //     if(that == this) {
    //         return true;
    //     }
    //     if(that == null) {
    //         return false;
    //     }
    //     return false;
    // }

    @Override
    public boolean equals(Object that) {
        if(that == this) {
            return true;
        }
        if(that == null) { //redundant with instanceof check
            return false;
        }
        if(that instanceof DoubleVector) {
            DoubleVector dv = (DoubleVector) that;
            return coords[0] == dv.coords[0] && coords[1] == dv.coords[1];
        }
        return false;
    }

    @Override
    public int hashCode() {
        // int result = Double.hashCode(coords[0]);
        // result = 31 * result + Double.hashCode(coords[1]);
        // return result;
        return Objects.hash(coords[0], coords[1]);
    }
}
