/**
 * @Description: This "Vehicle" class is a superclass for all kinds of vehicles
 * @Date: Dec. 5 2015
 */

public class Vehicle {
    private String manufacturer;    //Ford,Honda, Toyota, etc..
    private int engineSize;         //1500, 3000, 4000, 4500, etc
    private Person owner;           //name of the person selling the car
    private double price;           //the seller's desired price

    //create a Vehicle
    public Vehicle(){
       manufacturer = "";
       engineSize = 0;
       this.owner = new Person();
       this.price = 0;
    }
    
    //create a Vehicle with parameters
    public Vehicle(String manu, int esize, Person owner, double price){
       manufacturer = manu;
       engineSize = esize;
       this.owner = owner;
       this.price = price;
    }

    // manufacturer setters
    public void setManu(String manu){
        manufacturer = manu;
    }
    
    // engine Size setters
    public void setEng(int esize){
        engineSize = esize;
    }
    
    //owner setters
    public void setOwner(Person owner){
        this.owner = owner;
    }
     
    //desired price setters
    public void setPrice(double price){
        this.price = price;
    }
    
    
    //manu getters
    public String getManu(){
        return manufacturer;
    }
    
    //engine size getter
    public int getSize(){
        return engineSize;
    }
     
    //owner getter
    public Person getOwner(){
        return owner;
    }
      
    //returns price
    public double regCost(){
        return price;
    }
    
    //total price after tax
    public double totalCost(){
        //return price = price * 1.0825;
        return price;
    }
      
    //print out all vehicle details
    public void printSticker(){
        System.out.println("Manufacturer: " + getManu()
                            +"\nEngine Size: " + getSize()
                            +"\nOwner: " + getOwner().getName()
                            +"\nPrice: " + regCost()
                            +"\nTotal Price: " + totalCost()* 1.0825
                            +"\n");
    }

}

