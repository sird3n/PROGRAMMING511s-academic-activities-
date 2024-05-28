package PRG611S.LABS;


//TASK
/*
n this project, students are to use Java to develop a payroll software to assist in paying the salary of employees/staff of a certain university named XYZ University. Assume we have three employees in the university with ranks - Programmer, Admin and Librarian, write a Java program to calculate and print out the total salary of these three employees in the institution. The program should have the following features:

1) Create a public class named: Employee that would get the firstname and lastname of each employee from the keyboard/user

2) Create three objects: prog, adm and lib, for programmer, admin and librarian respectively to access the properties in Employee class.

3) Create EmployeeSalary as parent interface to store basic_sal, housing_all and transport_all. The values for these three items are fixed for all Employee and has abstract function calculateSalary.

4) Create three sub classes namely: programmer, admin and librarian to store bonus, overtime and total salary for each employee

5) Each of the constructor in (4) should inherit the properties of Employee(using the super keyword) and implement the EmployeeSalary interface.

6) Hide the properties from the parent class Employee using encapsulation principle.

7) Use getters and setters to make the properties in Employee visible and accessible to other classes: programmer, admin and librarian.

8) The total salary should be computed by adding basic salary, housing allowance, transport allowance, and bonus, overtime.

9) The printout of the program should display the following for each employee: firstname and lastname, basic salary, housing allowance, Transport allowance, bonus, overtime and total salary.

NB: LINES INDICATED IN BLUE ARE USER INPUT(VALUES FROM KEYBOARD) AND THE REST IS WHAT YOUR CLASSES SHOULD FORMAT THE VALUES THROUGH TOSTRING METHODS.

SAMPLE OUTPUT WOULD BE:

Enter an employee rank: Programmer

Enter a First Name: Steven

Enter a Last Name: Pato

Enter employee salary : 40000

Programmer’s Firstname and LastName are: Steven Pato

Programmer’s Basic salary is:N$ 40000.00

Programmers Housing Allowance is:N$ 20000.00

Programmers Transport Allowance is:N$ 7000.00

Bonus of Programmer is:N$ 12000.00

overtime of Programmer is:N$ 9100.00

TOTAL SALARY OF PROGRAMMER IS:N$ 88100.00
 */

public class Lab_03 {

}
