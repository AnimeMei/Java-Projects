//Chiild Rectangle class extends from parent Measurable class

public class Rectangle extends Measurable {

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

    public double getMeasure() {
        return getArea();
    }

    //Return a string representation of this object
    public String toString() {
        return "Rectangle area is " + getMeasure();
    }

}//end Rectangle class

