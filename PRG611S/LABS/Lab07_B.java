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

public class Lab07_B {
    //Bubble Sort method
    public void bubbleSort(int[] array, int size){
        int i,j,temp;
        //Bubble Sort using for loop
        for(i = 0; i < array.length; i++)
        {
            for(j = 0; j < array.length - i - 1; j++)
            {
                if(array[j] > array[j + 1])
                {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Integers using the Bubble Sort:");
        for (int n: array){
            System.out.print(" "+n);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Getting array size
        System.out.println("Enter the Array size = ");
        int arrSize = input.nextInt();

        //Check if array size is a negative number
        if (arrSize > 0 ){
            //initializing the array
            int[] numArray = new int[arrSize];

            //Getting elements of array from user
            System.out.println("Enter Elements of Array: ");
            for (int i = 0; i < arrSize; i++){
                numArray[i] = input.nextInt();
            }

            //creating an object of the class
            Lab07_B sorting1 = new Lab07_B();
            sorting1.bubbleSort(numArray,arrSize);
        }
        else {
            System.out.println("Array size cannot be less than 0");
        }
    }
}
