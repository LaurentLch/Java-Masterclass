package Section4_Expressions_Statements_CodeBlocks_Methods_And_More;

public class M_Ex_Equal_Sum_Checker {
    public static void main(String[] args) {

    }

    public static boolean hasEqualSum (int a, int b, int c) {
        if ((a+b) == c){
            return true;
        }
        return false;
    }
}

//    Write a method hasEqualSum with 3 parameters of type int.
//
//        The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.
//
//
//        EXAMPLES OF INPUT/OUTPUT:
//
//        * hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1
//
//        * hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2
//
//        * hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0
//
//
//        NOTE: The hasEqualSum method  needs to be defined as public static like we have been doing so far in the course.
//        NOTE: Do not add a  main method to solution code.