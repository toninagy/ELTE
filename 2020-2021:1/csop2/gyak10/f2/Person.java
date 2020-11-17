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
        // firstName = "Andras";
        // secondName = "Andras";
        // firstName == secondName //true
        // firstName1 = new String("Andras");
        // secondName1 = new String("Andras");
        // firstName1 == secondName1 //false
    }

    @Override
    public String toString() {
        return "First name: " + firstName + ", last name: " + lastName + ", birth year: " + birthYear;
    }

    @Override
    public boolean equals(Object p) {
        if(p == null) {
            return false;
        }
        if(this == p) {
            return true;
        }
        if(!(p instanceof Person)) {
            return false;
        }
        Person pers = (Person) p;
        return  pers.birthYear == this.birthYear && //we can always use == on primitives, since their values get compared, not their memory addresses (would be nonsense)
                pers.gender == this.gender && //on enums too, there is only one instance generated in the memory for each of them, hence == will always return true for the same enum instance
                pers.job.equals(this.job) && //use .equals() to compare String contents, == to compare their mem addresses (Strings are NOT primitives!)
                pers.firstName.equals(this.firstName) &&
                pers.lastName.equals(this.lastName); 
}
    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = result * 31 + lastName.hashCode(); 
        result = result * 31 + lastName.hashCode(); 
        result = result * 31 + job.hashCode(); 
        result = result * 31 + gender.hashCode(); 
        result = result * 31 + Integer.hashCode(birthYear);
        return result;
    }
}
