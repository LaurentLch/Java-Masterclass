package Section7_OOP_Part2_Composition_Encapsulation_Polymorphism.C_Polymorphism.Challenge;
//////////////////////////////////////////////////////////////////
class Car {
    private boolean hasEngine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car( int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }
}
//////////////////////////////////////////////////////////////////
class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()"; // used here to get class name
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +" -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +" -> brake()";
    }
}

//////////////////////////////////////////////////////////////////

public class Main {
    public static void main(String[] args) {

        Car car = new Car(8,"Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println("-------------------");

        Mitsubishi mitsubishi = new Mitsubishi(8,"Base Mitsubishi");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        System.out.println("-------------------");

        Vw vw = new Vw(8,"Base Vw");
        System.out.println(vw.startEngine());
        System.out.println(vw.accelerate());
        System.out.println(vw.brake());
        System.out.println("-------------------");


    }
}
