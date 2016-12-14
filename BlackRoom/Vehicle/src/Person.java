/**
 * @Description: This "Person" class for creating owner for Vehicle and other cars
 * @Date: Dec. 5 2015
 */

public class Person {
    
    //private variable
    private String name;
    
    public Person(){
        name = "";
    }
    
    //owner's name passed from String name
    public Person(String name){
        this.name = name;
    }
    
    //setter pass from String name
    public void setName(String name){
        this.name = name;
    }
    
    //getter passed from name
    public String getName(){
        return name;
    }
    
    //printing out the owner's name
    public void printPerson(){
        System.out.println("The name is " + getName());
    }
}
