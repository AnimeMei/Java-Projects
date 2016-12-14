
public class Animal {
    private String name;
    private int weight;
    
    public Animal(){       
    }
    
    public Animal(String petName, int petWeight){
        name = petName;
        weight = petWeight;   
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String nm){
        name = nm;
    }
    
    public int getWeight(){
        return weight;
    }
    
    public void setWeight(int lbs){
        weight = lbs;
    }
  
    public void noise(){
        System.out.println("\nWOOF");
    }
    
    public void printAnimal(){
        System.out.print(name + " weighs " + weight + " pounds");
    }
}
