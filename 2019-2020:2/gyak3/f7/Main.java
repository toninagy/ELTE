package person;

public class Main {
    public static void main(String[] args) {
        Person personOne = new Person(Gender.MALE, "John", "Doe", "serialkiller", 1930);
        Person personTwo = new Person(Gender.MALE, "John", "Doe", "serialkiller", 1930);
        Person personThree = new Person(Gender.MALE, "Joe", "Doe", "serialkiller", 1930);
        System.out.println(personOne.equals(personTwo));
        System.out.println(personOne.equals(personThree));
    }
}