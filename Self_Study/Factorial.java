package Self_Study;
import java.util.Scanner;

public class Factorial {
    static int fact(int N){
        if(N >= 1){

            //System.out.print(N +" * ");
            return N * fact(N - 1);
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter N:");
        int num = in.nextInt();
        System.out.println(fact(num));
    }
}

