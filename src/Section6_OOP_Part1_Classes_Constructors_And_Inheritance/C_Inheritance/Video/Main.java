package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.C_Inheritance.Video;

import Section6_OOP_Part1_Classes_Constructors_And_Inheritance.C_Inheritance.Video.Animal;
import Section6_OOP_Part1_Classes_Constructors_And_Inheritance.C_Inheritance.Video.Dog;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog(
                "Yorkie",
                1,
                8,
                20,
                1,
                2,
                4,
                4,
                30,
                "Long"
        );

        dog.eat();
        System.out.println("---------------------");

        dog.walk();
        System.out.println("---------------------");

        dog.run();
        System.out.println("---------------------");



    }
}
