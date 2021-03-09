package Section7_OOP_Part2_Composition_Encapsulation_Polymorphism.A_Composition.Video.Computer;

public class Main {
    public static void main(String[] args) {

        Box box = new Box("220B", "Dell", "220", new Dimension(20,20,5));
        Monitor monitor = new Monitor("20 Inch Beast", "Acer", 27, new Resolution(2540,1440));
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC pc = new PC(box, monitor, motherboard);

//        pc.getMonitor().drawPixelAt(1500,1200,"red");
//        pc.getMotherboard().loadProgram("Windows 1.0");
//        pc.getBox().pressPowerButton();

        pc.powerUp();


    }
}
