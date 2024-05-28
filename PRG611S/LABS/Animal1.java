package PRG611S.LABS;

/**
 * I hereby acknowledge that the work handed in is my own original work. If I
 * have quoted from any other source this information has been correctly referenced.
 * I also declare that I have read the Namibia University of Science and Technology
 * Policies on Academic Honesty and Integrity as indicated in my course outline and
 * the NUST general information and regulations - Yearbook 2022
 *
 * @author <Ihemba Simon M> <221102523>
 **/

/*
class Animal1 {
// field and method of the parent class
string name;
public void eat() {
System.out.println("I can eat");
}
}
// inherit from Animal
class Dog extend Animal1 {
// new method in subclass
public void display() {
System.out.println("My name is " + name);
}
}
public Class Animal {
public static void main(String[] args) {
// create an object of the subclass
Dog labrador = new Dog();
// access field of superclass
labrador.name = "Rohu";
labrador.display();
// call method of superclass
// using object of subclass
labrador.eat();
}
}

VPL lab Work:
(1) Copy and correct the above program on IntelliJ or Netbeans Java
(2) Copy and submit the corrected codes on VPL elearning for automatic grading

 */

//LAB06_A
/*
public class Animal1 {
    // field and method of the parent class
    String name;
    public void eat() {
        System.out.println("I can eat");
    }
}
// inherit from Animal
class Dog extends Animal1 {
    // new method in subclass
    public void display() {
        System.out.println("My name is " + name);
    }
}

class Animal {
    public static void main(String[] args) {
        // create an object of the subclass
        Dog labrador = new Dog();
        // access field of superclass
        labrador.name = "Rohu";
        labrador.display();
        // call method of superclass
        // using object of subclass
        labrador.eat();
    }
}
 */


//LAB06_B
public class Animal1 {
    // field and method of the parent class
    String name;
    public void eat() {
        System.out.println("I can eat very well");
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
// inherit from Animal
class Dog extends Animal1 {
    // new method in subclass
    public void display() {
        System.out.println("My surname is " + getName());
    }
}

class Animal {
    public static void main(String[] args) {
        // create an object of the subclass
        Dog labrador = new Dog();
        // access field of superclass
        labrador.setName("Rohuda");
        labrador.display();
        // call method of superclass
        // using object of subclass
        labrador.eat();
    }
}