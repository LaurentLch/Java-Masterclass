package Section5_Control_Flow_Statements;

public class DD_The_WHILE_And_DO_WHILE_Statement {

//    while(condition){
//        //Statements
//    }
//
//    do {
//        //Statements
//    }while(condition);
//
//    NB: Do-WHILE the code is executed at least once and then the condition is checked
//
    public static void main(String[] args) {
        int count = 0;
        while (count != 6) {
            System.out.println("The count is " + count);
            count++;
        }
        System.out.println("-------------------------");


        // SAME AS BELOW
        for (count = 0; count < 6; count++) {
            System.out.println("The count is " + count);
        }

        System.out.println("-------------------------");


        count = 0;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("-------------------------");


        //DO WHILE
        count = 0;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);
        System.out.println("-------------------------");


        //CHALLENGE MAIN
        System.out.println(isEvenNumber(8));
        System.out.println(isEvenNumber(5));
        System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(10));
    }

    //CHALLENGE
    public static boolean isEvenNumber(int number) {
        return ((number % 2) == 0 ? true : false);
    }
}

