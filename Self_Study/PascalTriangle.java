package Self_Study;
import java.util.Scanner;


public class PascalTriangle {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3, i, N, sum = n2;

        //Taking input from the user
        System.out.println("Enter N");
        N = inn.nextInt();

        //Printing 0 and 1
        System.out.println(n1+ " " + n2);

        for(i = 2; i< N; i++){
            //loop starts from 2 because 0 and 1 are already printed
            // System.out.println(n1+ " " + n2);
            n3 = n1 + n2;
            System.out.println(" "+n3);
            n1 = n2;
            n2= n3;

            sum = sum + n3;
        }
        System.out.println("The sum is "+sum);

    }
}
