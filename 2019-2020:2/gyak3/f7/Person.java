package person;

public class Person {
    private Gender gender;
    private String firstName;
    private String lastName;
    private String job;
    private int birthYear;

    public Person(Gender gender, String firstName, String lastName, String job, int birthYear) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return birthYear + ":" + lastName + " " + firstName
        + "Job: " + job;
    }

    @Override 
    public boolean equals(Object obj) {
        if(obj == null) { 
            return false;
        }
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof Person)) { //OR obj.getClass().equals(Person.class) 
                                      //NOTE: using instanceof offers runtime polymorphism "protection",
                                      //whereas getClass() does not => violating Liskov subst. principle
            return false;
        }
        Person p = (Person) obj;
        return p.birthYear == this.birthYear && //we can always use == on primitives, since their values get compared, not their memory addresses (would be nonsense)
                p.gender == this.gender && //on enums too, there is only one instance generated in the memory for each of them, hence == will always return true for the same enum instance
                p.job.equals(this.job) && //use .equals() to compare String contents, == to compare their mem addresses (Strings are NOT primitives!)
                p.firstName.equals(this.firstName) &&
                p.lastName.equals(this.lastName); 
    }
}