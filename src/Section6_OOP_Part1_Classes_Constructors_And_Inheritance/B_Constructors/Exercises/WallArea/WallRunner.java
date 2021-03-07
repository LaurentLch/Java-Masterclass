package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.B_Constructors.Exercises.WallArea;

public class WallRunner {

    public static void main(String[] args) {
        Wall wall = new Wall(5,4);

        System.out.println("Area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("Width = " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
