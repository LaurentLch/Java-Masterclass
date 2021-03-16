package Section8_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.B_ArrayList.Challenge;

public class Contact {
    //INSTANCE VARIABLES ///////////////////////////////////////////
    private String name;
    private String phoneNumber;

    //CONSTRUCTORS /////////////////////////////////////////////////
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //GETTERS //////////////////////////////////////////////////////
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //METHOD CREATE CONTACT ////////////////////////////////////////
    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }
}

