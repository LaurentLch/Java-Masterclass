package Section8_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.A_Arrays.Challenge;
import java.util.Arrays;
import java.util.Scanner;
// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

public class Sort_Integers_Descending_Order {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    //get integers in input and make array
    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values. \r"); // \r means next line for input

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    //Accept array and print content
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " , value is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) { // return ints because you return an array of type int
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; 0 < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        while (flag) {
            flag = false;
            //element 0 -> 50
            //element 1 -> 160
            //element 2 -> 40
            for (int i = 0; i < sortedArray.length - 1; i++) {
                // if element 0 (50) < element 1 (160)
                if (sortedArray[i] < sortedArray[i + 1]) {
                    //swap the elements around if true
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }


}
