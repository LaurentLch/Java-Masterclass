package Section3_FirstSteps;

public class B_Variables {

    public static void main(String[] args) {
        //INSTANCE VARIABLES
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.println(myTotal);

        //CHALLENGE
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }


}
