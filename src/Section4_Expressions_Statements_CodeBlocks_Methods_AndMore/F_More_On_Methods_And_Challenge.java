package Section4_Expressions_Statements_CodeBlocks_Methods_AndMore;

public class F_More_On_Methods_And_Challenge {
    public static void main(String[] args) {

//        int highscore = calculateScore(gameOver, score, levelCompleted, bonus); //Assign a variable to a method result
//        System.out.println("Your final score is " + highscore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition ("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition ("Jane", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition ("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition ("Jill", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition ("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition ("Carole", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition ("Jill", highScorePosition);
    }

    private static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    private static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500){
            position = 2;
        }else if (score >= 100){
            position = 3;
        }
        return position;
    }
}
