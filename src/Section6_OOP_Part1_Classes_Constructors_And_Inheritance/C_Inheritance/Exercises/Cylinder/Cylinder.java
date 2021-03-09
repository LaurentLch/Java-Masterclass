package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.C_Inheritance.Exercises.Cylinder;

public class Cylinder extends Circle{
    //INSTANCE VARIABLES
    private double height;

    //CONSTRUCTORS
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = (height < 0) ? 0 : height;
    }


    //INSTANCE METHODS
    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea() * getHeight();
    }
}
