package PRG611S.LABS;

/**
 * I hereby acknowledge that the work handed in is my own original work. If I
 * have quoted from any other source this information has been correctly referenced.
 * I also declare that I have read the Namibia University of Science and Technology
 * Policies on Academic Honesty and Integrity as indicated in my course outline and
 * the NUST general information and regulations - Yearbook 2022
 *
 * @author <Ihemba Simon M> <221102523>
 **/

//TASK
/*
Write a Java program to find the sum
and Average of an Array made of the following elements:

numbers={19, 20,17, 18}

Sample run:
Sum = 74
Average = 18.5

 */

public class Lab05_D {

    //Sum and Average variables set to default, 0
    int sum = 0;
    double average = 0;

    //Array size
    int size;

    public void getSum(int[] arr){
        //Getting the suze of the array
        int Arrsize = arr.length;

        //A loop to iterate through the array and sum up all elements in the array
        for (int i = 0; i < Arrsize; i++){
            sum = sum + arr[i];
        }

    }

    //Determining the average
    public void getAverage(int sum, int size){
        this.size = size;
        this.average = (double)sum/size;
    }

    public static void main(String[] args) {
        //Array of elements
        int[] numbers = {19,20,17,18};

        Lab05_D arr = new Lab05_D();
        arr.getSum(numbers);
        arr.getAverage(arr.sum, numbers.length);

        //Displaying the sum and average
        System.out.println("Sum = "+arr.sum);
        System.out.println("Average = "+arr.average);

    }
}
