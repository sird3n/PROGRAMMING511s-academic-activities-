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

public class Lab04_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 0;
        int sum = 0;

        while(true){
            num = in.nextInt();
            if(num<0){
                break;
            }
            sum = sum + num;
        }
        System.out.println(sum);
    }

}



