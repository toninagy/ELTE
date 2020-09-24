package otherpackage;

import packagename.Foo;

public class Main {
    public static void main(String[] args) {
        Foo f = new Foo();
        System.out.println("Running main from otherpackage: " + f.getX());
    }
}
