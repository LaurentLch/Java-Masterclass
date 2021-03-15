package Section9_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.B_ArrayList.Videos.GroceryList;

import java.util.ArrayList;
import java.util.Collection;

public class GroceryList {
    // NB: The ArrayList class extends AbstractList and implements the List interface. ArrayList supports dynamic arrays that can grow as needed.
    // public interface List<E>, extends Collection <E>, which is the root interface in the collection hierarchy
    // public class ArrayList<E>, extends AbstractList<E>, which implements List<E>, RandomAccess, Cloneable, Serializable
    // ArrayList is a resizable array. It handles the resizing automatically. As elements are added to the ArrayList, it resizes the capacity in memory
    // The ArrayList is actually a class, it can have its own constructor.

    private ArrayList<String> groceryList = new ArrayList<String>(); // An ArrayList can hold objects. Here the elements that are in the ArrayList are of type String.

    public void addGroceryItem(String item) {
        groceryList.add(item); //add the item in the ArrayList
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list"); // how many elements are currently stored in the ArrayList

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + " . " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;

    }

}


//    public int findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);
//        int position = groceryList.indexOf(searchItem); //searches ArrayList and finds item and returns index position of that item (returns -1 if not in list.)
//        if (position >= 0){ // If it finds the element, return the position of found item.
//            return groceryList.get(position);
//        }
//        return null;


