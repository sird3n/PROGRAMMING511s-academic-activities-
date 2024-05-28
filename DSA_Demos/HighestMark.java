package DSA_Demos;

public class HighestMark {
    public static void main(String[] args) {
        //create array
        int[] dsaMarks = {23, 57, 26, 68, 64, 59, 47, 70, 27, 68 ,36, 89, 58, 37, 68, 57};

        int arraySize = dsaMarks.length-1, count,temp, i, hMark;

        count = arraySize;
        while(count > 1){
            for(i = 1; i < count; i++){
                if(dsaMarks[i] > dsaMarks[i+1]){
                    temp = dsaMarks[i];
                    dsaMarks[i+1] = dsaMarks[i];
                    dsaMarks[i] = temp;
                }
            }
            count = count - 1;
        }

        hMark = dsaMarks[arraySize];
        System.out.println("The highest mark is: "+hMark);





    }


}
