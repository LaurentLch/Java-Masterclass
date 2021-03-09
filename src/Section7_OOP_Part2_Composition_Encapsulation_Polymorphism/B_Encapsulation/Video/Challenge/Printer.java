package Section7_OOP_Part2_Composition_Encapsulation_Polymorphism.B_Encapsulation.Video.Challenge;

public class Printer {
    //INSTANCE VARIABLES
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    //CONSTRUCTOR
    public Printer(int tonerLevel, boolean isDuplex) { // we leave out int pagesPrinted because it is not in the printer itself
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <=100)? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }


    //METHODS
    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <=100){
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if (this.isDuplex){
            pagesToPrint = (pages/2) + (pages%2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
