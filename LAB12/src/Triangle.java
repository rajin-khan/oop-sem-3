import java.util.*;

public class Triangle {

    public static void main(String[] args) throws IllegalTriangleException {
        
        Scanner sc = new Scanner(System.in);

        double sideA, sideB, sideC;

        System.out.println("\nEnter the three sides of your triangle.\n");

        System.out.print("Side A: ");
        sideA = sc.nextDouble();

        System.out.print("Side B: ");
        sideB = sc.nextDouble();

        System.out.print("Side C: ");
        sideC = sc.nextDouble();

        checkTriangle(sideA, sideB, sideC);

        sc.close();

        
    }

    public static void checkTriangle(double sideA, double sideB, double sideC) throws IllegalTriangleException {

        try {

            if (sideA + sideB < sideC) {

                throw new IllegalTriangleException("The sum of two sides must be greater than the third.");
            }
            else if (sideA + sideC < sideB) {

                throw new IllegalTriangleException("The sum of two sides must be greater than the third.");
            }
            else if (sideB + sideC < sideA) {

                throw new IllegalTriangleException("The sum of two sides must be greater than the third.");
            }
            else {

                System.out.println("\nYour triangle's dimensions are valid.");
            }
        }
        catch (IllegalTriangleException e) {

            e.printStackTrace();
        }

    }
}
