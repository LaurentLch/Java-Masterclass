package Section3_FirstSteps;

public class L_LogicalANDOperator {
    public static void main(String[] args) {
        int topScore = 80;
        if (topScore == 100){
            System.out.println("You got the high score");
        }
        if (topScore != 100){
            System.out.println("You do not have the high score");
        }

        if (topScore > 100){
            System.out.println("You got the higher score");
        }

        if (topScore >= 100){
            System.out.println("You got the high score or greater");
        }

        if (topScore < 100){
            System.out.println("You got less than the high score");
        }

        if (topScore <= 100){
            System.out.println("You got the high score or less");
        }

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than secondTopScore and less than 100");
        }

    }
}

