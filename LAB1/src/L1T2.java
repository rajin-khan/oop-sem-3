import java.util.*;

public class L1T2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        byte flag = 0;

        System.out.println("\nThis program will determine whether your entered number is prime.\n");

        System.out.print("Please enter your number: ");
        int num = sc.nextInt();

        for (int i=2; i<=num/2; i++) {

            if (num%i==0) {

                System.out.println("\nIt is not a prime number.\n");
                flag = 1;
                break;
            }
        }

        if (flag==0) {

            System.out.println("\nYour number is a prime number.\n");
        }

        sc.close();
        
    }
    
}
