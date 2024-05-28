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
Package Activity1;
    public class Activity1 {
        String studname, dept;
        int studid;
        // Constructor initialized
        public Lab04-C (String studname, int studid, String dept)
        {
            this.studname = studname;
            this.studid = studid;
            this.dept = dept;
        }
        public static void main(String[] args) {
            //Object created
            Lab04-C John = new Lab04-C("John", 8886, "Computer Science");
            Lab04-C Steven = new Lab04-C("Steven", 888611, "Computer Science");
 System.out.println("Student's Record #1:"+John.studname+"   "+John.studid+"     "+John.dept+" ");
            }
    }

Classwork:

(1)  Modify the above program to have the sample out below and submit on VPL for automatic grading

 Sample run:

                            NAME             ID             DEPT            TEST   ASSIGN PROJECT TOTALMARK

Student's Record #1:John               8886        Computer Science 8       17         29                    54

Student's Record #2:Steven            888611    Computer Science 18     27       19                    64

Student's Record #3:Tessy             18886      Computer Science 7       11         19                    64

Student's Record #4:Jane                811886    Computer Science 18     27       21                    66

Student's Record #5:Saima            22886     Computer Science  16     27         22                    65

Student's Record #6:Pius                223886   Computer Science  12     19       32                    63


 */


//ATTEMPT 1

public class Lab05_B {
    String studname, dept;
    int studid, test, assign, project, totalmark;
    // Constructor initialized
    public Lab05_B (String studname, int studid, String dept, int test, int assign, int project) {
        this.studname = studname;
        this.studid = studid;
        this.dept = dept;
        this.test = test;
        this.assign = assign;
        this.project = project;

    }

    public void setTotalmark(int test, int assign, int project){
        this.totalmark = test + assign + project;
    }
    public int getTotalmark(){
        return totalmark;
    }


    public static void main(String[] args) {
        //Object created
        Lab05_B John = new Lab05_B("John", 8886, "Computer Science",8,17,29);
        John.setTotalmark(8,17,29);

        Lab05_B Steven = new Lab05_B("Steven", 888611, "Computer Science",18,27,19);
        Steven.setTotalmark(18,27,19);

        Lab05_B Tessy = new Lab05_B("Tessy", 18886, "Computer Science",7,11,19);
        Tessy.setTotalmark(7,11,19);

        Lab05_B Jane = new Lab05_B("Jane", 811886, "Computer Science",18,27,21);
        Jane.setTotalmark(18,27,21);

        Lab05_B Saima = new Lab05_B("Saima", 22886, "Computer Science",16,27,22);
        Saima.setTotalmark(16,27,22);

        Lab05_B Pius = new Lab05_B("Pius", 223886, "Computer Science",12,19,32);
        Pius.setTotalmark(12,19,32);


        //Display Data
        System.out.println("                     NAME" + "       "+ "ID" + "            " + "DEPT" + "            " + "TEST" + "               " + "ASSIGN" + "            " + "PROJECT" + "            " + "TOTALMARK");
        System.out.println("Student's Record #1:"+John.studname+"       "+John.studid+"     "+John.dept+"      "+John.test+"                  "+John.assign+"                 "+John.project+"                     "+John.getTotalmark());
        System.out.println("Student's Record #2:"+Steven.studname+"    "+Steven.studid+"     "+Steven.dept+"     "+Steven.test+"                  "+Steven.assign+"                "+Steven.project+"                     "+Steven.getTotalmark());
        System.out.println("Student's Record #3:"+Tessy.studname+"       "+Tessy.studid+"     "+Tessy.dept+"     "+Tessy.test+"                  "+ Tessy.assign+"                "+Tessy.project+"                     "+Tessy.getTotalmark());
        System.out.println("Student's Record #4:"+Jane.studname+"       "+Jane.studid+"     "+Jane.dept+"     "+Jane.test+"                  "+Jane.assign+"               "+Jane.project+"                     "+Jane.getTotalmark());
        System.out.println("Student's Record #5:"+Saima.studname+"      "+Saima.studid+"     "+Saima.dept+"      "+Saima.test+"                 "+Saima.assign+"                "+Saima.project+"                     "+Saima.getTotalmark());
        System.out.println("Student's Record #6:"+Pius.studname+"      "+Pius.studid+"     "+Pius.dept+"      "+Pius.test+"                 "+Pius.assign+"                "+Pius.project+"                     "+Pius.getTotalmark());


    }
}


