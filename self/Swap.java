import java.util.*;

public class Swap {

    public static void main (String args[]) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("\nPlease enter the values of a and b.\n");

            System.out.print("a: ");
            float a = sc.nextFloat();

            System.out.print("\nb: ");
            float b = sc.nextFloat();

            System.out.print("\nBefore swapping, the values of a and b were:\n");
            System.out.print("a = " + a);
            System.out.println(", b = " + b);
            
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.print("\nAfter swapping, the values of a and b are:\n");
            System.out.print("a = " + a);
            System.out.println(", b = " + b);
        }
    }

}