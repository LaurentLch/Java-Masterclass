package Section3_First_Steps;

public class P_OperatorPrecedenceAndOperatorChallenge {
    public static void main(String[] args) {
        double myDouble = 20.00;
        double mySecondDouble = 80.00;
        double myTotalDouble = (myDouble + mySecondDouble) * 100;
        double remainder = myTotalDouble % 40.00;

        boolean isRemainderZero = remainder == 0;         //boolean isRemainderZero = remainder == 0 ? true : false

        if(isRemainderZero){
            System.out.println("There is no remainder");
        }else{
            System.out.println("There is a remainder");
            
        }
    }
}
