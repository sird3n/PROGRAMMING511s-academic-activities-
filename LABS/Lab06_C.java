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

public class Lab06_C {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3, i, N, sum = n2;

        //Taking input from the user
        System.out.println("Enter N");
        N = inn.nextInt();

        //Printing 0 and 1
        System.out.println(n1+ " " + n2);

        for(i = 2; i< N; i++){
            //loop starts from 2 because 0 and 1 are already printed
           // System.out.println(n1+ " " + n2);
            n3 = n1 + n2;
            System.out.println(" "+n3);
            n1 = n2;
            n2= n3;

            sum = sum + n3;
        }
        System.out.println("The sum is "+sum);

    }
}
