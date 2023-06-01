import java.util.*;

public class A1T4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nThis program will print whether your entered character is a vowel.\n");

        while (true) {

            System.out.print("Enter a character: ");
            char c = sc.next().charAt(0);

            if (c=='a' || c=='e'|| c=='i' || c=='o' || c=='u') {

                System.out.println("It's a vowel");
            }
            else if (c=='b' || c=='z') {

                System.out.println("Critical error\n");
                break;
            }
            else {

                continue;
            }

        }

        sc.close();
    }
    
}
