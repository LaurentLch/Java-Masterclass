package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.B_Constructors.Exercises.CarpetCostCalculator;

public class Carpet {
    //INSTANCE VARIABLES
    private double cost;

    //CONSTRUCTORS
    public Carpet(double cost) {
        this.cost = (cost<0) ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }
}
