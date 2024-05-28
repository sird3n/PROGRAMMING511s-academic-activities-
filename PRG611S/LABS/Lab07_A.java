package PRG611S.LABS;
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


public class Lab07_A {
    //Linear Search method
    public void linearSearch(int[] array, int size, int num2Search){
        int a;
        for (a = 0; a < size; a++){
            if (array[a] == num2Search){
                System.out.println("The Index position = "+a);
                break;
            }
        }
        if(array.length == a){
            System.out.println("Number Not Found");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Getting array size
        System.out.println("Enter the total number of Elements: ");
        int arrSize = input.nextInt();

        //Check if array size is a negative number
        if (arrSize > 0 ){
            //initializing the array
            int[] numArray = new int[arrSize];

            //Getting elements of array from user
            System.out.println("Enter the elements: ");
            for (int i = 0; i < arrSize; i++){
                numArray[i] = input.nextInt();
            }

            //Getting the element to be searched
            System.out.println("Please Enter Number to Search: ");
            int find = input.nextInt();

            //creating an object of the class
            Lab07_A search1 = new Lab07_A();
            search1.linearSearch(numArray,arrSize,find);
        }
        else {
            System.out.println("Array size cannot be less than 0");
        }
    }
}
