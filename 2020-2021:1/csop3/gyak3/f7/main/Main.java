package main;

import person.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Hugh", "Laurie", "actor", Gender.MALE, 1960);
        Person p2 = new Person("Hugh", "Laurie", "actor", Gender.MALE, 1963);

        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p1));

    }
}
