import java.util.*;

class DoubleVector {
    double[] coords;

    public DoubleVector(double x1, double x2) {
        this.coords = new double[2];
        this.coords[0] = x1;
        this.coords[1] = x2;
    }

    public String toString() {
        return "(" + this.coords[0] + "," + this.coords[1] + ")";
    }

    @Override
    public boolean equals(Object o) { //reflexive, symmetrical, transitive, null -> false, consistent
        if(o == null) {
            return false;
        }
        if(o == this) {
            return true;
        }
        if(o instanceof DoubleVector) { //o.getClass().equals(DoubleVector.class)
            DoubleVector dv = (DoubleVector) o;
            return dv.coords[0] == this.coords[0] && dv.coords[1] == this.coords[1];
        }
        return false;
    }

    @Override 
    public int hashCode() {
        // return 42; //world's worst hashCode 
        int result = Double.hashCode(coords[0]);
        result = 31 * result + Double.hashCode(coords[1]);
        return result;
        //return Objects.hash(coords[0], coords[1]);
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println(new DoubleVector(2, 3).equals(new DoubleVector(2, 3)));
        System.out.println(new DoubleVector(2, 3).equals(new DoubleVector(2, 2)));

        HashSet<DoubleVector> exampleSet = new HashSet<DoubleVector>();
        exampleSet.add(new DoubleVector(0, 0));
        exampleSet.add(new DoubleVector(3, -7));
        exampleSet.add(new DoubleVector(3, -7));
        System.out.println( "size of HashSet: " + exampleSet.size());
        System.out.println( "items of HashSet: " + exampleSet);
    }
}
