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


//TASK
/*
package employee;

//import java.util.Scanner;

class Employee1 {

// field and method of the parent class

float basic_sal=40000;

float housing_all=20000;

float transport_all=7000;

}

// inherit from Employee1

class programmer extends Employee1 {

String bonus=12000;

float overtime=9100;

float prog_total_sal;

}

public class Employee {

public static void main(String args[]) {

    String first_name1, last_name1;

        Scanner firstname = new Scanner(System.in);

        Scanner lastname = new Scanner(System.in);

        System.out.println("EMPLOYEE #1: ");

        System.out.println("Enter a First Name: ");

        first_name1 = firstname.nextLine();

        System.out.println("Enter a Last Name: ");

        last_name1 = lastname.nextLine();

programmer prog=new programmer();

prog.prog_total_sal = prog.basic_sal + prog.housing_all + prog.transport_all + prog.bonus + prog.overtime;

System.out.println("Programmer’s Firstname and LastName are:"+first_name1 +" "+last_name1);

System.out.println("Programmer’s Basic salary is:"+prog.basic_sal);

System.out.println("Programmers Housing Allowance is:"+prog.housing_all);

System.out.println("Programmers Transport Allowance is:"+prog.transport_all);

System.out.println("Bonus of Programmer is:"+prog.bonus);

System.out.println("overtime of Programmer is:"+prog.overtime);

System.out.println("TOTAL SALARY OF PROGRAMMER IS:"+prog.prog_total_sal);

System.out.println("");

}

Classwork:

(1)   Run and correct the above program using InteliJ or Netbeans Java.

Sample run:

EMPLOYEE #1:

Enter a First Name:

Steven

Enter a Last Name:

Job

Programmer’s Firstname and LastName are:Steven Job

Programmer’s Basic salary is:40000.0

Programmers Housing Allowance is:20000.0

Programmers Transport Allowance is:7000.0

Bonus of Programmer is:12000.0

overtime of Programmer is:9100.0

TOTAL SALARY OF PROGRAMMER IS:88100.0

(2)   Include the record for admin and library as shown in the Table below and submit on VPL for automatic grading

                              Table 1: Entitlement

Class Name

Entitlement to all Employee

Amount N$

Employee1

Basic Salary

40000

Housing Allowance

20000

Transport Allowance

7000



                                     Table 2: Employee Table

Class Name

Allowance Type

Amount N$

Programmer

Bonus

12000

Overtime

9100

total salary



Admin

Bonus

10000

Overtime

900

total salary



Library

Bonus

90000

Overtime

1900

total salary



   Total salary for each employee is calculated as follows:

    total_sal = basic_sal + housing_all + transport_all + bonus + overtime

Sample run:

EMPLOYEE #1:

Enter a First Name:

Steven

Enter a Last Name:

Job

Programmer’s Firstname and LastName are:Steven Job

Programmer’s Basic salary is:40000.0

Programmers Housing Allowance is:20000.0

Programmers Transport Allowance is:7000.0

Bonus of Programmer is:12000.0

overtime of Programmer is:9100.0

TOTAL SALARY OF PROGRAMMER IS:88100.0

EMPLOYEE #2:

Enter a First Name:

Taka

Enter a Last Name:

Duve

Programmer’s Firstname and LastName are:Taka Duve

Admin’s Basic salary is:40000.0

Admin's Housing Allowance is:20000.0

Admin's Transport Allowance is:7000.0

Bonus of Admin is:10000.0

overtime of Admin is:900.0

TOTAL SALARY OF ADMIN STAFF IS:77900.0

EMPLOYEE #3:

Enter a First Name:

You

Enter a Last Name:

Game

Librarian’s Firstname and LastName are:You Game

Librarian’s Basic salary is:40000.0

Librarian's Housing Allowance is:20000.0

Librarian's Transport Allowance is:7000.0

Bonus of Librarian is:90000.0

overtime of Librarian is:1900.0

TOTAL SALARY OF LIBARY STAFF IS:158900.0

 */

public class Lab05_C {
    //LAB05_C
}

//import java.util.Scanner;

/*

class Employee1 {
// field and method of the parent class
    float basic_sal=40000;

    float housing_all=20000;

    float transport_all=7000;

}

// inherit from Employee1
//PROGRAMMER EMPLOYEE
class Programmer extends Employee1 {

    float bonus = 12000;

    float overtime = 9100;

    float prog_total_sal;

}

//ADMIN EMPLOYEE
class Admin extends Employee1{
    float bonus = 10000;

    float overtime = 900;

    float admin_total_sal;
}

//LIBRARIAN EMPLOYEE
class Library extends Employee1{
    float bonus = 90000;

    float overtime = 1900;

    float lib_total_sal;
}


class Employee {
    public static void main(String args[]) {

        String first_name1, last_name1;
        Scanner names = new Scanner(System.in);

        System.out.println("EMPLOYEE #1: ");
        System.out.println("Enter a First Name: ");
        first_name1 = names.nextLine();

        System.out.println("Enter a Last Name: ");
        last_name1 = names.nextLine();

        //PROGRAMMER EMPLOYEE OBJECT
        Programmer prog = new Programmer();
        prog.prog_total_sal = prog.basic_sal + prog.housing_all + prog.transport_all + prog.bonus + prog.overtime;

        System.out.println("Programmer’s Firstname and LastName are:" + first_name1 + " " + last_name1);
        System.out.println("Programmer’s Basic salary is:" + prog.basic_sal);
        System.out.println("Programmers Housing Allowance is:" + prog.housing_all);
        System.out.println("Programmers Transport Allowance is:" + prog.transport_all);
        System.out.println("Bonus of Programmer is:" + prog.bonus);
        System.out.println("overtime of Programmer is:" + prog.overtime);
        System.out.println("TOTAL SALARY OF PROGRAMMER IS:" + prog.prog_total_sal);
        System.out.println("");


        //ADMIN EMPLOYEE OBJECT
        Admin admin = new Admin();
        admin.admin_total_sal = admin.basic_sal + admin.housing_all + admin.transport_all + admin.bonus + admin.overtime;

        System.out.println("Admin's Firstname and LastName are:" + first_name1 + " " + last_name1);
        System.out.println("Admin's Basic salary is:" + admin.basic_sal);
        System.out.println("Admin's Housing Allowance is:" + admin.housing_all);
        System.out.println("Admin's Transport Allowance is:" + admin.transport_all);
        System.out.println("Bonus of Admin is:" + admin.bonus);
        System.out.println("overtime of Admin is:" + admin.overtime);
        System.out.println("TOTAL SALARY OF ADMIN STAFF IS:" + admin.admin_total_sal);
        System.out.println("");




        //LIBRARIAN EMPLOYEE OBJECT
        Library lib = new Library();
        lib.lib_total_sal = lib.basic_sal + lib.housing_all + lib.transport_all + lib.bonus + lib.overtime;

        System.out.println("Librarian's Firstname and LastName are:" + first_name1 + " " + last_name1);
        System.out.println("Librarian's Basic salary is:" + lib.basic_sal);
        System.out.println("Librarian's Housing Allowance is:" + lib.housing_all);
        System.out.println("Librarian's Transport Allowance is:" + lib.transport_all);
        System.out.println("Bonus of Librarian is:" + lib.bonus);
        System.out.println("overtime of Librarian is:" + lib.overtime);
        System.out.println("TOTAL SALARY OF LIBRARY STAFF IS:" + lib.lib_total_sal);
        System.out.println("");

    }
}
*/