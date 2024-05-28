package DSA_Demos;
import java.util.Arrays;

public class SomeFunction {
    // Selection sort in Java
    void someFunction(int array[]) {
        int size = array.length;
        int iterations = 0;

        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;

            for (int i = step + 1; i < size; i++) {

                // To sort in descending order, change > to < in this line.
                // Select the minimum element in each loop.
                if (array[i] < array[min_idx]) {
                    min_idx = i;
                }
                System.out.println(Arrays.toString(array));
            }
            iterations++;


            // put min at the correct position
            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;

        }
        System.out.println("Number of iterations is "+iterations);
    }

    // driver code
    public static void main(String args[]) {
        int[] data = {13, 2, 10, 15, 20, 17, 1};
        SomeFunction ss = new SomeFunction();
        ss.someFunction(data);
        // System.out.println("Sorted Array in Ascending Order: ");
        // System.out.println(Arrays.toString(data));
    }
}
