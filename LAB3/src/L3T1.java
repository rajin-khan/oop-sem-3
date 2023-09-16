import java.util.*;

public class L3T1 {

    public static void main(String[] args) {

        final double PI = 3.142;
        
        Scanner sc = new Scanner(System.in);
            
        System.out.print("Enter side: ");
        double length = sc.nextDouble();

        if (length<0) {

            System.out.println("Invalid input");
        }
        else {

            double area = (6*length*length)/(4*(Math.tan(PI/6)));
            System.out.println("The area of the hexagon is: "+area);
        }

        sc.close();

    }
}
