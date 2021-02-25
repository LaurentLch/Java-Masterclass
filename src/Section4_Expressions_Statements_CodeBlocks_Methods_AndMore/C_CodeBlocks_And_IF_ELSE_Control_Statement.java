package Section4_Expressions_Statements_CodeBlocks_Methods_AndMore;

public class C_CodeBlocks_And_IF_ELSE_Control_Statement {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
//        if (score <= 5000 && score > 1000) {
//            int myInt = 0; //This variable is only accessible in the scope
//            System.out.println("Your score is 5000");
//        }else if (score <1000){
//            System.out.println("Score less than 1000");
//        }else{
//            System.out.println("Got Here also");
//        }
//        System.out.println("Operation Over");
//    }

//        boolean newGameOver = true;
//        int newScore = 800;
//        int newLevelCompleted = 5;
//        int newBonus = 100;
//
//        if(gameOver){
//            int newFinalScore = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + newFinalScore);
//        }
    }
}

