/*Purpose: This program to create/read a memo objects
 Inputs: This program ask for an topic and message inputs
 Output: Read an memo objects.
 */
package streammemo;

import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ReadStreamMemo {

    //static scanner
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //showOpenDialog method to enable the user to select a file to open
        JFileChooser chooser = new JFileChooser();
        //APPROVE_OPTION, if the user has chosen a file
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();

            ObjectInputStream inputFile = null;
            try {
                inputFile = new ObjectInputStream(new FileInputStream(selectedFile));

                Memo note = null;

                //while loop to iterate as many memo to read as user desire
                boolean done = true;
                while (done) {
                    if ((note = (Memo) inputFile.readObject()) != null) {
                        //print out memo object
                        System.out.println(note);
                    } else {
                        done = false;
                        System.out.println("No more memo");
                        break;
                    }

                    menu();
                    int choice = 0;
                    //handling input value or input type exception with do while
                    do {
                        //try catch block to determine user choice is an integer
                        try {
                            choice = scan.nextInt();
                            if (choice != 1 && choice != 2) {
                                //set choice to default, loop while one more time
                                choice = -9999;
                                //prompt error message
                                System.out.println("Invalid input");
                                menu();
                            }
                            //catch mismatch type
                        } catch (java.util.InputMismatchException e) {
                            choice = -9999;
                            //prompt error message
                            System.out.println("Invalid Input");
                            menu();
                            //clear buffer
                            scan.nextLine();
                        }
                    } while (choice == -9999);

                    //switch for action
                    switch (choice) {
                        case 1:
                            System.out.println("");
                            break;
                        case 2:
                            done = false;
                            break;
                    }//end switch
                }//end while

            } catch (IOException e) {
                System.out.println("No more memo");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                if (inputFile != null) {
                    try {
                        //close file
                        inputFile.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }//end finally
        }//end showopendialog if
    }//end main

    public static void menu() {
        System.out.println("\n1. Read the next memo");
        System.out.println("2. Quit");
    }//end menu method
}//end class
