package Section9_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.A_Arrays.Videos;

public class Main {
    public static void main(String[] args) {
//        //METHOD 1 ///////////////////////////////////////////////////
//        // Creating new array
//        int[] myIntArray = new int[10]; // Array is a data structure to store variables of same type - Here max length 10
//        // Access the array
//        myIntArray[0] = 0;
//        myIntArray[1] = 1;
//        myIntArray[2] = 2;
//        myIntArray[3] = 3;
//        myIntArray[4] = 4;
//        myIntArray[5] = 5;
//        myIntArray[6] = 6;
//        myIntArray[7] = 7;
//        myIntArray[8] = 8;
//        myIntArray[9] = 9;
//        // Print 6th element of myIntArray
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[1]);
//        System.out.println(myIntArray[2]);
//        System.out.println(myIntArray[3]);
//        System.out.println(myIntArray[4]);
//        System.out.println(myIntArray[5]);
//        System.out.println(myIntArray[6]);
//        System.out.println(myIntArray[7]);
//        System.out.println(myIntArray[8]);
//        System.out.println(myIntArray[9]);
//        System.out.println("------------");
//
//
//        //METHOD 2 ////////////////////////////////////////////////////
//        // Creating new array 2
//        int[] myIntArray2 = {0,1,2,3,4,5,6,7,8,9};
//        // Print 6th element of myIntArray
//        System.out.println(myIntArray2[0]);
//        System.out.println(myIntArray2[1]);
//        System.out.println(myIntArray2[2]);
//        System.out.println(myIntArray2[3]);
//        System.out.println(myIntArray2[4]);
//        System.out.println(myIntArray2[5]);
//        System.out.println(myIntArray2[6]);
//        System.out.println(myIntArray2[7]);
//        System.out.println(myIntArray2[8]);
//        System.out.println(myIntArray2[9]);
//        System.out.println("------------");
//
//
//        //METHOD 3 //////////////////////////////////////////////////
//        int[] myIntArray3  = new int[10];
//        for (int i = 0; i < myIntArray3.length; i++) {
//            myIntArray3[i] = i;
//            System.out.println(myIntArray3[i]);
//        }

        //METHOD4 /////////////////////////////////////////////////////
         int [] myIntArray4 = new int[10];
        for (int i = 0; i < myIntArray4.length; i++) {
            myIntArray4[i] = i;
        }
        printArray(myIntArray4);
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " , value is " + array[i]);
        }
    }

}

//Boolean arrays will be set to false, Strings to null, and int arrays values are 0 by default.
// Anonymous array example = int[] array = {1,2,3,4}


