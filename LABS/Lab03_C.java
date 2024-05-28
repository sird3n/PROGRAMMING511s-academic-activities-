package LABS;
import java.util.Scanner;
/**
 * I hereby acknowledge that the work handed in is my own original work. If I
 * have quoted from any other source this information has been correctly referenced.
 * I also declare that I have read the Namibia University of Science and Technology
 * Policies on Academic Honesty and Integrity as indicated in my course outline and
 * the NUST general information and regulations - Yearbook 2022
 *
 * @author <Ihemba Simon M> <221102523>
 **/


public class Lab03_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Prompts user for second number
        int num1 = in.nextInt();

        //Prompts user for second number
        int num2 = in.nextInt();

        //calculates the difference
        int diff = num1 - num2;

        //Calculates the product
        int prod = num1 * num2;

        //Displays the difference and product separated by a space
        System.out.println(diff +" "+ prod);

    }
}
