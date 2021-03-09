package Section7_OOP_Part2_Composition_Encapsulation_Polymorphism.B_Encapsulation.Video.Exercises;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <=100) ? tonerLevel : -1;
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= 100){
            return (tonerLevel + tonerAmount > 100) ? -1 : (tonerLevel += tonerAmount);
        }
        return -1;
    }

    public int printPages (int pages){
        int pagesToPrint = (isDuplex) ? ((pages/2) + (pages%2)) : pages;
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
