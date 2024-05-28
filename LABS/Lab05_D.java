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

public class Lab05_D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arrSize = input.nextInt();
        int sumEven = 0;
        int sumOdd = 0;

        int numArr[] = new int[arrSize];

        for (int i = 0; i < arrSize; i++){
            numArr[i] = input.nextInt();
            if(numArr[i] % 2 == 0){
                sumEven = sumEven + numArr[i];
            }else{
                sumOdd = sumOdd + numArr[i];
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);

    }
}
