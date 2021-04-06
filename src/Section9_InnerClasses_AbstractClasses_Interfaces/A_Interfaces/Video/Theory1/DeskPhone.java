package Section9_InnerClasses_AbstractClasses_Interfaces.A_Interfaces.Video.Theory1;

public class DeskPhone implements ITelephone {

    //FIELDS
    private int myNumber;
    private boolean isRinging;

    //CONSTRUCTORS
    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    //ALL METHODS FROM THE INTERFACE NEED TO BE IMPLEMENTED
    @Override
    public void powerOn() {
        System.out.println("No action taken, deskphone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring Ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
