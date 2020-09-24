// Program has to tell wither a circle overlaps
import java.util.Scanner;
 
public class Circles {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle1's center x-, y-coordinates, and radius:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble(); 
        double r1 = input.nextDouble(); 
        System.out.print("Enter circle2's center x-, y-coordinates, and radius:");
        double x2 = input.nextDouble(); 
        double y2 = input.nextDouble(); 
        double r2 = input.nextDouble(); 
        input.close(); 
        if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow( y2 - y1, 2), 0.5) <= Math.abs(r1 - r2))
            System.out.println("Circle2 is inside Circle1");
        else if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= r1 + r2)
            System.out.println("Circle2 overlaps Circle1");
        else 
            System.out.println("Circle 2 does not overlap circle1");
    }
}
