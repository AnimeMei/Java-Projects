/**
 * @Description: This "Truck" class is a sub-class extends from "Vehicle" 
 * @Date: Dec. 5 2015
 */

public class Truck extends Vehicle {
    
    private double loadCapacity;        //number of pounds
    private int towCapacity;            //numbers of cars
    
    public Truck(){
        super();
    }
   
    //Create "Truck" with parameters
   public Truck(String manu, int esize,Person owner,double load,int tow, double price){
        super();
        setPrice(price * 1.25);
        setManu(manu);
        setEng(esize);
        setOwner(owner);
        loadCapacity = load;
        towCapacity = tow;
    }
   
   //setter with "load capacity"
   public void setLoad(double load){
       loadCapacity = load;
   }
   
   //setter for tow capacity 
   public void setTow(int tow){
       towCapacity = tow;
   }
   
   //getter for load capacity
   public double getLoad(){
       return loadCapacity;
   }
   
   //getter for "Tow capacity"
   public int getTow(){
       return towCapacity;
   }
   
   //calculating for regular cost with 25%
    public double regCost(double price){
        return price;
    }
       
    //printing out all details about "Truck"
    public void printSticker(){
         System.out.println( "Load Capacity: " + loadCapacity);    
         System.out.println( "Tow Capacity: " + towCapacity);        
         super.printSticker();
    }
    
}
