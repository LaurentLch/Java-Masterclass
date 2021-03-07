package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.B_Constructors.Exercises.CarpetCostCalculator;

public class Floor {

    //INSTANCE VARIABLES
    private double width;
    private double length;

    //CONSTRUCTORS
    public Floor (double width, double length) {
        this.width = (width<0)? 0 : width;
        this.length = (length<0)? 0 : length;
    }

    //METHOD
    public double getArea() {
        return (width * length);
    }




}
