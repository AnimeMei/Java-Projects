/*
	Nov 23, 2016
	Purpose: Read a text file and assign Scabble values
	Inputs: scrabblePoints.txt and words.txt
	Output: The scabble value of the Q words
 */
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Scrabble {

    public static void main(String[] args) {
        Map scorePoints = new HashMap(); //create HashMap

        try {
            Scanner inPut = new Scanner(new FileReader("scrabblePoints.txt"));// Scan the Testing.txt the one with letters value

            while (inPut.hasNextLine()) {

                String word = inPut.nextLine(); //scans the one line

                String letter = word.substring(0, 1); // scan the first character of the string which is the letter
                int points = Integer.parseInt(word.substring(1)); // scans the number

                scorePoints.put(letter, points); // insert in the HashMap
            }

            System.out.println(scorePoints); // print the letters and it's value

        } // catch for error
        catch (FileNotFoundException e) {
            System.out.println("File Does Not Exist");
        }

        try {
            Scanner QinPut = new Scanner(new FileReader("words.txt")); // Scan the Q words text file

            while (QinPut.hasNextLine()) {
                String word = QinPut.nextLine(); // scan one line

                // compute the value of one letter
                int totalPoints = 0;
                for (int i = 0; i < word.length(); i++) {
                    String letter = word.substring(i, i + 1);// split the String into letters
                    totalPoints += (int) scorePoints.get(letter.toUpperCase()); // turn lowercase letter to uppercase and add up the points
                }

                System.out.println("\n" + word);
                System.out.println(totalPoints + " points"); // print the total points
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Does Not Exist");
        }

    }
}
