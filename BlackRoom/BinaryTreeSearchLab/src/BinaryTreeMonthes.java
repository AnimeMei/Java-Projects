// ************************************************************************************************************************************
// Lab 5			
// Class: CS 111C		Date:	 5/16/16
// The BinaryTreeMonth class is the driver program.
// This lab will give you practice working with a binary search tree, and writing a recursive method to access the items in a binary
// search tree.
// ***********************************************************************************************************************************
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class BinaryTreeMonthes {
    public static void main(String[] args) throws IOException{

        BinarySearchTree<StringItem, String> tree = new BinarySearchTree<StringItem, String>();

	System.out.println("Tree sort program");
	System.out.print("Enter name of input file: ");
        Scanner inputFile = new Scanner(System.in);

        String inputFileName = inputFile.next();
        System.out.println();
        String input = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(inputFileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            //put into queue.
            while((input = bufferedReader.readLine()) != null) {
            	tree.insert(new StringItem(input));
            }

            bufferedReader.close();  //close .dat
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + inputFileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + inputFileName + "'");
        }
            System.out.println("Binary search tree:\n");
            // binary search tree format
            tree.printTree(tree.root, 0);

            System.out.println('\n' + "Sorted items:" +'\n');
            //display sorted monthes
	    tree.printInorder(tree.root);
	}
}

/******* Sample output *********
 * Sample program dialog:

Tree sort program
Enter name of input file:  input.dat

Binary search tree:

         September
            October
               November
      May
   March
      June
         July
January
   February
            December
         August
      April

Sorted items:

April
August
December
February
January
July
June
March
May
November
October
September

 */
