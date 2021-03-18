package Section8_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.C_Autoboxing_Unboxing.Challenge;

import java.util.ArrayList;

public class Branch {
    //INSTANCE VARIABLES///////////////////////////////////////////////////
    private  String name;
    private  ArrayList<Customer> customers;


    //CONSTRUCTORS//////////////////////////////////////////////////////////
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    //GETTERS //////////////////////////////////////////////////////////////
    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    //METHODS - NEW CUSTOMER ////////////////////////////////////////////////
    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) { // If its not on file
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    //METHODS - ADD CUSTOMER TRANSACTION///////////////////////////////////////
    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);

        if(existingCustomer!= null){ // If customer is on file
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false; // if it gets to here, we were not able to find the customer
    }

    //METHODS - FIND CUSTOMER////////////////////////////////////////////////
    private Customer findCustomer(String customerName){
        for (int i = 0; i < customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
