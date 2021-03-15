package Section9_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.B_ArrayList.Videos.GroceryList;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListRunner {

    private static final Scanner scanner = new Scanner(System.in);
    private static final GroceryList groceryList = new GroceryList();

    // MAIN METHOD //////////////////////////////////////////////////////
    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0 -> printInstructions();
                case 1 -> groceryList.printGroceryList();
                case 2 -> addItem();
                case 3 -> modifyItem();
                case 4 -> removeItem();
                case 5 -> searchForItem();
                case 6 -> processArrayList();
                case 7 -> quit = true;
            }
        }
    }

    // METHOD PRINT //////////////////////////////////////////////////////
    public static void printInstructions() {
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit application.");

    }

    // METHOD ADD //////////////////////////////////////////////////////
    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    // METHOD MODIFY /////////////////////////////////////////////////////
    public static void modifyItem() {
        System.out.print("Enter item number: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    // METHOD REMOVE //////////////////////////////////////////////////////
    public static void removeItem() {
        System.out.println("Enter item number: ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    // METHOD SEARCH //////////////////////////////////////////////////////
    public static void searchForItem(){
        System.out.println("Enter what item to search: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem ) ){
            System.out.println("Found " + searchItem + " in our grocery list");
        }else{
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    // METHOD PROCESS //////////////////////////////////////////////////////
    public static void processArrayList() {
        //Copy ArrayList
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        //Copy ArrayList method 2
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        // Take contains of arrayList and convert to regular array
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);


    }
}

