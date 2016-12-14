/*
	Nov 23, 2016
	Purpose: Add a list of 100 items into an ArrayList
	Inputs: Item.txts
	Output: Time difference
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArraylistHunt {

    public static void main(String[] args) {

        try {
            Scanner num = new Scanner(System.in);
            System.out.println("Input the number of teams: ");
            int numTeam = num.nextInt();

            //ArrayList
            ArrayList<ArrayList<String>> Alists = new ArrayList<ArrayList<String>>();
            long startTime = System.nanoTime();
            for (int i = 0; i < numTeam + 1; i++) {
                ArrayList<String> tempArray = new ArrayList<String>();
                Scanner inPut = new Scanner(new FileReader("Items.txt"));
                while (inPut.hasNextLine()) {
                    tempArray.add(inPut.nextLine());
                }
                Collections.shuffle(tempArray);
                Alists.add(tempArray);

            }
            long endTime = System.nanoTime() - startTime;
            System.out.println("Took " + endTime + " nanoseconds to insert all item into ArrayList");

            //Ask user for position use
            System.out.println("\nWhich position should be use: ");
            int position = num.nextInt();

            // Retrive element for ArrayList
            long startTime1 = System.nanoTime();
            for (int i = 0; i < numTeam; i++) {
                ArrayList<String> Alists2 = new ArrayList<String>(); //temp
                Alists2 = Alists.get(i);
                String item = (String) Alists2.get(position);
                System.out.println(item);
            }
            long endTime1 = System.nanoTime() - startTime1;
            System.out.println("Took " + endTime1 + " nanoseconds to find an item in ArrayList");

            //Inserting new element into the ArrayList
            long startTime2 = System.nanoTime();
            for (int i = 0; i < numTeam; i++) {
                ArrayList<String> tempArray = new ArrayList<String>();
                tempArray = Alists.get(i);
                tempArray.set(position, "NEW");
            }
            long endTime2 = System.nanoTime() - startTime2;
            System.out.println("Took " + endTime2 + " nanoseconds to insert element into ArrayList");

            //Random class to generate a number, Retrive element for ArrayList
            Random rand = new Random();
            int curPosition = rand.nextInt(101);    //generate a random number from 0-100
            long startTime3 = System.nanoTime();
            for (int i = 0; i < numTeam; i++) {
                ArrayList<String> Llists2 = new ArrayList<String>(); //temp
                Llists2 = Alists.get(i);
                String item = (String) Llists2.get(curPosition);
                System.out.println(item);
            }
            long endTime3 = System.nanoTime() - startTime3;
            System.out.println("Randomly generated a position\nRetrive: Took " + endTime3 + " nanoseconds to find an item in LinkedList\n");

            //Random class to generate a number, Inserting element for ArrayList
            long startTime4 = System.nanoTime();
            for (int i = 0; i < numTeam; i++) {
                ArrayList<String> tempLinked = new ArrayList<String>();
                tempLinked = Alists.get(i);
                tempLinked.set(curPosition, "NEW");
            }
            long endTime4 = System.nanoTime() - startTime4;
            System.out.println("Randomly generated a position\nInsert: Took " + endTime4 + " nanoseconds to insert element into LinkedList\n");

        } // catch for error
        catch (FileNotFoundException e) {
            System.out.println("File Does Not Exist");
        }

    }
}
