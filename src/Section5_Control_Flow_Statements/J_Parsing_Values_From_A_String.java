package Section5_Control_Flow_Statements;

public class J_Parsing_Values_From_A_String {
    // Parsing value from a String is converting it into another data types
    //How can we convert a string value into some other primitive data type?

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);//Integer is a wrapper class of int
        System.out.println(number);

        double numberDouble = Double.parseDouble(numberAsString);
        System.out.println(numberDouble);

        numberAsString +=1;
        number +=1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);


    }
}
