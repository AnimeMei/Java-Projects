// ***************************************************************************
// Lab 2		
// Class: CS 111C		Date:	 3/9/16
// Array-based implementation of the ADT list.
// The ComparableListArrayBased class contains methods to utilize ADT operations.
// An array of a list of comparable items is instantiated.
//  numItems keeps track of the number of items in the list, working in tandem with exceptions.
//  Exceptions are thrown indexes are out of range upon using the add,remove, and get methods
// The isInAscendingOrder method compares the passed input data from the TestList class.
//  A loop is used to compare subsequent values to eachother by assinging them into an array
// and comparing the indices.
// ****************************************************************************

import java.util.Scanner;
import java.util.StringTokenizer;

public class ComparableListArrayBased implements ComparableListInterface  {

  private static final int MAX_LIST = 50;
  private Comparable items[];  // an array of list items
  private int numItems;  // number of items in list

  //default constructor
  public ComparableListArrayBased() {
    items = new Comparable[MAX_LIST];
    numItems = 0;
  }

  public boolean isEmpty() {
    return (numItems == 0);
  }

  public int size() {
    return numItems;
  }

  public void removeAll() {
    // Creates a new array; marks old array for
    // garbage collection.
    items = new Comparable[MAX_LIST];
    numItems = 0;
  }

  public void add(int index, Comparable item) throws  ListIndexOutOfBoundsException {
    if (numItems >= MAX_LIST) {
      throw new ListException("ListException on add");
    }
    if (index >= 0 && index <= numItems) {
      /* make room for new element by shifting all items at
       positions >= index toward the end of the
       list (no shift if index == numItems+1) */
      for (int pos = numItems-1; pos >= index; pos--) {
          items[pos+1] = items[pos];
      }
      // insert new item
      items[index] = item;
      numItems++;
    }
    else {  // catch index out of range exception
      throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on add");
    }
  }

  public Comparable get(int index) throws ListIndexOutOfBoundsException {
    if (index >= 0 && index < numItems) {
      return items[index];
    }
    else  {  // catch index out of range exception
      throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on get");
    }
  }

  public void remove(int index) throws ListIndexOutOfBoundsException {
    if (index >= 0 && index < numItems) {
      /* delete item by shifting all items at
       positions > index toward the beginning of the list
       (no shift if index == size) */
      for (int pos = index + 1; pos < numItems; pos++) {
        items[pos-1] = items[pos];
      }
      numItems--;
    }
    else {  // catch index out of range exception
        throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on remove");
    }
  }


   static public void main(String args[]) {
   }

//For solution 1
//isInAscendingOrder is independent of the ADT implementation
   public Boolean isInAscendingOrder1(ComparableListArrayBased aList) {
// -------------------------------------------------------------------------------
// Precondition: aList either contains data or is empty.
// Postcondition: if the numbers are not inputed in ascending order,
// returns false.  If in ascending order, returns true.
//--------------------------------------------------------------------------------
    int size = aList.size();

    for(int i=0; i<size -1; i++) { //loop to compare indices
        for(int j=1; j<size; j++){


             if ( aList.get(i).compareTo(aList.get(i+1))>0 ){  //Compares subsequent numbers
                 System.out.println("Your list of integers is not in ascending order.");
               return false;
            }
        }
    }
    System.out.println("Your list of integers is in ascending order.");
    return true;
 }


//For solution 2
//isInAscendingOrder is independent of the ADT implementation
    public Boolean isInAscendingOrder2(ComparableListArrayBased aList) {
 // -------------------------------------------------------------------------------
 // Precondition: aList either contains data or is empty.
 // Postcondition: if the numbers are not inputed in ascending order,
 // returns false.  If in ascending order, returns true.
 //--------------------------------------------------------------------------------
     int size = aList.numItems;

     for(int i=0; i<size -1; i++) {  //loop to compare indices
         for(int j=1; j<size; j++){

              if ( aList.items[i].compareTo(aList.items[i+1]) > 0) {        //Compares subsequent numbers
                  System.out.println("Your list of integers is not in ascending order.");
                return false;
             }
         }
     }
     System.out.println("Your list of integers is in ascending order.");
     return true;
  }
}
