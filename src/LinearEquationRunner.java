import javax.sound.sampled.Line;
import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter coordinate 1: ");
        String coord1 = s.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coord2 = s.nextLine();
        int parenthesisx1 = coord1.indexOf("(");
        String x1 = "";
        String x2 = "";
        String y1 = "";
        String y2 = "";
        for (int i = coord1.indexOf(","); i != parenthesisx1; i--) {
            x1 = coord1.substring(i+1,parenthesisx1);
        }
        for (int i = coord1.indexOf(" "); i >= 0) {

        }




        int nx1 = Integer.parseInt(x1);
        int nx2 = Integer.parseInt(x2);
        int ny1 = Integer.parseInt(y1);
        int ny2 = Integer.parseInt(y2);
        LinearEquation linearEq = new LinearEquation(nx1,ny1,nx1,ny2);
        System.out.println(linearEq.lineInfo());

    }
}
