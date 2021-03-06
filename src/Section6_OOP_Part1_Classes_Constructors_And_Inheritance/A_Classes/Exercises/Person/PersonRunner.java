package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.A_Classes.Exercises.Person;

public class PersonRunner {

    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");

        person.setAge(10);

        System.out.println("FullName = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());

        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);

        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setLastName("Smith");
        System.out.println("FullName = " + person.getFullName());


    }
}
