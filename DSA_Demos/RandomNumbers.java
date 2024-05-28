package DSA_Demos;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();

        int UpperBound = 100;
        int[] randNums = new int[10];

        for(int i = 0; i <10; i++) {
            //if (randNums.length < 10) {
                randNums[i] = rand.nextInt(UpperBound);
            System.out.println(randNums[i]);
                // } else {
              //  break;

           // }
        }
      //  for (int randNum : randNums) {
        //    System.out.println(randNum);
        //}
    }
}
