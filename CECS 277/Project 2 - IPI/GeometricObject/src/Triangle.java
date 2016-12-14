//Chiild Triangle class extends from parent GeometricObject class

public class Triangle extends GeometricObject {

    //initialize instance variables for each sides   
    double side1, side2, side3;

    //default constructor method    
    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    //overload constructor method    
    public Triangle(double s1, double s2, double s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    //Construct a Triangle object with the specified color and filled value
    public Triangle(String color, boolean filled, String name, double s1, double s2, double s3) {
        super(color, filled, name);
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    //getter method
    public double getSide1() {
        return side1;
    }

    //getter method
    public double getSide2() {
        return side2;
    }

    //getter method
    public double getSide3() {
        return side3;
    }

    //set side1 method
    public void setSide1(double s1) {
        this.side1 = s1;
    }

    //set side2 method
    public void setSide2(double s2) {
        this.side2 = s2;
    }

    //set side3 method
    public void setSide3(double s3) {
        this.side3 = s3;
    }

    //return the perimeter 
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        //return, solving the area of the Triangle
        double s = (getPerimeter() / 2);
        double a = s - side1;
        double b = s - side2;
        double c = s - side3;
        return Math.sqrt(s * (a) * (b) * (c));
    }

    //Return a string representation of this object
    public String toString() {
        return "Triangle object's side1 is " + side1 + ", side2 is " + side2 + " side2 is " + side3 + ", perimeter is " + getPerimeter() + ", area is " + getArea() + super.toString();
    }
}//end Triangle class
