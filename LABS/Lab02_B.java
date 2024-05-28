package LABS;
import java.util.Scanner;

public class Lab02_B {
    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = in.nextDouble();

        System.out.println("Enter second number:");
        double num2 = in.nextDouble();

        System.out.println("Enter third number:");
        double num3 = in.nextDouble();

        double average = (num1+num2+num3)/3;
        System.out.println("The average of the numbers is = "+average);
    }
}
