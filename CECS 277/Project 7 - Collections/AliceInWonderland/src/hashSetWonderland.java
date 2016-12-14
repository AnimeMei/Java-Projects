/*
	Nov 23, 2016
	Purpose: Read a large text file and time for efficiency
	Inputs:  Alice in Wonderland.txt
	Output: hashset insert speed
 */
import java.util.Scanner;
import java.util.HashSet;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class hashSetWonderland {

    public static void main(String[] args) {
        // Hash Set
        HashSet hash = new HashSet(); // create the hashSet
        try {

            Scanner inPut = new Scanner(new FileReader("AliceInWonderland.txt")); // Scans the book
            long startTime = System.currentTimeMillis();//measure the time in milliseconds
            while (inPut.hasNextLine()) {

                String word = inPut.nextLine(); // scan one line
                String[] token = word.split("\\s*,\\s*"); // split the string by space

                for (int i = 0; i < token.length; i++) {
                    hash.add(token[i]); // insert intoo the HashSet
                }
            }
            long endTime = System.currentTimeMillis() - startTime; //measure the time
            System.out.println("HashSet run time: " + endTime + " milliseconds");

        } // Catch the error of no text file
        catch (FileNotFoundException e) {
            System.out.println("File Does Not Exist");
        }
    }
}
