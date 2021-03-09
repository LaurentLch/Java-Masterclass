package Section7_OOP_Part2_Composition_Encapsulation_Polymorphism.A_Composition.Video.Computer;

public class Box {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimension dimension;

    public Box(String model, String manufacturer, String powerSupply, Dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    public void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
