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

public class Lab04_B {
    public int xValue;
    public int yValue;

    Lab04_B(){
        xValue = 0;
        yValue = 0;
    }

    //Setting the x value
    public void setXValue(int x){
        this.xValue = x;
    }
    //Getting the x value
    public int getXValue(){
        return xValue;
    }

    //Setting the y value
    public void setYValue(int y){
        this.yValue = y;
    }
    //Getting the y value
    public int getYValue(){
        return yValue;
    }

    public void getQuadrant(int xPoint, int yPoint){
        this.setXValue(xPoint);
        this.setYValue(yPoint);

        if (xValue > 0 && yValue > 0){
            //First Quadrant
            System.out.println("Point (" + xValue + "," + yValue +") is in Quadrant I");
        }
        else if (xValue < 0 && yValue > 0){
            //Second Quadrant
            System.out.println("Point (" + xValue + "," + yValue +") is in Quadrant II");
        }
        else if (xValue < 0 && yValue < 0){
            //Third Quadrant
            System.out.println("Point (" + xValue + "," + yValue +") is in Quadrant III");
        }
        else if(xValue == 0 && yValue == 0){
            //Center
            System.out.println("Point (" + xValue + "," + yValue +") is at the centre and not in any Quadrant");
        }
        else{
            //Fourth Quadrant
            System.out.println("Point (" + xValue + "," + yValue +") is in Quadrant IV");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the x and y value: ");
        int x = input.nextInt();
        int y = input.nextInt();

        //Object of Lab04_B
        Lab04_B graph1 = new Lab04_B();
        graph1.setXValue(x);
        graph1.setYValue(y);

        //Getting the quadrant of the point
        graph1.getQuadrant(graph1.getXValue(),graph1.getYValue());

    }
}
