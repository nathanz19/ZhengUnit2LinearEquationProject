import javax.sound.sampled.Line;
import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please print the coordinates in format of (x, y)");
        System.out.print("Enter coordinate 1: ");
        String coord1 = s.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coord2 = s.nextLine();
        String x1 = coord1.substring(coord1.indexOf(",")-1,coord1.indexOf(","));
        String x2 = coord2.substring(coord1.indexOf(",")-1,coord2.indexOf(","));
        String y1 = coord1.substring(coord1.indexOf(",")+2,coord1.indexOf(",")+3);
        String y2 = coord1.substring(coord2.indexOf(",")+2,coord2.indexOf(",")+3);
        int nx1 = Integer.parseInt(x1);
        int nx2 = Integer.parseInt(x2);
        int ny1 = Integer.parseInt(y1);
        int ny2 = Integer.parseInt(y2);
        LinearEquation linearEq = new LinearEquation(nx1,ny1,nx1,ny2);
        System.out.println(linearEq.lineInfo());
    }
}
