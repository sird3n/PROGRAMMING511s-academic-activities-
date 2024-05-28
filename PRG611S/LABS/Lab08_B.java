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

class Animal2 {

    public void animalSound() {

        System.out.println("The animal makes a sound");

    }

}

class Pig extends Animal2 {

    public void animalSound() {

        System.out.println("The pig says: wee wee");

    }

}

class Dog2 extends Animal2 {

    public void animalSound() {

        System.out.println("The dog says: bow wow");

    }

}

class Bird extends Animal2 {

    public void animalSound() {

        System.out.println("The Bird: Whistle");

    }

}

class Rat extends Animal2 {

    public void animalSound() {

        System.out.println("The Rat: Squeak");

    }

}

class Lion extends Animal2 {

    public void animalSound() {

        System.out.println("The Lion: Roar");

    }

}


public class Lab08_B {

    public static void main(String[] args) {

        Animal2 myAnimal = new Animal2();  // Create a Animal object

        Animal2 myPig = new Pig();  // Create a Pig object

        Animal2 myDog = new Dog2();  // Create a Dog object

        Animal2 myBird = new Bird();  // Create a Bird object

        Animal2 myRat = new Rat();  // Create a Rat object

        Animal2 myLion = new Lion();  // Create a Lion object

        System.out.println("Demonstration of Polymophism:");

        myAnimal.animalSound();

        myPig.animalSound();

        myDog.animalSound();

        myBird.animalSound();

        myRat.animalSound();

        myLion.animalSound();

    }

}
