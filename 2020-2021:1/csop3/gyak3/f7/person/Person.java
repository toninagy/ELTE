package person;

public class Person {
    private String firstName;
    private String lastName;
    private String job;
    private Gender gender;
    private int birthYear;

    public Person(String firstName, String lastName, String job, Gender gender, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
        this.gender = gender;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person's name: " + firstName + " " + lastName + ", birth year: " + birthYear;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof Person)) {
            return false;
        }
        Person pers = (Person) obj;
        return  pers.birthYear == this.birthYear && //we can always use == on primitives, since their values get compared, not their memory addresses (would be nonsense)
                pers.gender == this.gender && //on enums too, there is only one instance generated in the memory for each of them, hence == will always return true for the same enum instance
                pers.job.equals(this.job) && //use .equals() to compare String contents, == to compare their mem addresses (Strings are NOT primitives!)
                pers.firstName.equals(this.firstName) &&
                pers.lastName.equals(this.lastName); 
    }
}