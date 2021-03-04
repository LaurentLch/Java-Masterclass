package Section3_First_Steps;

public class N_AssignementOperatorVSEqualsToOperator {
    public static void main(String[] args) {
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) { //same as if (isCar == true) {xxx}
            System.out.println("This is not supposed to happen");
        }

        if (!isCar) { // same as if (isCar == false)
            System.out.println("Car is not equal to true");
        }
    }
}
