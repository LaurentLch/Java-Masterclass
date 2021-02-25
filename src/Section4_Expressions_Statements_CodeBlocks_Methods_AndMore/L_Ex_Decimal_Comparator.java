package Section4_Expressions_Statements_CodeBlocks_Methods_AndMore;

public class L_Ex_Decimal_Comparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.756, 3.7562);
    }

    public static boolean areEqualByThreeDecimalPlaces (double number1, double number2){
        if ((int)(number1 * 1000) == (int)(number2 * 1000)){
            return true;
        }
        return false;
    }
}

//    Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//
//        The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
//
//
//        EXAMPLES OF INPUT/OUTPUT:
//
//        * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
//
//        * areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
//
//        * areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
//
//        * areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.
//
//
//        TIP: Use paper and pencil.
//
//        TIP: Use casting.
//
//        NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
//        NOTE: Do not add a  main method to solution code.