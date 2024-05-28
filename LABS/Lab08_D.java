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


public class Lab08_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter array size:");
        int arrSize = in.nextInt();

        int[] numArr = new int[arrSize];


        System.out.println("Enter values in the array");
        for(int i = 0; i < arrSize; i++){
            numArr[i] = in.nextInt();
        }

        System.out.println("Enter value to search: ");
        int num = in.nextInt();
        int x;

        for(x = 0; x < arrSize; x++){
            if(numArr[x] == num){
                System.out.println("The index position = "+x);
                break;
            }
        }

        if(x == numArr.length){
            System.out.println("Number not Found");
        }

        }

}

