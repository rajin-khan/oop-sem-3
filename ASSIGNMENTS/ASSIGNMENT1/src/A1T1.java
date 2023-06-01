import java.util.*;

public class A1T1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nThis program will print all the odd numbers within two numbers (integers) you enter.");

        System.out.print("\nPlease enter the first number: ");
        int firstnum = sc.nextInt();

        System.out.print("Enter the second number: ");
        int secondnum = sc.nextInt();

        sc.close();

        int max = Math.max(firstnum, secondnum);
        int min  = Math.min(firstnum, secondnum);

        System.out.println("\nAll the odd numbers between " + min + " and " + max + " are: ");

        for (int i=min; i<=max; i++) {

            if (i%2!=0) {

                System.out.print(i + " ");
            }
        }

        System.out.println("\n");
    }
    
}
