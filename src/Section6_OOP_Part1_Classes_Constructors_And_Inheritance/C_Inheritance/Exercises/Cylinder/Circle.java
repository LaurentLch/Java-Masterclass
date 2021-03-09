package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.C_Inheritance.Exercises.Cylinder;

public class Circle {

    //INSTANCE VARIABLES
    private double radius;

    //CONSTRUCTORS
    public Circle(double radius) {
        this.radius = (radius < 0) ? 0 : radius;
    }


    //INSTANCE METHODS
    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return (radius * radius * Math.PI);
    }


}
