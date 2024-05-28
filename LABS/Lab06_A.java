package LABS;
import java.util.Scanner;

public class Lab06_A {
    public static void main(String[] args) {
        //Creating Scanner class object
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        //Reading values from the user
        int num = scan.nextInt();

        //method calling
        findEvenOdd(num);
    }
    //Method starts from here
    public static void findEvenOdd(int num){
        //Method body
        int cube = num * num * num;
        System.out.println(cube +" is the cube of "+num);

        if(num%2 == 0){
            System.out.println(num +" is Even");

        }else{
            System.out.println(num+ " is Odd");

        }
    }
}
