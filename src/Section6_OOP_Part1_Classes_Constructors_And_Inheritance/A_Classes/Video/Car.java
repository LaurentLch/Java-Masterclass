package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.A_Classes.Video;

public class Car {
    // public is an access modifier - means unrestricted access to the class. Other access modifiers are private, protected, etc.
    // Fields are usually using "private" - Encapsulation. The representation of the object (fields and methods) can be hidden from the outside of the objects definition.

    //FIELDS - INSTANCE VARIABLES - characteristics of the objects
    private int doors;
    private int wheels;
    private String model; // model here is a field
    private String engine;
    private String color;

    //METHOD - SETTER
    public void setModel(String model) { // model here is a parameter
        String validModel = model.toLowerCase();//Validator
        if(validModel.equals("porsche") || validModel.equals("vw")){
            this.model = model;// "this" refers to the field model -> is equal to the parameter model
        }else{
            this.model = "Unknown";
        };
    }

    //METHOD - GETTER
    public String getModel() {
        return this.model;
    }
}
