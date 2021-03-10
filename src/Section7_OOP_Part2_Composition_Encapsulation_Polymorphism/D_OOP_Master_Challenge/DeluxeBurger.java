package Section7_OOP_Part2_Composition_Encapsulation_Polymorphism.D_OOP_Master_Challenge;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe Burger", "Bacon & Cheese", 19.10, "White");
        super.addHamburgerAddition1("Chips", 0 );
        super.addHamburgerAddition2("Drink", 0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additional ingredients authorized");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additional ingredients authorized");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additional ingredients authorized");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additional ingredients authorized");
    }
}
