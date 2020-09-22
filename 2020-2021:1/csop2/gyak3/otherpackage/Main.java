package otherpackage;

import packagename.Foo;
// import packagename.*; //import everything from packagename

public class Main {
    public static void main(String[] args) {
        // packagename.Foo f = new packagename.Foo();
        Foo f = new Foo();
        System.out.println(f.getX());
    }
}