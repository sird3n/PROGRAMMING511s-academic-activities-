package DSA_Demos;

public class Question_2 {

    /**
     someFunction(array, size)
     repeat (size - 1) times
     set the first element as the minimum
     for each of the array elements
     if element < currentMinimum
     set element as new minimum
     swap minimum with first element position
     print array
     end someFunction
     **/
    public void someFunction(int[] numArray,int arrSize){
        int[] Array = numArray;
        int size = arrSize;
        int count = 0;
        int min;
        int currentMin;

        while(count < size){
            min = Array[0];
            if(Array[count] < min){
                currentMin = min;
                min = Array[count];
                Array[0] = min;
                Array[count] = currentMin;

            }
            count++;
        }
        for(int i: Array){
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        int[] arr = {13,2,10,15,20,17,1};

        Question_2 func = new Question_2();
        func.someFunction(arr,7);

    }
}
