/****
//Implementation in Java
import java.util.Scanner;
import java.time.LocalDate;


//STUDENT CLASS
class Student {
 private String name;
 private int studNum;

    public Student(String n, int num) {
    name = n;
    studNum = num;
    }

    //setting and getting the student number
    public void setStudNum(int num){
        this.studNum = num;
    }
    public int GetStudNum(){
        return studNum;
    }

    //setting and getting the name
    public void setName(String n){
        this.name = n;
    }
    public String GetName(){
    return name;    
    }


    public static void main(String[] args) {
        
    }

}

//BOOK CLASS
class Book {
    private String bookName;
    private int idNum;
    private String dateReturned;
    private String dateBorrowed;

    public Book(String n, int id, String dateR, String dateB) {
        bookName = n;
        idNum = id;
        dateReturned = dateR;
        dateBorrowed = dateB;
    }

    //Setter and Getter for Book Name
    public void SetBookName(String n) {
        this.bookName = n;
    }
    public String GetBookName() {
        return bookName;
    }

    //Setter and Getter for Book ID
    public void SetIdNum(int id) {
        this.idNum = id;
    }
    public int GetIdNum() {
        return idNum;
    }

    //Setter and Getter for Date returned
    public void SetDateReturned(String dR) {
        this.dateReturned = dR;
    }
    public String GetDateReturned() {
        return dateReturned;
    }

    //Setter and Getter for Date Borrowed
    public void SetDateBorrowed(String dB) {
        this.dateBorrowed = dB;
    }
    public String GetDateBorrowed() {
        return dateBorrowed;
    }

}

//LIBRARY CLASS
class Library {
    private Book[] listOfBooks;
    private Student[] Students;
    private int numOfBooks;
    private int stAmount;

    public Library() {
        listOfBooks = new Book[1000];
        Students = new Student[1000];
    }

    //Function to add books
    public void addNewBooks(String n, int id, String dateR, String dateB) {
        Book names = new Book(n, id, dateR, dateB);
        listOfBooks[numOfBooks] = names;
        numOfBooks++;
    }

    //Funtion to add Student
    public void addNewStudent(String n, int stNo) {
        Student stud = new Student(n,stNo);
        Students[stAmount] = stud;
        stAmount++;
    }

    //Funtion to verify Book
    public boolean verifyBook(int bookId) {
        for (int i = 0; i < numOfBooks; i++){
            if((listOfBooks[i].GetBookId()) == (bookId && listOfBooks[i].GetDateReturned() == DateTime.MinValue)) {
                return true;
            }
        }
        return false;
    }

    //Function to keep track of books returned
    public int booksToReturnOnDate (DateTime) {

    }
}
**/

//Sam's Code
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.SplittableRandom;
import java.time.LocalDate;
import java.util.Scanner;


class Book {
    private String bookTilte;
    private String bookId;
    private LocalDate borrowedDate;
    private LocalDate returnedDate;

    public Book (String newBookTitle, String newbookID, LocalDate newBorrowedDate, LocalDate newReturnedDate){
        bookTilte = newBookTitle;
        bookId = newbookID;
        borrowedDate = newBorrowedDate;
        returnedDate = newReturnedDate;
    }
    public String GetBookTitle(){
        return bookTilte;
    }
    public String GetBookId(){
        return bookId;
    }
    public void SetBorrowedDate(LocalDate newDate) {
        borrowedDate= newDate; 
    }
    public void SetReturnedDate(LocalDate newDate) {
        returnedDate= newDate;
    }
    public LocalDate GetBorrowedDate() {
        return borrowedDate;
    }
    public LocalDate GetReturnedDate() {
        return returnedDate;
    }
}

public class Student {
    private String studName;
    private String studNo;

    /*public Student(String newName, String newIDnum){
        studName = newName;
        studNo = newIDnum;
    } **/
    public String GetStudName(){
        return studName;
    }
    public String GetStudNo(){
        return studNo;
    }
}


class Library {
    private ArrayList<Book> books;
    private ArrayList<Student>students;
    public Library(){
        books= new ArrayList<Book>();
        students=new ArrayList<Student>();
    }
    public void AddBook(Book b){
        books.add(b);
    }
    public void AddStudent(Student b){
        students.add(b);
    }
    public Boolean CheckAvailability(String bookTitle) throws Exception {
        // loop through all the books
        // Get the current date
        LocalDate current = LocalDate.now();
        boolean state = false;
        for (Book i : books) {
            if (i.GetBookTitle().equals(bookTitle)) {
                //If the date is inbetween the borrowed and returned date, that means the book is currently unavailable
                if (current.isBefore(i.GetBorrowedDate()) || current.isAfter(i.GetReturnedDate())) {
                state = true;
                } 
                else{
                state = false;
                }
            }
        }
        return state;
    }


    public void BorrowBook(String name, String studNumber, String bookTitle){
        //Look the book
        for(Book i: books ){
            if(i.GetBookTitle().equals(bookTitle)){
                //borrowedBooks.add(bookTitle);
                //Set the borrowed date to now
                LocalDate current = LocalDate.now();
                i.SetBorrowedDate(current);
                //Set the returned date
                i.SetReturnedDate(LocalDate.of(2023,9,3));
                System.out.println("Book: " + i.GetBookTitle() );
                System.out.println("Book ID: " + i.GetBookId() );
                System.out.println("Borrowed on: " + i.GetBorrowedDate() );
                System.out.println("Return on: " + i.GetReturnedDate() );
            }
        }
    }

    public int booksToReturnOnDate(LocalDate current){
        int count= 0;
        for(Book i: books){
            if(current.isAfter(i.GetReturnedDate())){
                count++;
            }
        }
        return count;
    }
}


class Problem1Solution {
    public static void main(String[] args) {
        Library l1= new Library();
        Book b1 = new Book("Stranger Things","1253", LocalDate.parse("2023-01-10"),LocalDate.parse("2023-03-25"));
        Book b2 = new Book("Creative Thinkers","6572", LocalDate.parse("2023-05-06"),LocalDate.parse("2023-06-23"));
        Book b3 = new Book("Bible","0101", LocalDate.parse("2023-04-10"),LocalDate.parse("2023-03-25"));
        
        l1.AddBook(b1);
        l1.AddBook(b2);
        l1.AddBook(b3);
        
        System.out.println(l1.booksToReturnOnDate(LocalDate.of(2023,9,5)) + " Books to be returned");
        /**Student s1=new Student("Samuel Likuwa","2026718189");
        Student s2=new Student("Malakia John","2076256021"); 
        
        l1.AddStudent(s1);
        l1.AddStudent(s2); **/
        
        Scanner userInput = new Scanner(System.in);    
        try{
            System.out.println("What book do you wish to borrow today?");
            String bookT = userInput.nextLine();

            if(l1.CheckAvailability(bookT) == true){
                System.out.println("Book is available to Borrow");
                System.out.println("You can enter your details please.");
                System.out.println("Student Number: ");
                String studentNumber= userInput.nextLine();
                System.out.println("Student Name: ");
                String name = userInput.nextLine();
                l1.BorrowBook(name,studentNumber,bookT);
                System.out.println("Thank you for using the library, Enjoy Your new Read!");
            }
            else{
                System.out.println("We are sorry but the book is not available at the moment, you can come back after 5 days");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
