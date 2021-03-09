package Section7_OOP_Part2_Composition_Encapsulation_Polymorphism.A_Composition.Video.Computer;

public class Monitor {
    //INSTANCE VARIABLES
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    //CONSTRUCTORS

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    //METHODS
    public void drawPixelAt (int x, int y, String color){
        System.out.println("Drawing pixel at " + x +" , " + y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
