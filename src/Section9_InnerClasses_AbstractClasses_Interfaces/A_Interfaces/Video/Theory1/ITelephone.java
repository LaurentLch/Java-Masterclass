package Section9_InnerClasses_AbstractClasses_Interfaces.A_Interfaces.Video.Theory1;

public interface ITelephone {
//    Specifies methods that a particular class that implements the interface must implement
    // Return types for each method that are valid
    public void powerOn();
    public void dial (int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();

}
