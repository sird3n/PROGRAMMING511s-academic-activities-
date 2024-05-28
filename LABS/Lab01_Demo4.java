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

public class Lab01_Demo4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = in.nextInt();
        int c = 10;
        int numDigits = 0;

        while( num > 0){
            num = num/c;
            numDigits++;
        }
        System.out.println("The are "+numDigits+ " digits");

    }
}
