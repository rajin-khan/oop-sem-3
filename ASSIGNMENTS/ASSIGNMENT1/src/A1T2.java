import java.util.*;

public class A1T2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int prod = 1;
        
        System.out.println("\nThis program will calculate aᵇ.");

        System.out.print("\nPlease enter a: ");
        int a = sc.nextInt();

        System.out.print("Please enter b: ");
        int b = sc.nextInt();

        sc.close();

        System.out.println();

        for (int i=1; i<=b; i++) {

            prod *= a;
        }

        System.out.println(a + " to the power of " + b + " = " + prod);

        System.out.println();
    }
}
