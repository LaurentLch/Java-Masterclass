package Section5_Control_Flow_Statements;

public class FF_Ex_Even_Digit_Sum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(125548746));
    }

        public static int getEvenDigitSum(int number) {
            if (number < 0) //first if checks if number is less than 0
                return -1; //returns negative 1 if true.

            int sum = 0; //have to initialize sum outside of while loop

            while (number > 0) { //loop runs while number is greater than 0
                if (number % 2 == 0) { // if statement checks for even number if even runs next line
                    sum = sum + (number % 10);//adds the remainder of number to sum
                } // if if statement false/odd passes line ten and skips to line 12
                number = number / 10; //reduces number by one decimal point by setting number equal to number divided by 10.
            }
            return sum; //returns sum of all even numbers processed by loop
        }
    }


//public class EvenDigitSum {
//
//    public static int getEvenDigitSum (int number){
//
//        if (number <0) return -1;
//
//        int sum = 0;
//        int remainder = 0;
//        while (number > 0){
//            remainder = number % 10;
//            sum += (remainder % 2 == 0) ? remainder:0;
//            number /= 10;
//        }
//        return sum;
//    }
//}