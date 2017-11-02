/*
  Purpose: Provide a static method that returns the largest element of an ArrayList, 
           provided that the elements are instances of Measurable. 
           Be sure to return a value of type T.
  Inputs: This program does not ask use for any input.
  Output: Largest element in the arraylist.
 */
import java.util.ArrayList;     //import ArrayList
import java.util.Collections;   //import Collections

public class GenericTester {
    public static void main(String[] args) {
        //creating a new array list
        ArrayList<Measurable> gList = new ArrayList<Measurable>();
        //create new Circle objects
        gList.add(new Circle());
        gList.add(new Circle(3.0));
        gList.add(new Circle(6.0));
        gList.add(new Circle(11.0));
        //create new Rectangle objects
        gList.add(new Rectangle());
        gList.add(new Rectangle(3.0, 4.0));
        gList.add(new Rectangle(4.0, 5.0));
        //create new Triangle objects
        gList.add(new Triangle());
        gList.add(new Triangle(3.0, 4.0, 5.0));

        //for loop to print out all objects 
        for (int i = 0; i < gList.size(); i++) {
            //shape reference to a single element            
            Measurable shape = gList.get(i);
            //print out the current object
            System.out.println(shape);
        }
        //print expected largest object and the actual largest object
        System.out.println("\nExprected largest area is " + gList.get(3));
        System.out.println("Largeset is " + Measurable.getLargest(gList));
        //sort the arraylist in ascending order
        Collections.sort(gList);
        System.out.println("\nSorted ArrayList: " + gList);
    }//end main

}//end GenericTester
