//Chiild Circle class extends from parent GeometricObject class

public class Circle extends GeometricObject {

    //initialize radius instance
    double radius;

    //default constructor method
    public Circle() {
        this.radius = 1.0;
    }

    //overload constructor method
    public Circle(double radi) {
        this.radius = radi;
    }

    //Construct a Circle object with the specified color and filled value
    public Circle(String color, boolean filled, String name, double radi) {
        super(color, filled, name);
        this.radius = radi;
    }

    //getter method
    public double getRadius() {
        return radius;
    }

    //setter method
    public void setRadius(double radi) {
        this.radius = radi;
    }

    //returning the area of the circle
    public double getArea() {
        return Math.PI;
    }

    //returning the perimeter of the circle
    public double getPerimeter() {
        return 2 * 3.1415926 * radius;
    }

    //returning the diameter of the circle
    public double getDiameter() {
        return radius * 2;
    }

    //Return a string representation of this object
    public String toString() {
        return "Rectangle object's radius is " + radius + ", perimeter is " + getPerimeter() + ", area is " + getArea() + super.toString();
    }
}//end Circle class
