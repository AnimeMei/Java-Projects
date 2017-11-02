/*
 * Nov 23, 2016
 * Purpose: Using regular expression
 * InPut: the text file
 * OutPut: The regular expression patterns
 */

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.PrintWriter;

public class Regex {

    public static void main(String[] args) {
        String pattern1 = "zz";    // zz next to each other pattern
        String pattern2 = "[aeiou]{2}"; // Two vowels in a row
        String pattern3 = "(?:[^aeiou]*[aeiuo]){3}"; // All words with more than two vowels
        String pattern4 = "(?:[^x]*[x]){2}"; // All words with two x's in in them
        String pattern5 = "^q[^u]"; // All word starting with Q not followed by a U

        Pattern r1 = Pattern.compile(pattern1);
        Pattern r2 = Pattern.compile(pattern2);
        Pattern r3 = Pattern.compile(pattern3);
        Pattern r4 = Pattern.compile(pattern4);
        Pattern r5 = Pattern.compile(pattern5);

        PrintWriter out = null;

        try {

            Scanner input = new Scanner(new FileReader("scrabble.txt"));
            Scanner inPut2 = new Scanner(new FileReader("scrabble.txt"));
            Scanner inPut3 = new Scanner(new FileReader("scrabble.txt"));
            Scanner inPut4 = new Scanner(new FileReader("scrabble.txt"));
            Scanner inPut5 = new Scanner(new FileReader("scrabble.txt"));

            // Pattern5 going to contain the outPut for pattern 5
            out = new PrintWriter("Pattern5.txt");

            for (int i = 0; i < 5; i++) {
                // To find and match
                int counter = 0;
                Scanner curFile = null;
                Matcher match = null;

                //utilize specific input scanner
                switch (i) {
                    case 0:
                        curFile = input;
                        break;
                    case 1:
                        curFile = inPut2;
                        break;
                    case 2:
                        curFile = inPut3;
                        break;
                    case 3:
                        curFile = inPut4;
                        break;
                    case 4:
                        curFile = inPut5;
                        break;
                }

                while (curFile.hasNextLine()) {
                    String reg = curFile.nextLine();

                    //switch statement for specific pattern
                    switch (i) {
                        case 0:
                            match = r1.matcher(reg);
                            break;
                        case 1:
                            match = r2.matcher(reg);
                            break;
                        case 2:
                            match = r3.matcher(reg);
                            break;
                        case 3:
                            match = r4.matcher(reg);
                            break;
                        case 4:
                            match = r5.matcher(reg);
                            break;
                    }

                    if (match.find()) {
                        //write out a text file if condition met
                        if (i == 4) {
                            out.println(reg);
                        }
                        counter++;
                    }
                }
                System.out.println(counter + " words"); //matched word count
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Does Not Exist");
        } finally {
            if (out != null) {
                out.close();    //close the output file
            }
        }//end finally

    }
}
