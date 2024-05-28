package PRG611S.LABS;
//LAB04_C
/**
 * I hereby acknowledge that the work handed in is my own original work. If I
 * have quoted from any other source this information has been correctly referenced.
 * I also declare that I have read the Namibia University of Science and Technology
 * Policies on Academic Honesty and Integrity as indicated in my course outline and
 * the NUST general information and regulations - Yearbook 2022
 *
 * @author <Ihemba Simon M> <221102523>
 **/


public class Student {
    //ATTRIBUTE/PROPERTY SECTION
    String studName, studDept;
    int test1, test2, assign1, studNumber, totalMark;
}
class Student1 {
    public static void main(String[] args) {
        //CREATION OF OBJECT
        Student stud = new Student();
        stud.studName = "Teresia Aka";
        stud.studDept = "Computer Science";
        stud.studNumber = 93100191;
        stud.test1 = 23;
        stud.test2 = 18;
        stud.assign1 = 20;
        int totalMark = stud.test1 + stud.test2 + stud.assign1;


        //PRINTING SECTION-METHOD
        System.out.println("Student Name: "+stud.studName);
        System.out.println("Student Department: "+stud.studDept);
        System.out.println("Test1: "+stud.test1);
        System.out.println("Test2: "+stud.test2);
        System.out.println("Student Number: "+ stud.studNumber);
        System.out.println("Assignment: "+stud.assign1);
        System.out.println("Total Mark: "+totalMark);
    }
}