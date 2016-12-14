//abstract GeometricObject class implemented comparable
public abstract class GeometricObject implements Comparable {
    //initialize instance variables 
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    private String name = "noname";

    //Construct a default geometric object 
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    //Construct a geometric object with the specified color and filled value
    public GeometricObject(String color, boolean filled, String name) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
        this.name = name;
    }

    //Return color
    public String getColor() {
        return color;
    }

    //Set a new color
    public void setColor(String color) {
        this.color = color;
    }

    //Return filled. Since filled is boolean, its get method is named isFilled
    public boolean isFilled() {
        return filled;
    }

    //Set a new filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //Get dateCreated
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    //Return name
    public String getName() {
        return name;
    }

    //Set a new name
    public void setName(String name) {
        this.name = name;
    }

    //Return a string representation of this object
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color
                + " and filled: " + filled;
    }

    //create abstract method for getArea and getPerimeter
    public abstract double getArea();
    public abstract double getPerimeter();

    //comapreTo method for comparing two objects
    public int compareTo(Object o) {
        if (this.getArea() < ((GeometricObject) o).getArea()) {
            return -1;
        } else if (this.getArea() > ((GeometricObject) o).getArea()) {
            return 1;
        } else {
            return 0;
        }
    }//end compareTo

    //comparing geomtric objects and returning the max 
    public static GeometricObject max(Object a, Object b) {
        if (((GeometricObject) a).compareTo(b) == -1) {
            return (GeometricObject) b;
        } else {
            return (GeometricObject) a;
        }
    }//end max
    
}//end GeometricObject class
