package LABS;
import java.util.Scanner;

public class Test2_PartA1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startNo,endNo, sumEven = 0;

        System.out.println("Enter 2 Numbers separated with a space (startNo and endNo): ");
        startNo = input.nextInt();
        endNo = input.nextInt();

        if(startNo < 0){
            System.out.println("startNo cannot be less than 0");
        }
        else if(endNo < 0){
            System.out.println("endNo cannot be less than 0");
        }
        else if(endNo > 9){
            System.out.println("endNo cannot be greater than 9");
        }
        else if(startNo > endNo){
            System.out.println("startNo must NOT be greater than endNo");
        }
        else {

            while(startNo <= endNo){
                if(startNo%2 == 0){
                    sumEven = sumEven + startNo;
                }
                startNo++;
            }
            System.out.println("Sum of even numbers is: "+ sumEven);
        }
    }
}
