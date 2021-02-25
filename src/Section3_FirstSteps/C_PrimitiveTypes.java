package Section3_FirstSteps;

public class C_PrimitiveTypes {
    public static void main(String[] args) {
        //INTEGER
        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.printf("Maximum integer value: %s%n", myMaxIntValue);
        System.out.printf("Minimum integer value: %s%n", myMinIntValue);
//        System.out.printf("Busted Max Value: %s%n", myMaxIntValue + 1); //OVERFLOW
//        System.out.printf("Busted Max Value: %s%n", myMinIntValue - 1); //UNDERFLOW

        //BYTE
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.printf("Maximum byte value: %s%n", myMaxByteValue);
        System.out.printf("Maximum byte value: %s%n", myMinByteValue);

        //SHORT
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.printf("Maximum Short value: %s%n", myMaxShortValue);
        System.out.printf("Maximum Short value: %s%n", myMinShortValue);

        //LONG
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.printf("myLongValue: %s%n", myLongValue);
        System.out.printf("Maximum Long value: %s%n", myMaxLongValue);
        System.out.printf("Maximum Long value: %s%n", myMinLongValue);
    }

}
