package Section9_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.A_Arrays.Challenge;

import java.util.Scanner;

public class Minimum_Element_Challenge {

    private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {

            System.out.print("Enter number of elements in array: ");
            int count = input.nextInt();
            int[] myArray = readIntegers(count);
            System.out.println("Minimum element = " + findMin(myArray));
        }

        public static int[] readIntegers(int count) {
            System.out.println("Enter " + count + " integers: \r");

            int[] array = new int[count];
            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
            }
            return array;
        }

        public static int findMin(int[] array) {
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }
    }
