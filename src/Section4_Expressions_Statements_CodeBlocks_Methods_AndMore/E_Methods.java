package Section4_Expressions_Statements_CodeBlocks_Methods_AndMore;

public class E_Methods {

    public static void main(String[] args) {
        calculateScore(true, 5000, 5, 100);
        calculateScore(true, 1000, 7, 200);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { // Method has 4 parameters

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1; // -1 is conventionally used to indicate an error in programming
    }
}