package Section9_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.A_Arrays.Videos;

import java.util.Scanner;

public class Example_User_input {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] myIntegers = getIntegers(5); //Get 5 inputs from user and store them in an array
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + " , typed was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int capacity){
        int [] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values. \r"); // \r means next line for input

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
