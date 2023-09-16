import java.util.*;

public class EvenFunction {

    public static void checkEven(int number) {

        if (number%2==0) {

            System.out.println(number + " is even.\n");
        }
        else {

            System.out.println(number + " is odd.\n");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nThis program will check whether or not your number is even.");

        System.out.print("Please enter your number (an integer): ");
        int num = sc.nextInt();

        checkEven(num);

        sc.close();
    }
    
}
