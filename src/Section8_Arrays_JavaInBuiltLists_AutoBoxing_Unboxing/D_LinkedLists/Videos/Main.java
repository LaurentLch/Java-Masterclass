package Section8_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.D_LinkedLists.Videos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // INSTANCE OF CUSTOMER CLASSES
        Customer customer = new Customer("Tim", 24.35);
        Customer anotherCustomer = customer;

        anotherCustomer.setBalanceAmount(12.34);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalanceAmount());

        //Changing the balance for anotherCustomer changes the balance of customer.
        // Because the allocation in memory works that way in java

        //ARRAYLIST
        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(0);
        intList.add(1);
        intList.add(2);
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
        System.out.println("---------------");

        intList.add(1,2);
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
        System.out.println("---------------");

        //LINKEDLIST - Each element in the list holds a link stores the actual link to the next item in the list. As well as the actual data, hence the name "linkedlist"


    }
}
