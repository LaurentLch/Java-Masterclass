package Section9_InnerClasses_AbstractClasses_Interfaces.A_Interfaces.Video;

public interface ITelephone { // Convention use letter I before the interface name
    //Defining the methods that form the interface
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

//Don't write code in the interface. You write code in the class. We defined here the contract, the parameters and return types that are valid for each methods, that overall will make the class valid.
// The interface exists to define the methods that must be implemented, so private or public is useless.
}
