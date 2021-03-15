package Section9_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.B_ArrayList.Videos.ArrayListExample;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        //Create new array list
        ArrayList arrayList = new ArrayList();
        System.out.println("Initial size of arrayList = " + arrayList.size());

        //Add elements to the arrayList
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("Size after additions = " + arrayList.size());

        //Display the arrayList
        System.out.println("Contents of arrayList = " + arrayList);

        //Remove elements from the arrayList
        arrayList.remove("A");
        arrayList.remove(2);
        System.out.println("Size after deletions = " + arrayList.size());
        System.out.println("Contents of arrayList  = " + arrayList);

    }
}
