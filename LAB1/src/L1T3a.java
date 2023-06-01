import java.util.*;

public class L1T3a {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nThis program will assess your health based on your BMI.\n");

            System.out.print("\nEnter your BMI: ");
            float bmi = sc.nextFloat();

            if (bmi<=39.9 && bmi>=30) {

                System.out.println("\nObese\n");
            }
            else if (bmi<=29.9 && bmi>=25) {

                System.out.println("\nOverweight\n");
            }
            else if (bmi<=24.9 && bmi>=18.5) {

                System.out.println("\nHealthy\n");
            }
            else if (bmi<18.5) {

                System.out.println("\nUnderweight\n");
            }
            else {

                System.out.println("\nInvalid BMI. Please enter again.\n");
            }
        }
    }
    
}
