package Section7_OOP_Part2_Composition_Encapsulation_Polymorphism.A_Composition.Video.Computer;
//INHERITANCE - "IS PART OF" RELATIONSHIP (Car is part of vehicle class)
//public class Car extends Vehicle{
//    private int doors;
//    private int engineCapacity;
//
//    public Car(int doors, int engineCapacity) {
//        this.doors = doors;
//        this.engineCapacity = engineCapacity;
//    }

//COMPOSITION - "HAS A" RELATIONSHIP (Computer has a motherboard, has a keyboard)
public class Motherboard{

    //INSTANCE VARIABLES
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    //CONSTRUCTORS
    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    //METHODS
    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}
