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

/*
Write a Java program (using Method) that will accept a number as input from the keyboard and calculate the Cube of a number.

(1) If num is less than 0 then the program should print "Number cannot be less than 0" and the program will end.

(2) if num is equal or greater than 0 then the program should use a Method to calculate and print out the Cube as follows:

The formula to calculate Cube is:    Cube = num*num*num
The name of the Method should be:   findCube
You are to call the Method from the Main class using:   findCube(num
Ensure you use Method, I will check your VPL program on elearning to be sure you have used Method. If you did not use Method, the VPL mark will be 0.
 Sample run 1

Enter a Number: 3
Output: The Cube is: 27
Sample run 2
Enter a Number: 5
Output:   The Cube is: 125
Sample run 3

Enter a Number: -6

Output:   Number cannot be less than 0
 */

public class Lab06_C {
    private int cube;

    //Method to calculate the cube
    public void findCube(int num){
        this.cube = num*num*num;
        System.out.println("The Cube is: "+cube);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        //checking if number is less than or greater than zer0
        if(num < 0){
            System.out.println("Number cannot be less than 0");
        }
        else {
            Lab06_C cube1 = new Lab06_C();
            cube1.findCube(num);
        }

    }

}
