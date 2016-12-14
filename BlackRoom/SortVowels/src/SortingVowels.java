
import java.util.Scanner;
public class SortingVowels {
    static Scanner in = new Scanner(System.in);
    public static void main (String [] args) {
        String phrase = "";
        int totalVowelsCount = 0;
        for(int i=0; i<10; i++){
            //user's input string
            phrase = in.next();
            totalVowelsCount = totalVowelsCount + sortVowels(phrase);
        }//end for loop
        //pring out the total number of vowels counted
        System.out.println(totalVowelsCount);
    }//end main method


    //method to count the total vowel inside a string
    public static int sortVowels(String phrase){
        //convert the entire string to lower case
        phrase = phrase.toLowerCase();
        //initializer the count to 0
        int vowelsCount = 0;
        //for loop to search for vowels
        for(int i=0; i< phrase.length(); i++){
            char compareDummy = phrase.charAt(i);

            switch(compareDummy){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': vowelsCount ++;
                break;
                default:
                break;
            }//end switch
        }//end for lop
        return vowelsCount;
    }//end sortVowels method
}//end main program
