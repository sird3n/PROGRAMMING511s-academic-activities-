package Practicals;

public class GradeBook {

    public void displayMessage(){
        System.out.println("Welcome to Programming 2 Practicals");
    }
    public int sumNumbers(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        return sum;
    }

    public void printName(String input){
        String name = input;

        for (int i = 0; i < 5; i++){
            System.out.println(name);
        }

    }

    public String returnName(String name){

        return name;
    }
}





