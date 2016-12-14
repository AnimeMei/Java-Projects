/*
  Purpose: This program creating geometric objects for Inheritance, polymorphism and interface practice.
  Inputs: This program does not ask use for any input.
  Output: Dimension, area and perimeter of geometric objects.
 */
import java.util.ArrayList;
import java.util.Collections;

public class GeoObjectTester {

    //creating a new array list
    ArrayList<GeometricObject> gList = new ArrayList<GeometricObject>();

    public void sortList() {
        //comparing, finding out and print out the max area of geometric object
        for (int i = 0; i < gList.size() - 1; i++) {
            System.out.println("Max object is: " + GeometricObject.max(gList.get(i), gList.get(i + 1)));
        }
        //sort the arraylist
        System.out.println(" ");
        Collections.sort(gList);
        //print out the sorted list using the output method
        output();
    }//end sortList method

    //format output function
    public void output() {
        //for loop for elements iteration inside the arraylist        
        for (int i = 0; i < gList.size(); i++) {
            //shape reference to a sigle element            
            GeometricObject shape = gList.get(i);
            //print out the current object
            System.out.println(shape);
        }
    }//end output method

    //adding new geometric objects into the arraylist function
    public void addToList() {
        //adding new Circle, Rectangle, and Triangles to the arraylist
        gList.add(new Circle());
        gList.add(new Circle(3.0));
        gList.add(new Circle("Blue", false, "Mr.Cricle", 6.0));
        gList.add(new Rectangle());
        gList.add(new Rectangle(3.0, 4.0));
        gList.add(new Rectangle("Red", true, "Mr.Rec", 5.0, 7.0));
        gList.add(new Triangle());
        gList.add(new Triangle(3.0, 4.0, 5.0));
        gList.add(new Triangle("Green", true, "Mr.Tri", 3.0, 4.0, 5.0));
    }

    //test all the constructors and the methods.
    public void sampleTest() {
        //print out objects without setters modification              
        output();

        //for loop for elements iteration inside the arraylist
        for (int i = 0; i < gList.size(); i++) {
            //shape reference to a sigle element
            GeometricObject shape = gList.get(i);
            //instanceof to find out object type
            if (shape instanceof Circle) {
                //testing the setter method, values set to a random number 
                ((Circle) shape).setRadius((double) Math.random() * 50 + 1);
            } else if (shape instanceof Rectangle) {
                ((Rectangle) shape).setWidth((double) Math.random() * 50 + 1);
                ((Rectangle) shape).setHeight((double) Math.random() * 50 + 1);
            } else if (shape instanceof Triangle) {
                //set sides' value to random from range of 30 to 50
                ((Triangle) shape).setSide1((double) Math.random() * 21 + 30);
                ((Triangle) shape).setSide2((double) Math.random() * 21 + 30);
                ((Triangle) shape).setSide3((double) Math.random() * 21 + 30);
            }
        }//end for

        System.out.println("\n**************After setters modification*************************");
        //print out after modified objects with setter methods        
        output();
    }//end sampleTest

    //main
    public static void main(String[] args) {
        //create GeoObjectTester
        GeoObjectTester test1 = new GeoObjectTester();
        System.out.println("******* Part I *************************************************");
        System.out.println("****************************************************************");

        //adding geometric objects into an arraylist
        test1.addToList();
        //test all the constructos and methonds
        test1.sampleTest();

        System.out.println("\n******* Part II Sorted *****************************************");
        System.out.println("****************************************************************");
        //sort list function call
        test1.sortList();
    }//end main
}//end GeoObjectTester
