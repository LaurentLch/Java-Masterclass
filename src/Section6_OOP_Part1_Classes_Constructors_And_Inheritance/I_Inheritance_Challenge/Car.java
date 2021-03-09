package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.I_Inheritance_Challenge;

public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1; // Assume 1st gear at start
    }

    public void changeGear(int currentGear) { //SETTER - setCurrentGears
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeSpeed(int speed, int direction){
        System.out.println("Car.changeSpeed(): Speed " + speed + " direction " + direction);
        move(speed, direction);
    }

}
