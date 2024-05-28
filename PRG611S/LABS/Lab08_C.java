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

class C {
    public void Print() {
        System.out.println("C is the Parent Class to all A,B,Lab08_C");
    }
}
class A extends C {
    public void Print() {
        System.out.println("A has Single Inheritance with C and shares Hierarchy with B");
    }
}
class B extends C {
    public void Print() {
        System.out.println("B has Single Inheritance with C and shares Hierarchy with A");
    }
}
class D extends A {
}

public class Lab08_C extends A {
    public void Print() {
        System.out.println("Lab08_C has Single Inheritance with A and Multi-Level inheritance with C");
    }

    public static void main(String args[]) {
        A w = new A();
        B x = new B();
        C y = new C();
        Lab08_C z = new Lab08_C();

        System.out.println("Demonstration of Hybrid Inheritance:");
        y.Print();
        w.Print();
        x.Print();
        z.Print();
    }
}
