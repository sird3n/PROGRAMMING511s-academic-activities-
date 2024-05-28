package PRG611S.LABS;
import java.util.Scanner;

/**
 * I hereby acknowledge that the work handed in is my own original work. If I
 * have quoted from any other source this information has been correctly referenced.
 * I also declare that I have read the Namibia University of Science and Technology
 * Policies on Academic Honesty and Integrity as indicated in my course outline and
 * the NUST general information and regulations - Yearbook 2022
 *
 * @author <Ihemba Simon M> <221102523>
 **/

//Start of the program
class Students {
    void Play() {
        System.out.println("We are proud students of NUST");

    }

    void attendClass() {
        System.out.println("FTimers attend class from 7h30am to 17h15am");
    }

}
class FT extends Students {
    void Play() {
        System.out.println("Mr Steven-I am in FT programme");

    }
}
class PT extends Students {
    void Play() {
        System.out.println("Ms Jane-I am in PT programme");
    }
}
public class Lab08_A {
    public static void main(String args[]) {
        Students FT = new FT();
        Students PT = new PT();
        Students STUD = new Students();

        System.out.println("Demonstration of Hierarchical Inheritance:");
        STUD.Play();
        FT.Play();
        PT.Play();
    }
}

