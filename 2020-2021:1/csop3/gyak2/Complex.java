public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex() {
        this.re = 0.0;
        this.im = 0.0;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public double abs() {
        return Math.sqrt(re*re + im*im);
    }

    public void add(Complex num) {
        this.re += num.re;
        this.im += num.im;
    }

}
