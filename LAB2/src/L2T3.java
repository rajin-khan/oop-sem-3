import java.util.*;

public class L2T3 {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("This program will take your integer and print its divisors.");

            System.out.print("Please enter your number: ");
            int num = sc.nextInt();

            System.out.println();

            System.out.print("The divisors of "+num+" are: ");

            for (int i=1; i<=num/2; i++) {

                if (num%i==0) {

                    System.out.print(i + " ");
                }
            }
        }
    }
    
}
