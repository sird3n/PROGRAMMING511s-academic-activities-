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

//TASK
/*
The Java program below has some errors:

package activity1;
public class Activity1 {
            String name;
            int rollno;
            int age;

            public static void main(String[] arg) {
               activity1 std = new activity1();

               // Accessing the property value
               student.name = "Ramesh";
               student.number = 253110101;
               student.age = 25;

              System.out.println("Name: "+ student.name);
              System.out.println("Student Number: "+ student.number);
              System.out.println("Age: "+ student.age);

            }
}

Classwork:

(1)   Correct and run the program using InteliJ or Netbeans Java

(2)   Add Department as part of the output

(3)   Add Semester mark as part of the output

(4)   The program may give 0% on VPL, correct and re-submit on VPL elearning for automatic grading.

Sample run:
 Name: Ramesh
 Student Number: 253110101
 Age: 25
 Department: Computer Science
 Semester Mark: 67

 */

/*
public class Lab05_A {

}

*/
class Activity1 {
    String name;
    int number;
    int age;
    String dept;
    int semMark;

    public static void main(String[] arg) {
        Activity1 std = new Activity1();

        // Accessing the property value
        std.name = "Ramesh";
        std.number = 253110101;
        std.age = 25;
        std.dept = "Computer Science";
        std.semMark = 67;

        System.out.println("Name: "+ std.name);
        System.out.println("Student Number: "+ std.number);
        System.out.println("Age: "+ std.age);
        System.out.println("Department: "+std.dept);
        System.out.println("Semester Mark: "+ std.semMark);
    }
}