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

public class Lab01_Demo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter First number:");
        double num1 = in.nextDouble();

        System.out.println("Enter second number:");
        double num2 = in.nextDouble();

        System.out.println("Enter third number");
        double num3 = in.nextDouble();

        double sum = num1 + num2 + num3;

        double average = sum/3;
        System.out.println("The average of the three numbers is:"+average);
    }
}
