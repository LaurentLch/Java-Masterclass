package Section7_OOP_Part2_Composition_Encapsulation_Polymorphism.B_Encapsulation.Video.Challenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,false);
        System.out.println("Initial Page Count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages Printed = " + pagesPrinted + ". New Total " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages Printed = " + pagesPrinted + ". New Total " + printer.getPagesPrinted());

    }
}
