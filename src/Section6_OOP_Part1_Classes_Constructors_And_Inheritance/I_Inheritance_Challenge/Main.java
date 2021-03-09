package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.I_Inheritance_Challenge;

public class Main {
    public static void main(String[] args) {
        Porsche porsche = new Porsche(36);

        porsche.steer(45);
        System.out.println("------------------------");
        porsche.accelerate(30);
        System.out.println("------------------------");
        porsche.steer(90);
        porsche.accelerate(20);
        System.out.println("------------------------");
        porsche.accelerate(-42);

    }
}
