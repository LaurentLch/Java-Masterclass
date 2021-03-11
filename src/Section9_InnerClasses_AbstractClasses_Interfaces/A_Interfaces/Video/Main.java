package Section9_InnerClasses_AbstractClasses_Interfaces.A_Interfaces.Video;

public class Main {
    public static void main(String[] args) {

        ITelephone timsPhone;

        timsPhone = new DeskPhone(123456);

        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();
        System.out.println("--------------------------");

        timsPhone = new MobilePhone(123456789);
//        timsPhone.powerOn();
        timsPhone.callPhone(123456789);
        timsPhone.answer();



    }
}
