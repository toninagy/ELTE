public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double abs() {
        return Math.sqrt(re*re + im*im);
    }

    public void add(Complex c) {
        re += c.re;
        im += c.im;
    }

    public double mul(Complex c) {
        return re*c.re + im*c.im + re*c.im + im * c.re;
    }
}
