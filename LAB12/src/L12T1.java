import java.util.*;

public class L12T1 {

    public static void main(String[] args) throws ArithmeticException{

        Scanner sc = new Scanner(System.in);
        
        int userInput;
        double sum = 0;

        System.out.println("\nThis program will output the sum of 10 positive integers.\n");

        for (int i=0; i<10; i++) {

            System.out.print("Enter your number:");
            userInput = sc.nextInt();

            try {

                if (userInput<0) {

                    throw new ArithmeticException("Input positive integer only.");
                }
                else {

                    sum += userInput;
                }
            }
            catch (ArithmeticException e) {

                e.printStackTrace();;
                i--;
            }
        }
        
        System.out.println("Sum of your positive integers are: " + sum);

        sc.close();
        
    }   
}
