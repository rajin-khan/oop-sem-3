import java.util.*;

public class A1T3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sum = 0;

        System.out.println("\nThis program will calculate the sum of the series 1/3 + 1/9 + 1/27 + ... 1/3ⁿ\n");
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        sc.close();

        System.out.println();

        for (int i=1; i<=n; i++) {

            if (i==n) {

                System.out.print("1/3^" + i + " = ");
                sum += (1/Math.pow(3, i));
            }
            else {

                System.out.print("1/3^" + i + " + ");
                sum += (1/Math.pow(3, i));
            }

        }

        System.out.println(sum);

        System.out.println("\n");
    }
    
}