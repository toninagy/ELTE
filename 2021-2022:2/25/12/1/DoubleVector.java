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

    @Override
    public boolean equals(Object that) {
        if(this == that) {
            return true;
        }
        if(null == that) {
            return false;
        }
        if(that instanceof DoubleVector) {
            DoubleVector dv = (DoubleVector) that;
            return dv.coords[0] == this.coords[0] && dv.coords[1] == this.coords[1];
        }
        return false;
    }

    @Override 
    public int hashCode() {
        int result = 0;
        result = 31 * Double.hashCode(coords[0]) + result;
        result = 31 * Double.hashCode(coords[1]) + result;
        return result;
        // return Arrays.hashCode(coords);
        // return Objects.hash(coords[0], coords[1]);
    }
}