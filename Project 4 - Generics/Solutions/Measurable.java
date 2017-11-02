import java.util.ArrayList; //import ArrayList
/**
 * Describes any class whose objects can be measured.
 *
 * @param <T>
 */
abstract public class Measurable<T extends Measurable<T>> implements Comparable<T> {
    /**
     * Computes the measure of the object.
     *
     * @return the measure
     */
    abstract public double getMeasure();  
    //static generic method that returns the largest element of an ArrayList
    public static <T extends Measurable> T getLargest(ArrayList<T> objects) {
        //define largest a generic type
        T largest = objects.get(0);
        //for loop to go through the entire arraylist
        for (int i = 1; i < objects.size(); i++) {
            T obj = objects.get(i);
            //comparing two objects
            if (obj.getMeasure() > largest.getMeasure()) {
                //assigning the largest element into largest
                largest = obj;
            }
        }
        return largest;
    }//end getLargest
    
    /**
     * CompareTo method compares two objects 
     * @param <T>
     * @param a
     * @return
     */
    public int compareTo(T a) {
        if (this.getMeasure() < a.getMeasure()) {
            return -1;
        } else if (this.getMeasure() > a.getMeasure()) {
            return 1;
        } else {
            return 0;
        }
    }//end compareTo
}//end Measurable
