package Section7_OOP_Part2_Composition_Encapsulation_Polymorphism.A_Composition.Video.Computer;

public class PC{
    private Box box;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Box box, Monitor monitor, Motherboard motherboard) {
        this.box = box;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

//    public Box getBox() {
//        return box;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }

    public void powerUp(){
        box.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //Fancy Graphics
        monitor.drawPixelAt(1200,50,"Yellow");
    }

}
