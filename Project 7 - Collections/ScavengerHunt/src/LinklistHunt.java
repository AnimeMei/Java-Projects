/*      Nov 23, 2016
	Purpose: Add a list of 100 items into a LinkedList
	Inputs: Item.txts
	Output: Time difference
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class LinklistHunt {

    public static void main(String[] args) {

        try {
            Scanner num = new Scanner(System.in);
            System.out.println("Input the number of teams: ");
            int numTeam = num.nextInt();

            //LinkedList
            LinkedList<LinkedList<String>> Llists = new LinkedList<LinkedList<String>>();
            long startTime1 = System.nanoTime();
            for (int i = 0; i < numTeam + 1; i++) {
                LinkedList<String> tempList = new LinkedList<String>();
                Scanner inPut = new Scanner(new FileReader("Items.txt"));
                while (inPut.hasNextLine()) {
                    tempList.add(inPut.nextLine());
                }
                Collections.shuffle(tempList);
                Llists.add(tempList);

            }
            long endTime1 = System.nanoTime() - startTime1;
            System.out.println("Took " + endTime1 + " nanoseconds to insert all items into LinkedList");

            //Ask user for position use
            System.out.println("\nWhich position should be use: ");
            int position = num.nextInt();

            // Retrive element for LinkedList
            long startTime2 = System.nanoTime();
            for (int i = 0; i < numTeam; i++) {
                LinkedList<String> Llists2 = new LinkedList<String>(); //temp
                Llists2 = Llists.get(i);
                String item = (String) Llists2.get(position);
                System.out.println(item);
            }
            long endTime2 = System.nanoTime() - startTime2;
            System.out.println("Retrive: Took " + endTime2 + " nanoseconds to find an item in LinkedList\n");

            //Inserting new element into the LinkedList
            long startTime3 = System.nanoTime();
            for (int i = 0; i < numTeam; i++) {
                LinkedList<String> tempLinked = new LinkedList<String>();
                tempLinked = Llists.get(i);
                tempLinked.set(position, "NEW");
            }
            long endTime3 = System.nanoTime() - startTime3;
            System.out.println("Insert: Took " + endTime3 + " nanoseconds to insert element into LinkedList\n");

            //Random class to generate a number, Retrive element for LinkedList
            Random rand = new Random();
            int curPosition = rand.nextInt(101);    //generate a random number from 0-100
            long startTime4 = System.nanoTime();
            for (int i = 0; i < numTeam; i++) {
                LinkedList<String> Llists2 = new LinkedList<String>(); //temp
                Llists2 = Llists.get(i);
                String item = (String) Llists2.get(curPosition);
                System.out.println(item);
            }
            long endTime4 = System.nanoTime() - startTime4;
            System.out.println("Randomly generated a position\nRetrive: Took " + endTime4 + " nanoseconds to find an item in LinkedList\n");

            //Random class to generate a number, Inserting element for LinkedList
            long startTime5 = System.nanoTime();
            for (int i = 0; i < numTeam; i++) {
                LinkedList<String> tempLinked = new LinkedList<String>();
                tempLinked = Llists.get(i);
                tempLinked.set(curPosition, "NEW");
            }
            long endTime5 = System.nanoTime() - startTime5;
            System.out.println("Randomly generated a position\nInsert: Took " + endTime5 + " nanoseconds to insert element into LinkedList\n");
        } // catch for error
        catch (FileNotFoundException e) {
            System.out.println("File Does Not Exist");
        }

    }
}
