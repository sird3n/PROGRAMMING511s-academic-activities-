package LABS;
import java.util.Scanner;

public class Lab06_B {

    //The Method program to add two numbers
    public static void sum(int a,int b){
        int result = 0;
        result = a + b;
        System.out.println("Sum of the two Numbers is: "+result);

    }
    public static void main(String[] args) {
        //creating Scanner object
        Scanner input = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter first number:");
        int num1 = input.nextInt();

        System.out.println("Enter second number:");
        int num2 = input.nextInt();

        sum(num1,num2);


    }
}
