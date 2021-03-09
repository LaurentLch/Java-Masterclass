package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.C_Inheritance.Exercises.PoolArea;

public class Rectangle {
    //INSTANCE VARIABLES
    private double width;
    private double length;

    //CONSTRUCTORS - INITIALIZATION OF FIELDS

    public Rectangle(double width, double length) {
        this.width = (width<0)? 0:width;
        this.length = (length<0)? 0:length;
    }

    //METHODS
    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public double getArea(){
        return width * length;
    }

}
