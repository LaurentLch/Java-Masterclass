package Section5_Control_Flow_Statements;

public class F_Ex_First_And_Last_Digit_Sum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(155));
    }

    public static int sumFirstAndLastDigit(int number) {

        //VALIDATION
        if (number < 0) {
            return -1;
        }

        //LASTDIGIT
        int lastDigit = number % 10;

        //FIRSTDIGIT
        int firstDigit = 0;

        while (number > 0 ) {
            firstDigit = number % 10;
            number = number / 10;
        }

        //RETURN
        return lastDigit + firstDigit;
    }
}


//    Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//
//        The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.
//
//        If the number is negative then the method needs to return -1 to indicate an invalid value.
//
//        Example input/output
//
//        * sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
//
//        * sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
//
//        * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
//
//        * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
//
//        * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
//
//
//        NOTE: The method sumFirstAndLastDigit needs to be defined as public static like we have been doing so far in the course.
//
//        NOTE: Do not add a  main method to solution code.


//package Java_Basics;
//
//        import java.util.Scanner;
//
//public class FirstLastDigitSum {
//
//    public int sumFirstAndLastDigit(){
//
//        Scanner sc = new Scanner(System.in); // Instantiating the Scanner class
//        System.out.println("Enter a number");
//        int number = sc.nextInt(); // taking in the number from the user.
//        String num = String.valueOf(number); // Casting the number into String
//        int sum = 0;
//        if(number < 0){ //checking if the number length entered is less than 0, that is negative
//            return -1; //returns -1 if the number is negative
//        }
//        else if(num.length() <2){ // if the prior if statement turns out to be false then this if statement comes to effect
//            // the String form of the number's length is checked, if it is less than 2 i.e. 1, the code block executes.
//            sum = (Integer.parseInt(num))*2; // the string is converted to Int and multiplied by 2.
//            return sum;
//        }
//        else{
//            sum = Integer.parseInt(String.valueOf(num.charAt(0)))+Integer.parseInt(String.valueOf(num.charAt((num.length())-1)));
//            return sum; // This code block runs if the length is greater than equals to 2. The strings first character and the last character are extracted
//        }               // The extracted characters are then re=casted to Integer and then added up.
//    }
