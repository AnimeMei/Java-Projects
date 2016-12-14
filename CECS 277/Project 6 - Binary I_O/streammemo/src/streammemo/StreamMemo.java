/*Purpose: This program to create a memo file
 Inputs: This program ask for an topic and message inputs
 Output: Creates an memo object.
 */
package streammemo;

import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StreamMemo {

    //static scanner
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //creating a new file "Memos"
        String topic, message;
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("Memos.dat"));

            Memo memo1;

            boolean done = true;
            //while loop to iterate as many memo to write as user desire
            while (done) {

                System.out.print("Enter your memo topic: ");
                //user inout a topic
                topic = in.nextLine();
                System.out.print("Enter your memo message: ");
                //user input a memo message
                message = in.nextLine();
                //create a Memo object
                memo1 = new Memo(topic, message);

                out.writeObject(memo1);

                //menu
                menu();
                //initialize a choice variable for user's acion
                int choice = 0;
                //handling input value or input type exception with do while
                do {
                    //try catch block to determine user choice is an integer
                    try {
                        choice = in.nextInt();
                        if (choice != 1 && choice != 2) {
                            //set choice to default, loop while one more time
                            choice = -9999;
                            //prompt error message
                            System.out.println("Invalid input");
                            menu();
                        }
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Invalid Input");
                        menu();
                        choice = -9999;
                        //clear buffer
                        in.nextLine();
                    }
                } while (choice == -9999);

                //switch method to determine action
                switch (choice) {
                    case 1:
                        System.out.println(" ");
                        break;
                    case 2:
                        done = false;
                        break;
                }//end switch
                in.nextLine();
            }//end while

        } catch (IOException e) {
            System.out.println("No more memo");
        } finally {
            if (out != null) {
                try {
                    //close file
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }//end finally
        
    }//end main

        //menu method to prompt user
    public static void menu() {
        System.out.println("1. Would you like to write another memo?");
        System.out.println("2. Quit");
    }
}
