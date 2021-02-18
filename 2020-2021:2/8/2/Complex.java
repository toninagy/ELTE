public class Complex {
	double re;
	double im;
	
	public double abs(){
		return Math.sqrt(re*re + im*im);
	}	
	
	public void add (Complex c){
		re += c.re;
		im += c.im;
	}
	
	public void sub (Complex c){
		re -= c.re;
		im -= c.im;
	}
	
	public void mul (Complex c){ //(a+bi)*(c+di) = a*c + a*di + c*bi - b*d
        double newRe = this.re * c.re - this.im * c.im;
        double newIm = this.re * c.im + c.re * this.im;
		re = newRe;
		im = newIm;
	}
}
