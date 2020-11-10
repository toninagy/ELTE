public class Example {
	public static void main(String[] args) {
		B b = new B(55);
       	 	System.out.println(b.c);
        	A a = new B();
        	System.out.println(a.c);
        	a = b;
        	System.out.println(a.c);
	}
}

class A{
    protected int c = 1000;
    public A(){
	c = 500;	
    }
    public A(int a){
    	c = 200;	    
    }
}
class B extends A{
    int c = 10;
    public B(){}
    public B(int a) {
       super(a);
    }
}
