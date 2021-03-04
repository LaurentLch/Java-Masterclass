package Section3_First_Steps;

public class J_AbbreviatingOperators {
    public static void main(String[] args) {
        int result = 1;

        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        //result = result + 2 is:
        result += 2;
        System.out.println("1 + 2 = " + result);

        //result = result * 10 is:
        result *= 10;
        System.out.println("3 * 10 = " + result);

        //result = result / 3 is:
        result /= 3;
        System.out.println("30 / 3 = " + result);

        //result = result - 2 is:
        result -= 2;
        System.out.println("10 - 2 = " + result);
    }
}