import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String [] args) {

        //Inputs
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Linear Equation Maker :)");
        System.out.println("Please write your coordinate in format of (x, y)");
        System.out.print("Enter coordinate 1: ");
        String coord1 = s.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coord2 = s.nextLine();

        //Converting String to int
        String x1 = coord1.substring(1, coord1.indexOf(","));
        String x2 = coord2.substring(1, coord2.indexOf(","));
        String y1 = coord1.substring(coord1.indexOf(",")+2, coord1.length()-1);
        String y2 = coord2.substring(coord2.indexOf(",")+2,coord2.length()-1);
        int nx1 = Integer.parseInt(x1);
        int nx2 = Integer.parseInt(x2);
        int ny1 = Integer.parseInt(y1);
        int ny2 = Integer.parseInt(y2);

        //Linear Equation Info
        LinearEquation linearEq = new LinearEquation(nx1,ny1,nx2,ny2);
        System.out.println("----- Line info -----");
        System.out.println(linearEq.lineInfo());

        //Enter a x coordinate
        if (nx1 != nx2) {
            System.out.println(" ");
            System.out.print("Enter a value for x: ");
            double xValue = s.nextDouble();
            System.out.println(" ");
            //Returns the coordinate
            System.out.println("The point on the line is " + linearEq.coordinateForX(xValue));
        } else {
            System.out.println(" ");
        }
    }
}
