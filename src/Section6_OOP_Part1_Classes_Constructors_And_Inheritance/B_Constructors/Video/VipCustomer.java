package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.B_Constructors.Video;

public class VipCustomer {
    //INSTANCE VARIABLES
    private String name;
    private double creditLimit;
    private String email;

    //CONSTRUCTORS
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@gmail.com");
    }

    public VipCustomer() {
        this("Default name", 50000.0, "default@gmail.com");
    }

    //GETTERS

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
