package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.C_Inheritance.Video;

public class Fish extends Animal{

    //INSTANCE VARIABLES
    private int gills;
    private int fins;
    private int eyes;

    //CONSTRUCTORS

    public Fish(String name, int brain, int body, int size, int weight, int gills, int fins, int eyes) {
        super(name, brain, body, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    //METHODS
    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }
    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

}
