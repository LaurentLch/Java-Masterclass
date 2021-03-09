package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.C_Inheritance.Video;

public class Animal {
    //INSTANCE VARIABLES
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    //CONSTRUCTORS
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    //METHODS
    public void eat(){
        System.out.println("Animal.eat() Called");
    }

    public void move(int speed){
        System.out.println("Animal is moving at " + speed);
    }


}
