package LABS;
import java.util.Scanner;

public class Lab08_C{
    private static Scanner sc;
    public static void main(String[] args) {
        sc= new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        System.out.println("Enter size of array");
        int size = sc.nextInt();

        System.out.format("Enter %d value array", size);
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Please Enter Number to Search =  ");
        int num = sc.nextInt();


        int result = binSrchRes(arr, num, 0, arr.length);

        if(result == -1)
        {
            System.out.println("Number Not Found");
        }
        else
        {
            System.out.println("Number Found at index position = " + result);
        }
    }

    //The beginning of method/function
    public static int binSrchRes(int arr[], int num, int start, int end)
    {
        int mid;
        while(start <= end)
        {
            mid = start + (end - start) / 2;

            if(arr[mid] == num)
            {
                return mid;
            }
            if(arr[mid] < num)
            {
                start = start + 1;
            }
            else
            {
                end = end - 1;
            }
        }
        return -1;
    }
}

