package Section8_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.C_Autoboxing_Unboxing.Exercises;

import java.util.ArrayList;

public class Customer {

    private  String name;
    private  ArrayList<Double> transactions;

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.transactions.add(initialTransaction);
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }
}