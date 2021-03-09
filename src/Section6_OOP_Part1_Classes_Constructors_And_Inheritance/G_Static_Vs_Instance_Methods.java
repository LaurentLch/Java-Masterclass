package Section6_OOP_Part1_Classes_Constructors_And_Inheritance;

public class G_Static_Vs_Instance_Methods {

    //STATIC METHODS
    //  Declared using a static modifier
    //  Usually used for operations that don't require any data from an instance of the class (from 'this').
    //  Whenever you see a method that does not use instance variables that method should be declared as a static method.
    //  For example main is a static method and it is called by the JVM when it starts an application.

//    class Calculator{
//        public static void printSum(int a, int b){
//            System.out.println("Sum = " + (a+b));
//        }
//    }
//
//    public class Main{
//        public static void main(String[] args) {
//            Calculator.printSum(2,10);
//            printHello();
//        }
//
//        public static void printHello(){
//            System.out.println("Hello");
//        }
//    }



/*
// hello
*/
    //INSTANCE METHODS
    //  Instance methods belong to an instance of a class
    //  To use an instance method we have to instantiate the class first usually by using the --> new keyword.
    //  Instance methods can access instance methods and instance variables directly.
    //  Instance methods can also access static methods and static variables directly.

//    Class Dog{
//        public void bark(){
//            System.out.println("Woof");
//        }
//    }
//
//    public class Main{
//        public static void main(String[] args) {
//            Dog rex = new Dog(); // Create instance
//            rex.bark(); // Call instance method
//        }
//    }

}
