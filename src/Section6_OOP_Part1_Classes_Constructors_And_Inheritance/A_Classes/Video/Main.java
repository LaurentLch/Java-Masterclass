package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.A_Classes.Video;

import Section6_OOP_Part1_Classes_Constructors_And_Inheritance.A_Classes.Video.Car;

public class Main {

    public static void main(String[] args) {

        //Create the Car object
        Car porsche = new Car();
        Car vw = new Car();

        System.out.println("Model is " + porsche.getModel()); // will print null because default of class is null (string as well)

        porsche.setModel("911"); // Calling the setModel method and updating that to 911

        System.out.println("Model is " + porsche.getModel());
    }
}


//NullPointerException is when you defined a type porsche but did not initialize it.
