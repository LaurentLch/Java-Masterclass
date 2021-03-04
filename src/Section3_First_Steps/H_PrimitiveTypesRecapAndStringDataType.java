package Section3_First_Steps;

public class H_PrimitiveTypesRecapAndStringDataType {
    public static void main(String[] args) {

        //byte
        //short
        //int <----
        //long

        //float
        //double <----

        //char
        //boolean <----

        //String <----
        String myString = "This is a string";
        System.out.println("Mystring is equal to: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("Mystring is equal to: " + myString);
        myString = myString + "\u0049 2019";
        System.out.println("Mystring is equal to: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";

        String LastString = "10";
        int myInt = 50;
        LastString = LastString + myInt;
        System.out.println("LastString is equal to" + LastString);
    }


}