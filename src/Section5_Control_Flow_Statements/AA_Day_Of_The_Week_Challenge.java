package Section5_Control_Flow_Statements;

public class AA_Day_Of_The_Week_Challenge {
    public static void main(String[] args) {
        printDayOfTheWeek(2);
        printDayOfTheWeek(10);
        printDayOfTheWeekIFELSE(3);
        printDayOfTheWeekIFELSE(80);
    }

    //METHODS
    public static void printDayOfTheWeek(int day){
        switch(day){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid Day");
        }
    }

    public static void printDayOfTheWeekIFELSE (int day){
        if (day == 1){
            System.out.println("Sunday");
        }else if (day == 2){
            System.out.println("Monday");
        }else if (day == 3){
            System.out.println("Tuesday");
        }else if (day == 4){
            System.out.println("Wednesday");
        }else if (day == 5){
            System.out.println("Thursday");
        }else if (day == 6){
            System.out.println("Friday");
        }else if (day == 2){
            System.out.println("Saturday");
        }else {
            System.out.println("Invalid Day");
        }
    }
}
