package Section4_Expressions_Statements_CodeBlocks_Methods_AndMore;

public class O_Method_Overloading {

    public static void main(String[] args) {
        // Method Overloading is when you use the same method name with different parameters
        // You can use method overloading with same method name but always need a different signature
        int newScore = calculateScore(500);
        System.out.println("New score is " + newScore);

        newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);

        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(6,-1);

        if(centimeters < 0.0){
            System.out.println("Invalid amount of centimeters");
        }

        calcFeetAndInchesToCentimeters(157);

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No Player name no player score ");
        return 0;
    }

    //CHALLENGE
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet<0 || (inches <0 || inches>12)){
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet*12*2.54) + (inches * 2.54);
        System.out.println(feet + " feet and " + inches + " inches is equal to " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
         if (inches < 0){
             return -1;
         }
         double feet = (int) inches / 12;
         double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + "feet and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }


}
