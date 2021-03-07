package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.B_Constructors.Exercises.CarpetCostCalculator;

public class Calculator {
    //INSTANCE VARIABLES
    private Floor floor;
    private Carpet carpet;

    //CONSTRUCTORS
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    //METHODS
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}
