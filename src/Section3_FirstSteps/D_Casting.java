package Section3_FirstSteps;

public class D_Casting {
    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        short myMinShortValue = Short.MIN_VALUE;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

    }
}
