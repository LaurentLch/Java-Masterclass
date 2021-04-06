package Section9_InnerClasses_AbstractClasses_Interfaces.A_Interfaces.Video.Theory1;


public class Main {
    // INTERFACE - Specifies methods that a particular class that implements the interface must implement
    // Interface is abstract -> no code in it.
    // The idea is to use an interface to provide a common behavior that can be used by several classes by having them all implement the same interface.

    public static void main(String[] args) {
        ITelephone timsPhone = new DeskPhone(1234567890);
        timsPhone.powerOn();
        timsPhone.callPhone(1234567890);
        timsPhone.answer();
        System.out.println("-----------------------");

        timsPhone = new MobilePhone(987654321);
        timsPhone.powerOn();
        timsPhone.callPhone(987654321);
        timsPhone.answer();
        System.out.println("-----------------------");

    }
}
