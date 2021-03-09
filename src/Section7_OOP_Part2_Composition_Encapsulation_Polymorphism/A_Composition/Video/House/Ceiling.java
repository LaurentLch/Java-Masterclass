package Section7_OOP_Part2_Composition_Encapsulation_Polymorphism.A_Composition.Video.House;

public class Ceiling {
    private int height;
    private String paintedColor;

    public Ceiling(int height, String paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public String getPaintedColor() {
        return paintedColor;
    }
}
