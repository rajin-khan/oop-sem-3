import java.util.*;

public class L1T1 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("\nThis program will determine whether your entered number is odd or even.\n");
            
            System.out.print("Please enter your number: ");
            int number = sc.nextInt();

            int result = number % 2;

            switch(result) {

                case 0: System.out.println("\nThe number is even.\n");
                break;

                case 1: System.out.println("\nThe number is odd.\n");
                break;
            }
        }
    }
    
}
