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

public class Lab02_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter any number:");
        int num = in.nextInt();
        int sum = 0;

        for(int i = 0; i <= num; i++){
            if(i%2 == 0){
                sum = sum + i;
            }
        }
        System.out.println("The sum of even numbers up to "+num+ "="+sum);

    }
}