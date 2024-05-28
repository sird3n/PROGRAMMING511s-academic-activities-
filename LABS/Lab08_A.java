package LABS;
import java.util.Scanner;
public class Lab08_A {
    private static Scanner sc;
    public static void main(String[] args) {
        int i, j, Size, temp;
        sc = new Scanner(System.in);
        System.out.print("Enter the Bubble Sort Array size = ");
        Size = sc.nextInt();
        int[] arr = new int[Size];
        System.out.format("Enter Bubble Sort Array %d elements  = ", Size);
        for(i = 0; i < Size; i++)
        {
            arr[i] = sc.nextInt();
        }

        //Bubble Sort using for loop
        for(i = 0; i < arr.length; i++)
        {
            for(j = 0; j < arr.length - i - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //Bubble Sort using while loop
        /**
        while(i < arr.length)
        {
            j = 0;
            while(j < arr.length-i-1)
            {
                if(arr[j] < arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                j++;
            }
            i++;
        }
         **/

        System.out.println("Bubble Sort to Sort Integers in Descending Order");
        for(i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}

