/*
	Nov 23, 2016
	Purpose: Read a large text file and time for efficiency
	Inputs:  Alice in Wonderland.txt
	Output: TreeSet insert speed
 */
import java.util.Scanner;
import java.util.TreeSet;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class treeSetWonderland {

    public static void main(String[] args) {
        // Tree Set
        TreeSet tree = new TreeSet(); // create the TreeSet
        try {

            Scanner inPut = new Scanner(new FileReader("AliceInWonderland.txt")); // Scans the book
            long startTime = System.currentTimeMillis();//measure the time in milliseconds
            while (inPut.hasNextLine()) {

                String word = inPut.nextLine(); // scan one line
                String[] token = word.split("\\s*,\\s*"); // split the string by space

                for (int i = 0; i < token.length; i++) {
                    tree.add(token[i]); // insert intoo the TreeSet
                }
            }
            long endTime = System.currentTimeMillis() - startTime; //measure the time
            System.out.println("TreeSet run time: " + endTime + " milliseconds");

        } // Catch the error of no text file
        catch (FileNotFoundException e) {
            System.out.println("File Does Not Exist");
        }
    }
}
