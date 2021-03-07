package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.B_Constructors.Exercises.Point;

public class Point {

    //INSTANCE VARIABLES
    private int x;
    private int y;

    //CONSTRUCTORS
    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //METHODS

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((0 - getX()) * (0 - getX()) + (0 - getY()) * (0 - getY()));

    }

    public double distance(int x, int y) {
        return Math.sqrt((x - getX()) * (x - getX()) + (y - getY()) * (y - getY()));
    }

    public double distance (Point point){
        return distance (point.x, point.y);
    }
}
