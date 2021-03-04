package Section5_Control_Flow_Statements;

public class A_SWITCH_Statement {
    public static void main(String[] args) {
        int value = 5;
        if (value == 1){
            System.out.println("Value is 1");
        }else if (value ==2){
            System.out.println("Value is 2");
        }else {
            System.out.println("Was neither");
        }
        System.out.println("------------------------");

        int switchValue = 15;
        switch (switchValue){
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actally it was a " + switchValue);
                break;
            default:
                System.out.println("Was neither");
                break;
        }
        System.out.println("------------------------");

        //ALSO ENHANCED SWITCH STATEMENT
        switch (switchValue) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5 -> System.out.println("Was a 3, or a 4, or a 5");
            default -> System.out.println("Was neither");
        }
        System.out.println("--------------------------");

        //CHALLENGE
        char myChar = 'G';
        switch (myChar){
            case 'A','B','C','D','E' -> System.out.println("The letter is " + myChar);
            default -> System.out.println("Letter not found");
        }
    }


}
