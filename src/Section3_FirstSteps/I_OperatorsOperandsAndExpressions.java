package Section3_FirstSteps;

public class I_OperatorsOperandsAndExpressions {
    public static void main(String[] args) {

            //OPERATORS
            int result = 1 + 2; // 1 + 2 = 3 (= is an assignment operator, and + is a sum operator, 1 & 2 are operands)
            System.out.println("1 + 2 = " + result);

            int previousResult = result;
            System.out.println("previousResult = " + previousResult);

            result = result - 1; // 3 - 1 = 2
            System.out.println("3 - 1 = " + result);

            System.out.println("previousResult = " + previousResult); //PreviousResult does not change and was not updated

            result = result * 10; // 2 * 10 = 20
            System.out.println("2 * 10 = " + result);

            result = result / 5; // 20/5 = 4
            System.out.println("20 / 5 = " + result);

            // Modulus
            result = result % 3;
            System.out.println("4 % 3 = " + result);

        }
    }