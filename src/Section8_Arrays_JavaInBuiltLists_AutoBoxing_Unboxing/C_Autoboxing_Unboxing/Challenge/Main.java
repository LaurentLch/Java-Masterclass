package Section8_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.C_Autoboxing_Unboxing.Challenge;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("National Bank");

        bank.addBranch("New York");
        if(bank.addBranch("New York")){
            System.out.println("New York branch added");
        }
        bank.addBranch("Los Angeles");

        bank.addCustomer("New York", "John Doe", 100.50);
        bank.addCustomer("New York", "Jane Doe", 800.30);
        bank.addCustomer("New York", "Bob Smith", 45.05);
        bank.addCustomer("New York", "Richard Doe", 900.50);
        bank.addCustomer("Los Angeles", "Mike Smith", 43.98);

        bank.addCustomerTransaction("New York", "John Doe", 44.22);
        bank.addCustomerTransaction("New York", "John Doe", 35.17);
        bank.addCustomerTransaction("Los Angeles", "Mike Smith", 18.12);

        bank.listCustomers("New York", true);
        bank.listCustomers("Los Angeles", true);

        bank.addBranch("Melbourne");
        if(!bank.addCustomer("Melbourne", "Brian", 5.53)){
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addBranch("New York")){
            System.out.println("New York branch alrerady exists");
        }

        if(!bank.addCustomerTransaction("New York", "Fergus", 24.67)){
            System.out.println("Customer does not exist at branch");
        }



    }
}
