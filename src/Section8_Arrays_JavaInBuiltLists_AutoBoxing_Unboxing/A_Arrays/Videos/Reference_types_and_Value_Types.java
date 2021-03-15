package Section9_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.A_Arrays.Videos;

import java.util.Arrays;

public class Reference_types_and_Value_Types {
    //Primitive types are values types - that is, they have a value
    //String and Arrays are reference types

    public static void main(String[] args) {

        //VALUE TYPES - When we create an int variable a single space in memory is allocated to store the value, and that variable directly holds that value
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);
        System.out.println("--------------------");

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);
        System.out.println("--------------------");


        //REFERENCE TYPES
//        when we see the "new " keyword we created a new object
        int[] myIntArray = new int[5]; // myIntArray here is actually a reference
        int[] anotherArray = myIntArray; // another reference here, pointing to the same address in memory

        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); // Prints array on one line
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        System.out.println("--------------------");


        //Make a change in one of the arrays
        anotherArray[0] = 1;

        System.out.println("After change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After change anotherArray = " + Arrays.toString(anotherArray));
        System.out.println("--------------------");
        //Both arrays are changed. Because both variables are referencing the same array in memory.

        //Modify array
        anotherArray = new int[]{4,5,6,7,8}; // new array in memory
        modifyArray(myIntArray);
        System.out.println("After modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After modify anotherArray = " + Arrays.toString(anotherArray));
        System.out.println("--------------------");

    }

    //Same behavior when we pass reference types in methods.
    private static void modifyArray(int[]array){
        array[0] = 2;
        array = new int[]{1,2,3,4,5}; //This points to a different array because of the new keyword. So it wont affect myIntArray and anotherArray.
    }
}
