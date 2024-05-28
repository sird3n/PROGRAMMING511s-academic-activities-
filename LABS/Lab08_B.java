package LABS;

public class Lab08_B {
    public static void main(String[] args) {
        int i, j;
        String[] str = {"Java", "Python", "C", "SQL", "Tableau"};

        String temp;
        System.out.println("Sorting String using the Bubble Sort");
        //Bubble Sort using for loop
        /*
        for(i = 0; i < str.length; i++) {
            for(j = 0; j < str.length - i - 1; j++) {
                    if(str[j + 1].compareTo(str[j]) < 0) {
                        temp = str[j];
                        str[j] = str[j + 1];
                        str[j + 1] = temp;
                    }
                }
                System.out.println(str[j]);
        }**/

        //Bubble sort using while loop
        i = 0;
        while(i < str.length ) {
            j = 0;
            while(j < str.length - i - 1) {
                if(str[j + 1].compareTo(str[j]) < 0) {
                    temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
                j++;
            }
            System.out.println(str[j]);
            i++;
        }
    }
}

