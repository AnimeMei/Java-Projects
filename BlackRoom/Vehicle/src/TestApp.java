/**
 * @Description: This "Test App" is an application that will allow the user 
 * to store vehicle information for 10 vehicles.  
 * @Date: Dec. 5 2015
 */

import java.util.Scanner;
public class TestApp {
    static Scanner in = new Scanner(System.in);

   public static void main(String [] args){

     Vehicle[] fancyCar = new Vehicle [10];     //array to store all Vehicles
     Vehicle[] stockedCar = new Vehicle [10];   //array to store Cars only
     Vehicle[] stockedTruck = new Vehicle [10]; //array to store Trcuks only
     
       boolean done = false;
       while(!done){
           displayMenu(); //displaying Main selection menu for users
           
           if(in.hasNextInt()){
               int choice = in.nextInt(); 
               
               /*make sure user only select the options 
               provided option from 0 to 8 only*/
               if(choice>0 && choice<10){ 
                   switch(choice){
                       case 1: choice1(fancyCar,stockedTruck,stockedCar);
                       break;
                       case 2: choice2(stockedCar);
                       break;
                       case 3: choice3(stockedTruck);
                       break;
                       case 4: choice4(stockedTruck, done);
                       break;
                       case 5: choice5(stockedCar);
                       break;
                       case 6: choice6(fancyCar);
                       break;
                       case 7: choice7(fancyCar);
                       break;
                       case 8: done = true;
                       break;
                       default: done = true;
                       break;
                   }
               }else{
                    tryAgain();   
               }
           }else{
               invalid(done);
           }
       } //end of while loop

         
   } 
   
   
   //************************************************************************
   //**METHODS***************************************************************
   //************************************************************************
   
   //this is the main menu for selection
    public static void displayMenu(){
        System.out.println("Menu:");
        
        //user decide to add new car/truck information        
        System.out.println("1. Enter a new Vehicle");
        
        //print out Vehicles info
        System.out.println("2. Print out all Truck stocked");
        System.out.println("3. Print out all Cars stocked");
        
        /*accept a price as input, and output all Cars/Truck which are 
        available under that price (before tax)*/
        System.out.println("4. Accept Price For Cars");
        System.out.println("5. Accept Price For Truck");
        System.out.println("6. Accept Price For All Vehicles");
        
        /*accept a car manufacturer, and output all Vehicles which are 
         made by that manufacturer*/        
        System.out.println("7. Look up your favorite manufacturer");
        
        //user decide to quit the program        
        System.out.println("8. Quit\n");
    }
    
    //entering new car's information
    public static void choice1(Vehicle[] fancyCar, Vehicle[] stockedCar, Vehicle[] stockedTruck){

        for(int i=0; i<fancyCar.length; i++){
            if(fancyCar[i]==null){
               System.out.println("1. Enter a new Car!");
               System.out.println("2. Enter a new Truck!");
                System.out.println("3. Back");
               int choice = in.nextInt();
               
               //Edit new Car's info
               if(choice == 1){
                   System.out.println("Please Enter the Car's Manufacturer");
                   String manu = in.next();
                   System.out.println("Please Enter the Car's Engine Size");
                   int engSize = in.nextInt();
                   System.out.println("Please Enter the Car's Owner");
                   String owner = in.next();
                   System.out.println("Please Enter the Car's Door Counts");
                   int doorCount = in.nextInt();
                   System.out.println("Please Enter the Car's Price");
                   double price = in.nextDouble();
                   
                   //array to store all Cars
                   fancyCar[i] = new Car(manu, engSize, new Person(owner), doorCount, price );
                   
                   //array to store all Cars
                   stockedCar[i] = new Car(manu, engSize, new Person(owner), doorCount, price );
               }
               
               //Edit New Trcuk's info
               if(choice == 2){
                    System.out.println("Please Enter the Truck's Manufacturer");
                    String manu = in.next();
                    System.out.println("Please Enter the Truck's Engine Size");
                    int engSize = in.nextInt();
                    System.out.println("Please Enter the Truck's Owner");
                    String owner = in.next();
                    System.out.println("Please Enter the Truck's Load Capacity");
                    int loadCap = in.nextInt();
                    System.out.println("Please Enter the Truck's Tow Capacity");
                    int towCap = in.nextInt();
                    System.out.println("Please Enter the Truck's Price");
                    double price = in.nextDouble();
                    
                    //array to store all vehicles
                    fancyCar[i] = new Truck(manu, engSize, new Person(owner), loadCap, towCap, price);
                    
                    //array to store Trucks only
                    stockedTruck[i] = new Truck(manu, engSize, new Person(owner), loadCap, towCap, price);
               }
               
               //Return to main menu
               if(choice == 3){
                   break;
               }else{
                   tryAgain();  //wrong input, re-enter choices
               }
            }else{
                //when the fancyCar array is full, display this
                System.out.println("Storage is full. This program can only store 10 Vehicles.");
            }            
        }
    }
    

   

