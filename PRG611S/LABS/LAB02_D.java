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
Write a Java program for the following: Given a positive number,
create an array with that number as the size and populate it with
the items/names provided. Additionally, the program should print
out the longest name in the array.

        Sample Run1
        3
        Apple
        Banana
        Kiwi

        Output1: Banana is the longest name
 */


public class LAB02_D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt for the size of the array
        System.out.println("Enter the a size of the array: ");
        int size = input.nextInt();

        //Create an array of length 'size'
        String[] arrItems = {};
        if(size > 0){
            arrItems = new String[size];
        }
        else {
            System.out.println("Array size cannot be less than 0");
        }

        //String variable to save the longest word
        String longestItem = "";

        //Loop to insert elements in the array
        for (int i = 0; i < size; i++){
            arrItems[i] = input.next();
        }

        //Loop to determine the longest item in the array
        for(int k = 0; k < size; k++){
            if(arrItems[k].length() > longestItem.length()){
                longestItem = arrItems[k];
            }
        }

        //Displaying the longest item/name
        System.out.println(longestItem+ " is the longest name");

    }
}
