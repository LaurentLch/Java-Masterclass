package Section6_OOP_Part1_Classes_Constructors_And_Inheritance.B_Constructors.Exercises.WallArea;

public class Wall {

    //INSTANCE VARIABLES
    private double height;
    private double width;

    //CONSTRUCTOR
    public Wall() {
    }

    public Wall(double width, double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;

        }
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    //METHODS - GETTERS
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    //METHODS - SETTERS
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;

        }
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getArea(){
        return width * height;
    }

}

//    Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.
//
//        The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters width and height of type double and it needs to initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the height parameter is less than 0 it needs to set the height field value to 0.
//
//        Write the following methods (instance methods):
//        * Method named getWidth without any parameters, it needs to return the value of width field.
//        * Method named getHeight without any parameters, it needs to return the value of height field.
//        * Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
//        * Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.
//        * Method named getArea without any parameters, it needs to return the area of the wall.
//
//
//        TEST EXAMPLE
//
//        → TEST CODE:
//
//        1 Wall wall = new Wall(5,4);
//        2 System.out.println("area= " + wall.getArea());
//        3
//        4 wall.setHeight(-1.5);
//        5 System.out.println("width= " + wall.getWidth());
//        6 System.out.println("height= " + wall.getHeight());
//        7 System.out.println("area= " + wall.getArea());
//
//        → OUTPUT:
//
//        area= 20.0
//        width= 5.0
//        height= 0.0
//        area= 0.0
//
//
//        NOTE: All methods should be defined as public NOT public static.
//
//        NOTE: In total, you have to write 5 methods and 2 constructors.
//
//        NOTE: Do not add a main method to the solution code.

//ALSO OTHER POSSIBLE SOLUTION WITH TERNARY OPERATORS
//public class Wall {
//    private double width;
//    private double height;
//
//    public Wall(double width, double height) {
//        this.width = width < 0 ? 0 : width;
//        this.height = height < 0 ? 0 : height;
//    }
//
//    public Wall() {
//        this(0, 0);
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setWidth(double width) {
//        this.width = width < 0 ? 0 : width;
//    }
//
//    public void setHeight(double height) {
//        this.height = height < 0 ? 0 : height;
//    }
//
//    public double getArea() {
//        return width * height;
//    }
//}