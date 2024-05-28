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

public class Lab02_A {
    private static Scanner in;
    public static void main(String[] args) {
        //Scanner
                in = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = in.nextInt();

        System.out.println("Enter the second number");
        int num2 = in.nextInt();

        if(num1 > num2){
            System.out.println("\nThe largest number is:"+num1);

        }
        else if(num2 > num1){
            System.out.println("\nLargest number is:"+num2);
        }
        else{
            System.out.println("\nBoth are equal");
        }
    }
}
