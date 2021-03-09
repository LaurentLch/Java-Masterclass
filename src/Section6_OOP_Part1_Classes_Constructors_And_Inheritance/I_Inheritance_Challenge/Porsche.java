package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.I_Inheritance_Challenge;

public class Porsche extends Car{

    private int roadServiceMonths;

    public Porsche(int roadServiceMonths) {
        super("Porsche", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate (int rate){
        int newSpeed = getCurrentSpeed() + rate;
        if (newSpeed == 0){
            stop();
            changeGear(1);
        }else if (newSpeed > 0 && newSpeed <=10){
            changeGear(1);
        }else if (newSpeed >10 && newSpeed <=20){
            changeGear(2);
        }else if (newSpeed> 20){
            changeGear(3);
        }else{
            changeGear(4);
        }
        
        if(newSpeed > 0){
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
