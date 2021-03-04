package Section3_First_Steps;

public class E_PrimitiveTypesChallenge {
    public static void main(String[] args) {
        //INSTANCE VARIABLES
        byte byteVariable =10;
        short shortVariable = 20;
        int intVariable = 50;
        long longVariable = (long)(50000 + (10 *(byteVariable + shortVariable + intVariable)));
        System.out.println(longVariable);
    }

}
