package Section3_First_Steps;

public class M_LogicalOROperator {
    public static void main(String[] args) {
        int topScore = 100;
        int secondTopScore = 95;

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }
    }
}