//ATTEMPT 2

/**
 * I hereby acknowledge that the work handed in is my own original work. If I
 * have quoted from any other source this information has been correctly referenced.
 * I also declare that I have read the Namibia University of Science and Technology
 * Policies on Academic Honesty and Integrity as indicated in my course outline and
 * the NUST general information and regulations - Yearbook 2022
 *
 * @author <Ihemba Simon M> <221102523>
 **/

/*
public class Lab05_B {
    String studname, dept;
    int studid, test, assign, project, totalmark;
    // Constructor initialized
    public Lab05_B (String studname, int studid, String dept, int test, int assign, int project) {
        this.studname = studname;
        this.studid = studid;
        this.dept = dept;
        this.test = test;
        this.assign = assign;
        this.project = project;

    }

    public void setTotalmark(int test, int assign, int project){
        this.totalmark = test + assign + project;
    }
    public int getTotalmark(){
        return totalmark;
    }


    public static void main(String[] args) {
        //Object created
        Lab05_B John = new Lab05_B("John", 8886, "Computer Science",8,17,29);
        John.setTotalmark(8,17,29);

        Lab05_B Steven = new Lab05_B("Steven", 888611, "Computer Science",18,27,19);
        Steven.setTotalmark(18,27,19);

        Lab05_B Tessy = new Lab05_B("Tessy", 18886, "Computer Science",7,11,19);
        Tessy.setTotalmark(7,11,19);

        Lab05_B Jane = new Lab05_B("Jane", 811886, "Computer Science",18,27,21);
        Jane.setTotalmark(18,27,21);

        Lab05_B Saima = new Lab05_B("Saima", 22886, "Computer Science",16,27,22);
        Saima.setTotalmark(16,27,22);

        Lab05_B Pius = new Lab05_B("Pius", 223886, "Computer Science",12,19,32);
        Pius.setTotalmark(12,19,32);


        //Display Data
        System.out.println("  NAME" + "  "+ "ID" + "          " + "DEPT" + "         " + "TEST" + "   " + "ASSIGN" + " " + "PROJECT" + " " + "TOTALMARK");
        System.out.println("Student's Record #1:"+John.studname+"   "+John.studid+"     "+John.dept+" "+John.test+"       "+John.assign+"      "+John.project+"  "+John.getTotalmark());
        System.out.println("Student's Record #2:"+Steven.studname+" "+Steven.studid+"   "+Steven.dept+" "+Steven.test+"      "+Steven.assign+"      "+Steven.project+"  "+Steven.getTotalmark());
        System.out.println("Student's Record #3:"+Tessy.studname+" "+Tessy.studid+"     "+Tessy.dept+" "+Tessy.test+"       "+ Tessy.assign+"      "+Tessy.project+"  "+Tessy.getTotalmark());
        System.out.println("Student's Record #4:"+Jane.studname+" "+Jane.studid+"     "+Jane.dept+" "+Jane.test+"      "+Jane.assign+"      "+Jane.project+"  "+Jane.getTotalmark());
        System.out.println("Student's Record #5:"+Saima.studname+" "+Saima.studid+"     "+Saima.dept+" "+Saima.test+"      "+Saima.assign+"      "+Saima.project+"  "+Saima.getTotalmark());
        System.out.println("Student's Record #6:"+Pius.studname+" "+Pius.studid+"     "+Pius.dept+" "+Pius.test+"      "+Pius.assign+"      "+Pius.project+"  "+Pius.getTotalmark());


    }
}

*/
