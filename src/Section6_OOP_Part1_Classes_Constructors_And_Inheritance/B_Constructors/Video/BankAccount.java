package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.B_Constructors.Video;

public class BankAccount {

    //INSTANCE VARIABLES
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    //CONSTRUCTOR
    public BankAccount(){
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String name, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //METHODS - GETTERS
    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    //METHODS - SETTERS
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    //METHODS - OTHER
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " processed. New balance is " + this.balance);
    }

    public void withdrawal (double withdrawalAmount){
        if (balance - withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        }else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. New balance is " + this.balance);
        }
    }



}
