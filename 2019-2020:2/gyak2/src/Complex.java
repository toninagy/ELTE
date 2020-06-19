package trig;

public class Complex {
    private double re; //hide inner representation whenever possible
    private double im;

    public double abs() {
        return Math.sqrt(re*re + im*im);
    }

    public double getRe() { //always use getters and setters
        return this.re;
    }

    public double getIm() {
        return this.im;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }
}