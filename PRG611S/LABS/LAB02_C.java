package PRG611S.LABS;
import java.util.Scanner;

/**
 * I hereby acknowledge that the work handed in is my own original work. If I
 * have quoted from any other source this information has been correctly referenced.
 * I also declare that I have read the Namibia University of Science and Technology
 * Policies on Academic Honesty and Integrity as indicated in my course outline and
 * the NUST general information and regulations - Yearbook 2022
 *
 * @author <Ihemba Simon M> <221102523>
 */

//QUESTION
/*
Write a program that takes in two words, check for equality ignoring the cases, if
the words are equal the print the word in upper case with an appropriate message however
if the words are different, then print the two words in lower case with an appropriate message.

Sample run 1:
Enter two words separated by spaces: Welcome WELCOME
Output: You have only entered one word: “WELCOME”

Sample run 2:
Enter two words separated by spaces: NUST Students
Output: You have entered two words: “nust” and “students”
 */


public class LAB02_C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt for first word
        System.out.println("Enter two words separated by space:");
        String word1 = input.next();

        //Prompt for second word
        //System.out.println("Enter the second word");
        String word2 = input.next();

        //Check equality of the two words NB: .compareToIgnoreCase() returns 0 if two words are equal, ignoring the case
        if(word1.compareToIgnoreCase(word2) == 0) {
            System.out.println("You have only entered one word: "+word1.toUpperCase());
        }
        else{
            System.out.println("You have entered two words: "+word1.toLowerCase()+" and "+ word2.toLowerCase());
        }

    }
}
