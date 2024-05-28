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

public class Employee1 {
    // field and method of the parent class
    float basic_sal = 40000;

    float housing_all = 20000;

    float transport_all = 7000;


    public static void main(String args[]) {

        String first_name1, last_name1;
        Scanner names = new Scanner(System.in);


        //for (int i = 1; i <= 3; i++) {

            //if (i == 1) {

                System.out.println("EMPLOYEE #1: ");
                System.out.println("Enter a First Name: ");
                first_name1 = names.next();

                System.out.println("Enter a Last Name: ");
                last_name1 = names.next();

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

            //}
            //if (i == 2) {

                System.out.println("EMPLOYEE #2: ");
                System.out.println("Enter a First Name: ");
                first_name1 = names.next();

                System.out.println("Enter a Last Name: ");
                last_name1 = names.next();


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

            //}
            //if (i == 3) {

                System.out.println("EMPLOYEE #3: ");
                System.out.println("Enter a First Name: ");
                first_name1 = names.next();

                System.out.println("Enter a Last Name: ");
                last_name1 = names.next();


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

            //}

        //}
    }
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

