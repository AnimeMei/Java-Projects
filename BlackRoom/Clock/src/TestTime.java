import java.util.Scanner;
import java.util.Scanner;
public class TestTime {
        
    //enable for user's keyboard input
    static Scanner in = new Scanner(System.in);
    
    public static void main (String [] args){
               
        int hr;
        int min;
        String minToAdvanceClock;
        boolean stateCheck = false;              //set boolean for while to run 

        System.out.println("Please enter current hours");
        hr = in.nextInt();
        System.out.println("Please enter current minutes");
        min = in.nextInt();
        Clock mainClock = new Clock(hr,min);
         
        while(!stateCheck){
            System.out.println("\nPress Capital Q to quit the program\n");
            System.out.println("Enter the number of minutes that you would like to advance the clock");
            
            minToAdvanceClock = in.next();
            
            if (minToAdvanceClock.equals("Q")){
                stateCheck = true;
            }else{
                int i = Integer.parseInt(minToAdvanceClock);
                mainClock.addMinute(i);
                System.out.print("Current time is: ");
                mainClock.printTime();
            }   
        } 
    }  
    
    public static void quitProgram(boolean stateCheck){
        String input = in.next();
    }
}
   
   

