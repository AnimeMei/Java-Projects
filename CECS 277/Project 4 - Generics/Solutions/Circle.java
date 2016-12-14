//Chiild Circle class extends from parent Measurable class

public class Circle extends Measurable {

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
        return Math.PI * (radius * radius);
    }

    //returning the perimeter of the circle
    public double getPerimeter() {
        return 2 * 3.1415926 * radius;
    }

    //returning the diameter of the circle
    public double getDiameter() {
        return radius * 2;
    }

    public double getMeasure() {
        return getArea();
    }

    //Return a string representation of this object
    public String toString() {
        return "Circle: area is " + getMeasure();
    }

}//end Circle class

