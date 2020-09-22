package person;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Kovacs", "Pista", "mernok", Gender.MALE, 1960);
        Person person2 = new Person("Kovacs", "Pista", "mernok", Gender.MALE, 1960);
        System.out.println(person1.equals(person1));
        System.out.println(person1.equals(person2));
        System.out.println(person1.toString());
    }
    
}
