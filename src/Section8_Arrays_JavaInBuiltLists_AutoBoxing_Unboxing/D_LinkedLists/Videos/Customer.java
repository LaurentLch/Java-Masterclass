package Section8_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.D_LinkedLists.Videos;

public class Customer {
    // Java stores each value of a LinkedList in 4 bytes of memory per int, 8 per double. Strings don't work the same.
    // Each string is 8 bytes but that points to an address in memory where the string is located.
    // Index 0 - Address 100 - Value 34
    // Index 1 - Address 104 - Value 18
    // Index 2 - Address 108 - Value 91
    // Index 3 - Address 112 - Value 12
    // Index 4 - Address 116 - Value 364
    // Etc...
    // Once the process is over -> garbage collection

    //INSTANCE VARIABLES
    private String name;
    private double balanceAmount;

    //CONSTRUCTORS
    public Customer(String name, double balanceAmount) {
        this.name = name;
        this.balanceAmount = balanceAmount;
    }

    //GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }


}
