package Section9_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.A_Arrays.Exercises;

import java.util.Arrays;

public class Reverse_Array {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(array));

        reverse(array);

        System.out.println(Arrays.toString(array));
    }

//METHOD 1 //////////////////////////////////////////////////////////////////////////////////////////////////

    private static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        for(int i=0; i < array.length/2; i++){ // can use half length instead of array.length-1-i
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}

//METHOD 2 //////////////////////////////////////////////////////////////////////////////////////////////////
//        private static void reverse(int[] array){
//            int first = 0; // index starts at 0
//            int last = array.length-1; // index starts at 0 so length -1 for last index
//
//            System.out.println("Array = " + Arrays.toString(array));
//
//
//            while(last>first){ // loop until the half way mark of the array, i.e. values get inverted
//                int temp = array[first]; // hold the first value of target
//                array[first] = array[last]; // change first value of target with last value
//                array[last] = temp; // replace last value of target with temp value
//                first++; // increment further into the array
//                last--; // decrement further into the array
//            }
//            System.out.println("Reversed array = " + Arrays.toString(array));
//        }
//    }

//METHOD 3 //////////////////////////////////////////////////////////////////////////////////////////////////

//    private static void reverse(int [] array){
//        for(int i=0; i<(array.length/2);i++){
//            array[i] = array[i] + array[array.length-1-i];
//            array[array.length-1-i] = array[i] -  array[array.length-1-i];
//            array[i] = array[i] -  array[array.length-1-i];
//        }
//    }

