package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.B_Constructors.Exercises.Point;

public class PointRunner {

    public static void main(String[] args) {
        Point firstPoint = new Point(6,5);
        Point secondPoint = new Point(3,1);

        System.out.println("distance (0,0) is " + firstPoint.distance());
        System.out.println("distance (second) is " + firstPoint.distance(secondPoint));
        System.out.println("distance (2,2) is " + firstPoint.distance(2,2));

        Point point = new Point();
        System.out.println("distance() =  " + point.distance());
    }
}
