import java.util.*;

public class L2T1 {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("\nPlease enter the value of n: ");
            int n = sc.nextInt();

            sc.nextLine();

            System.out.print("Please enter your name: ");
            String name = sc.nextLine();

            System.out.println();

            for (int i=0; i<n; i++) {

                System.out.println(name);
            }
        }

        System.out.println();

    }
    
}
