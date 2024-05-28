package Self_Study;
import java.util.Scanner;

public class Exam_Prep {
    public static void main(String[] args) {
            Scanner input = new Scanner(System. in);

           String[] names = {"Lovisa","John"};
           int[] test = {59,52};
           int[] assignment = {85,45};

           qualify(names,test,assignment);
    }
    static void qualify(String[] names, int[] test, int[] assignment){
        String name = "";
        int finalMark = 0;
        int i;
        for(i = 0; i <= names.length-1; i++){
            finalMark = (int) Math.ceil((test[i]*0.4)+(assignment[i]*0.6));

            System.out.print("Name \t\t Test \t\t Assignment \t\t Final \t\t Examination \n");
            System.out.print("-------- \t\t-------- \t\t--------\t\t -------- \t\t -------- \t\t\n");
            System.out.print(names[i]+ "\t\t" + test[i] +"\t\t"+assignment[i] + finalMark);
            //System.out.print("Assignment \n -------- \n"+assignment[i]+"\t");
            //System.out.print("Final \n -------- \n"+finalMark+"\t");

            if(finalMark > 50){
                System.out.print("\t\tAllowed");
            }
            else {
                System.out.print("\t\tDenied");
            }
        }
    }

    }

