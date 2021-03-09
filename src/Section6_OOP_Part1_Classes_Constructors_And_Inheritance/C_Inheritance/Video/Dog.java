package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.C_Inheritance.Video;

public class Dog extends Animal{

    //INSTANCE VARIABLES - Here unique to the class Dog
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //CONSTRUCTOR
    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //METHODS
    private void chew(){
        System.out.println("Dog.chew() Called");
    }

    public void walk(){
        System.out.println("Dog.walk() Called");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run() Called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() Called");
    }


    //OVERRIDES
    @Override
    public void eat() {
        System.out.println("Dog.eat() Called");
        chew();
        super.eat();
    }


    @Override
    public void move(int speed) {
        System.out.println("Dog.move() Called");
        moveLegs(speed);
        super.move(speed);
    }
}
