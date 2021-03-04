package Section5_Control_Flow_Statements;

import java.util.Scanner;

public class L_Reading_User_Input {
    //Scanner uses parseInt internally here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //System.out dumps text in the output. System.in does the opposite, it takes input from the console and dumps it in the function


        //Now we retrieve a birth year
        System.out.println("Enter your year of birth: ");
        int yearofbirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character (enter key)

        //Now we retrieve the name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); // nextline method to read an input from the scanner

        int age = 2021 - yearofbirth;

        System.out.println("Your name is " + name + " and you are " + age + " years old");

        scanner.close(); // Close the scanner after using it


    }
}
