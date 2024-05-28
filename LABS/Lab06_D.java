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

public class Lab06_D {
     static int CallFib(int N){

        if(N <= 1) {
            return N;
        }
         return CallFib(N -1) + CallFib(N - 2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int terms = in.nextInt();
        System.out.println("Fibonacci Sequence is:");

        if(terms <= 0){
            System.out.println(CallFib(0));
        }else{
            for(int i = 0; i < terms; i ++){
                System.out.println(CallFib(i));
            }
        }

    }
}
