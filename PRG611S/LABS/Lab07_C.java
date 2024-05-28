package PRG611S.LABS;
import java.util.ArrayList;
import java.util.Collections;

/**
 * I hereby acknowledge that the work handed in is my own original work. If I
 * have quoted from any other source this information has been correctly referenced.
 * I also declare that I have read the Namibia University of Science and Technology
 * Policies on Academic Honesty and Integrity as indicated in my course outline and
 * the NUST general information and regulations - Yearbook 2022
 *
 * @author <Ihemba Simon M> <221102523>
 **/


//Java program to sort, printout ArrayList,
//add new number and print out the maximum number in an ArrayList.

public class Lab07_C {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);
        myNumbers.add(21);
        Collections.sort(myNumbers);

        int maxNum = 0;
        System.out.println("Sorted Array list are: ");
        for (int i = 0; i < myNumbers.size(); i++) {
            System.out.println(myNumbers.get(i));
            maxNum = Math.max(maxNum,myNumbers.get(i));
        }
        System.out.println("The Maximum number in the Array is: "+maxNum);
        System.out.println("The size of the Array is: "+myNumbers.size());
    }
}

