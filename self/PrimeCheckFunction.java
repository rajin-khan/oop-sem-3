import java.util.*;

public class PrimeCheckFunction {

    public static void checkPrime(int number) {

        boolean flag = true;

        for (int i=2; i<=number/2; i+=number) {

            if (number%i==0) {

                flag = false;
                break;
            }
        }

        if (flag==true) {

            System.out.println(number + " is a prime number.");
        }
        else {

            System.out.println(number + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nThis program will check whether your entered number is prime.");

        System.out.print("Please enter your number: ");
        int num = sc.nextInt();

        checkPrime(num);

        sc.close();
    }
    
}
