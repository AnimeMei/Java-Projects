//Chiild Rectangle class extends from parent GeometricObject class

public class Rectangle extends GeometricObject {

    //initalize intances
    double height, width;

    //default constructor
    Rectangle() {
        this.height = 1.0;
        this.width = 1.0;
    }

    //overload constructor
    Rectangle(double w, double h) {
        this.height = h;
        this.width = w;
    }
    
    //Construct a Rectangle object with the specified color and filled value
    Rectangle(String color, boolean filled, String name, double w, double h) {
        super(color, filled, name);
        this.height = h;
        this.width = w;
    }

    //getter methods
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    //set witdth method
    public void setWidth(double w) {
        this.width = w;
    }

    //set height method
    public void setHeight(double h) {
        this.height = h;
    }

    //returning the area of the circle
    public double getArea() {
        return width * height;
    }

    //returning the perimeter of the circle
    public double getPerimeter() {
        return 2 * (width + height);
    }

    //Return a string representation of this object
    public String toString() {
        return "Rectangle object's width is " + width + ", height is " + height + ", perimeter is " + getPerimeter() + ", area is " + getArea() + super.toString();
    }
}//end Rectangle class
