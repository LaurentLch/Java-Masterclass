package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.C_Inheritance.Exercises.PoolArea;

public class Cuboid extends Rectangle{
    //INSTANCE VARIABLES
    private double height;

    //CONSTRUCTORS - INITIALIZATION OF FIELDS

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = (height<0)? 0:height;
    }


    //METHODS
    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return getArea() * height;
    }


}

