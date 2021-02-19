public class Complex {
    double re;
    double im;

    double abs() {
        return Math.sqrt(re*re + im*im);
    }

    void add(Complex c) {
        re += c.re;
        im += c.im;
    }

    void sub(Complex c) {
        re -= c.re;
        im -= c.im;
    }

    void mul(Complex c) { //(a+bi)*(c+di) = a*c + a*di + c*bi - b*d
        double newRe = re*c.re - im*c.im;
        double newIm = re*c.im + im*c.re;
        re = newRe;
        im = newIm;
    }
}
