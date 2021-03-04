package Section5_Control_Flow_Statements;

public class C_FOR_Statement {

    public static void main(String[] args) {
        System.out.println("10,000 at 0% Interest = " + calculateInterest(10000,0.0));
        System.out.println("10,000 at 1% Interest = " + calculateInterest(10000,1.0));
        System.out.println("10,000 at 2% Interest = " + calculateInterest(10000,2.0));
        System.out.println("10,000 at 3% Interest = " + calculateInterest(10000, 3.0));
        System.out.println("10,000 at 4% Interest = " + calculateInterest(10000, 4.0));
        System.out.println("-------------------------------");

       // FOR (INITIALIZATION; TERMINATION; INCREMENT)
        for (int i = 0; i < 5 ; i++) {
            System.out.println("10000 at " + i + " % interest = " + calculateInterest(10000, i));
        }
        System.out.println("------------------------------");

        // inverse loop from above
        for (int i = 5; i >= 0 ; i--) {
            System.out.println("10000 at " + i + " % interest = " + calculateInterest(10000, i));
        }
        System.out.println("------------------------------");

        // isPrime METHOD
        System.out.println(isPrime(7));
        System.out.println(isPrime(9));

        int count = 0;
        for (int i = 0; i < 10000; i++) {
            if (isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 1000){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest (double amount, double interestRate){
        return (amount * interestRate/100);
    }


    public static boolean isPrime (int n){
        if (n == 1){
            return false;
        }

        for (int i = 2; i < n/2; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
