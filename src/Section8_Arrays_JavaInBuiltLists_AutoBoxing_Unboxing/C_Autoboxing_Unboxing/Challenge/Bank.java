package Section8_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.C_Autoboxing_Unboxing.Challenge;

import java.util.ArrayList;

public class Bank {

    // INSTANCE VARIABLES //////////////////////////////////////////////
    private  String name;
    private  ArrayList<Branch> branches;

    // CONSTRUCTORS ////////////////////////////////////////////////////
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }


    // METHODS - ADD BRANCH/////////////////////////////////////////////
    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    // METHODS - FIND BRANCH////////////////////////////////////////////
    private Branch findBranch(String branchName){
//        for(data_type variable : array | collection){
        for(int i=0; i<this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    // METHODS - ADD CUSTOMER///////////////////////////////////////////
    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    // METHODS - ADD CUSTOMER TRANSACTION //////////////////////////////
    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }

    // METHODS - LIST CUSTOMERS//////////////////////////////////////////
    // Show a list of all customers of a branch and optionally show each transaction for each customer
    public boolean listCustomers(String branchName, boolean showTransaction){
        Branch branch = findBranch(branchName);

        if(branch != null){
            System.out.println("Customers details for branch " + branch.getName());

            //List of customer that are part of the branch
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            //Getting list of all the customer the branch
            for(int i=0; i<branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer [" + (i+1) + "] "+ branchCustomer.getName());

                if (showTransaction){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    //Loop again because there can be multiple transactions
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
                System.out.println("--------------------------");

            }
            return true;

        }else{
            return false;
        }

    }



}