    //Printing out all stocked Trucks
    public static void choice2(Vehicle[] stockedTruck){
        for(int i=0; i<stockedTruck.length; i++){
            if(stockedTruck[i] != null){              
                stockedTruck[i].printSticker();
            }  
        }
    }
    
    
    
        //Printing out all stocked Cars
   public static void choice3(Vehicle[] stockedCar){
        for(int i=0; i<stockedCar.length; i++){
            if(stockedCar[i] != null){              
                stockedCar[i].printSticker();
            }  
        } 
    }
    
   
        //input price, search all Trucks below the input price range
    public static void choice4(Vehicle[] stockedTruck,boolean done){
        System.out.println("Enter a satisfying price.\n");
        double inputPrice = in.nextDouble();
        for(int i=0; i<stockedTruck.length; i++){
            if(stockedTruck[i] != null){              
                double regPrice = stockedTruck[i].regCost();
                if(regPrice < inputPrice){
                    stockedTruck[i].printSticker();
                }   
            }  
        }
    }
    
    
    
    //input price, search all Cars below the input price range
 public static void choice5(Vehicle[] stockedCar){
    System.out.println("Enter a satisfying price.\n");
        double inputPrice = in.nextDouble();
        for(int i=0; i<stockedCar.length; i++){
            if(stockedCar[i] != null){              
                double regPrice = stockedCar[i].regCost();
                if(regPrice < inputPrice){
                    stockedCar[i].printSticker();
                }else{
                    System.out.println("No Match Found\n");
                }    
            }  
        } 
 }
   
 
    //input a "manufacturer" string and search for that Brand of Cars/Trucks
    public static void choice6(Vehicle[] fancyCar){
       System.out.println("Enter a satisfying price!\n");
        double inputPrice = in.nextDouble();
        for(int i=0; i<fancyCar.length; i++){
            if(fancyCar[i] != null){
                double regPrice = fancyCar[i].regCost();
                
                //comparing input price vs cars' price
                if(inputPrice > regPrice){
                    fancyCar[i].printSticker();
                }else{
                    System.out.println("No Match Found");
                }
            }
        }
    }
    
    
    //input price, search all Cars & Trucks below the input price range
    public static void choice7(Vehicle[] fancyCar){
        System.out.println("Enter a satisfying Manufactur's name!\n");
        String inputManu = in.next();
        inputManu = inputManu.toUpperCase();
        for(int i=0; i<fancyCar.length; i++){
            if(fancyCar[i] != null){
                String regManu = fancyCar[i].getManu();
                regManu = regManu.toUpperCase();
                //comparing input price vs cars' price
                if(inputManu.equals(regManu)){
                    fancyCar[i].printSticker();
                }
            }
        }
    }
   

    //wrong input, re-enter choice
    public static void tryAgain(){
        System.out.println("Invalid Input! Try Again\n");
    }
    
    public static boolean not(boolean done){
        return done = !done;
    }
    
    //Display invalid input
    public static void invalid(boolean done){
        String input = in.next();
        if (input.equals("Q")){
        }else{
            System.out.println("Invalid Input! Try Again\n");
        } 
    }
      
}
