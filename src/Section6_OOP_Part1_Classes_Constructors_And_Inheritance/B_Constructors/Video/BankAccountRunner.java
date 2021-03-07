package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.B_Constructors.Video;

public class BankAccountRunner {

    public static void main(String[] args) {
//        BankAccount bobsAccount = new BankAccount();
        //ALL THE BELOW CAN BE CALLED WITH CONSTRUCTOR
//        bobsAccount.setAccountNumber("1234567890");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setName("Bob Smith");
//        bobsAccount.setEmail("bob@email.com");
//        bobsAccount.setPhoneNumber("(087)123-456");

        BankAccount bobsAccount = new BankAccount(
                "123456789",
                0.0,
                "Bob Smith",
                "bob@email.com",
                "(001)-234-567"
        );

        System.out.println("---------------------");
        System.out.println(bobsAccount.getName());
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getEmail());
        System.out.println(bobsAccount.getPhoneNumber());
        System.out.println(bobsAccount.getBalance());
        System.out.println("---------------------");


        bobsAccount.deposit(100.0);
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(50.0);
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(60.0);
        System.out.println(bobsAccount.getBalance());

        System.out.println("---------------------");
        BankAccount timsAccount = new BankAccount(
                "56789",
                80.0,
                "Tim John",
                "TJ@email.com",
                "(001)-567"
        );

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.0);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.0, "tim@gmail.com");
        System.out.println(person3.getName() + ". Email is: " + person3.getEmail());
    }
}
