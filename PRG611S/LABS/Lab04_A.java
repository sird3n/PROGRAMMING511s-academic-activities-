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

public class Lab04_A {
    private String firstName;
    private String lastName;
    private int studentAge;
    private String gender;
    private int studentNumber = 22201000;
    public int registeredStudents = 0;


    public void setStudentNumber(int no){
        this.studentNumber = studentNumber + no;

    }
    public int getStudentNumber(){
        return studentNumber;

    }

    public int getRegisteredStudents(){
        return registeredStudents;
    }

    //Default constructor
    Lab04_A(){
        firstName = "Ihemba";
        lastName = "Simon";
        studentAge = 19;
        gender = "M";
        studentNumber = 22201000;
    }

    //Setting the student's first name
    public void setFirstName(String fname){
        this.firstName = fname;
    }

    //Getting the student's first name
    public String getFirstName(){
        return firstName;
    }

    //Setting the student's last name
    public void setLastName(String lname){
        this.lastName = lname;
    }

    //Getting the student's last name
    public String getLastName(){
        return lastName;
    }

    //Setting the student's age
    public void setStudentAge(int age){
        this.studentAge = age;

    }

    //Getting the student's age
    public int getStudentAge(){
        return studentAge;
    }

    //Setting the gender
    public void setGender(String sex){
        this.gender = sex;
    }

    //Getting the gender
    public String getGender(){
        return gender;
    }
    Lab04_A(int studentNo, String fName, String lName,int age,String sex){
        this.setFirstName(fName);
        this.setLastName(lName);
        this.setGender(sex);
        this.setStudentAge(age);

        //Modeling students details
        System.out.println("Full names: "+this.getFirstName()+" "+this.getLastName());
        System.out.println("Age: "+this.getStudentAge());
        System.out.println("Gender: "+this.getGender());
        System.out.println("Student Number: "+studentNo);
        System.out.println("");
    }
/*
    public String toString(int studentNo){
        //Modeling students details
        return "Full names: " +this.getFirstName()+ " " + this.getLastName();
        return "Age: " + this.getStudentAge();
        return "Gender: " + this.getGender();
        return "Student Number: " + studentNo;
        return "";
    }

 */

    public static void main(String[] args) {
        Lab04_A obj = new Lab04_A();

        //Scanner method to allow for user input
        Scanner input = new Scanner(System.in);
        String name1;
        String name2;
        int age;
        String sex;
        //System.out.println("Please enter number of students");
        int numberOfStudents = input.nextInt();

        //Checking if student count is a positive number and not negative
        if(numberOfStudents > 0){
            for (int i = 1; i <= numberOfStudents; i++){
                // System.out.println("Enter student's details");
                name1 = input.next();
                name2 = input.next();
                age = input.nextInt();
                sex = input.next();

                if (obj.getRegisteredStudents() == 0){
                    obj.setStudentNumber(1);
                    int XYZ = obj.getStudentNumber();

                    //Checking if age is a positive number and not negative
                    if(age > 0){
                        Lab04_A student1 = new Lab04_A(XYZ,name1,name2,age,sex);
                    }else{
                        System.out.println("Please provide a valid student age.");
                    }
                } else if (obj.getRegisteredStudents() > 0 && !(obj.getRegisteredStudents() < 0)) {
                    obj.setStudentNumber(1);
                    int XYZ = obj.getStudentNumber();

                    //Checking if age is a positive number and not negative
                    if(age > 0){

                        Lab04_A student1 = new Lab04_A(XYZ,name1,name2,age,sex);
                    }else{
                        System.out.println("Please provide a valid student age.");
                    }
                }
            }
        }
        else{
            System.out.println("Please provide a positive count of students");
        }
    }
}


