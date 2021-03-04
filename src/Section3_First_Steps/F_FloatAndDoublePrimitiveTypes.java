package Section3_First_Steps;

public class F_FloatAndDoublePrimitiveTypes {
    public static void main(String[] args) {
        
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.printf("Float Minimum Value: %s%n", myMinFloatValue);
        System.out.printf("Float Maximum Value: %s%n", myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.printf("Double Minimum Value: %s%n", myMinDoubleValue);
        System.out.printf("Double Maximum Value: %s%n", myMaxDoubleValue);
        System.out.println(myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted KG : " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);


    }
}

