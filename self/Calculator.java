import java.util.*;

public class Calculator {

    public static void main (String args[]) {

        double result;
        byte flag = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nThis program will take two numbers from you and perform operations as told.\n");

            System.out.print("Please enter the first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Please enter the second number: ");
            double num2 = sc.nextDouble();

            System.out.println("\nWhat would you like to do with these numbers?\n");

            while (true) {

                System.out.print("Enter 1 for addition (+),\n      2 for subtraction (-),\n      3 for multiplication (*),\n      4 for division (/),\n      5 for remainder (% or modulus)\n\n:");
                byte operator = sc.nextByte();

                System.out.println("\n");

                switch (operator) {

                    case 1 : result = num1 + num2;
                        System.out.println(num1 + " + " + num2 + " = " + result);
                        flag = 1;
                    break;

                    case 2 : result = num1 - num2;
                        System.out.println(num1 + " - " + num2 + " = " + result);
                        flag = 1;
                    break;

                    case 3: result = num1 * num2;
                        System.out.println(num1 + " * " + num2 + " = " + result);
                        flag = 1;
                    break;

                    case 4: result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                        flag = 1;
                    break;

                    case 5: result = num1 % num2;
                        System.out.println(num1 + " % " + num2 + " = " + result);
                        flag = 1;
                    break;

                    default: System.out.println("Please enter a valid number for an operation.");

                }
                if (flag==1) {
                    break;
                }
                else {
                    continue;
                }

            }
        }

        System.out.println("\n");
    
    }
}

