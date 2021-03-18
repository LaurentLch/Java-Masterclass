package Section8_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.C_Autoboxing_Unboxing.Challenge;

import java.util.ArrayList;

public class Customer {

    //INSTANCE VARIABLES
    private  String name;
    private  ArrayList<Double> transactions;

    //CONSTRUCTORS
    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    //METHODS
    public void addTransaction(double amount){
        this.transactions.add(amount); // Converting from primitive to wrapper -> autoboxing
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
