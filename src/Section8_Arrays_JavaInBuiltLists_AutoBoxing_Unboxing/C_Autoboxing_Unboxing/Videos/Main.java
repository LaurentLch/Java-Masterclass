package Section8_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.C_Autoboxing_Unboxing.Videos;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {
    public static void main(String[] args) {
//        The automatic conversion of primitive data types into its equivalent Wrapper type is known as boxing and opposite operation is known as unboxing.
//        This is the new feature of Java5. So java programmer doesn't need to write the conversion code.
//        Advantage of Autoboxing and Unboxing:
//        No need of conversion between primitives and Wrappers manually so less coding is required.
        //NORMAL ARRAYS
        String [] stringArray = new String[10];
        int[] intArray = new int[10];

        // ARRAYLISTS
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Tim");

//        ArrayList<Int> intArrayList = new ArrayList<Int>();
//        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
//        intClassArrayList.add(new IntClass(54));
//
//        Integer integer = new Integer(54);
//
//        Double doubleValue = new Double(12.25);
//
//        ArrayList<Integer> integerArrayList = new ArrayList<>();
//        for (int i = 0; i <=10; i++) {
//            integerArrayList.add(Integer.valueOf(i)); // PRIMITIVE TYPE INT TO INTEGER CLASS / OBJECT WRAPPER - > AUTOBOXING
//        }
//
//        // INTEGER CLASS / OBJECT WRAPPER TO PRIMITIVE TYPE -> UNBOXING
//        for (int i = 0; i <=10; i++) {
//            System.out.println(i + " --> " + integerArrayList.get(i).intValue());   }

        Integer myIntegerValue = 56; // -> Integer.valueOf(56);
        int myInt = myIntegerValue.intValue(); // Unboxing


        ArrayList <Double> myDoubleValues = new ArrayList<>();
        //BOXING
        for (double dbl = 0.0; dbl <=10.0 ; dbl += 0.5){
            myDoubleValues.add(Double.valueOf(dbl));
        }
        //UNBOXING
        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " -> " + value);
        }


    }
}
