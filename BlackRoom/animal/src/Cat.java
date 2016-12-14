
public class Cat extends Animal {
    
    private boolean vacinate;

    public Cat(String petName, int petWeight, boolean vac){
        super();
        setName(petName);
        setWeight(petWeight);
        vacinate = vac;
    }
   
    public boolean vac(boolean vacinate){
        if(!vacinate){
            return false;
        }
        else{
            return true;
        }
    }
    
    
    public void setVacinate(boolean vacinate){
        this.vacinate = vacinate;
    }
    
    public boolean getVacinate(){
        return vacinate;
    }
    
    public void noise(){
        System.out.println("MEOW");
    }
    
    public void printCat(){
        super.printAnimal();
        System.out.println(", VAC: " + vac(vacinate));
    }
    
}
