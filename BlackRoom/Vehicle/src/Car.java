/**
 * @Description: This "Car" class is a sub-class extends from "Vehicle" 
 * @Date: Dec. 5 2015
 */

public class Car extends Vehicle {

    //creates private variable "door"
    private int door;
    
    public Car(){
        super();
    }
    
    //create Car with paramets passed through
    public Car(String manu, int esize, Person owner, int door, double price){
        super();
        setPrice(price * 1.33);
        setManu(manu);
        setEng(esize);
        setOwner(owner);
        this.door = door;
    }
    
    //setter with door variable
    public void setDoor(int door){
        this.door = door;
    }
    
    //getter door variable
    public int getDoor(){
        return this.door;
    }
    
    //calculating regular price with 33% 
    public double regCost(double price){
        return price;
    }
    
    //printing out all details about the Car
    public void printSticker(){
        System.out.println( "Door: " + door);
        super.printSticker();
    }
}
