import java.util.*;

public class L5T3 {

    static double balance = 0;

    static double deposit(double balance, double amount) {

        balance += amount;
        return balance;
    }

    static double withdraw(double balance, double amount) {

        if (amount>balance) {

            System.out.println("Your withdrawal amount exceeds your balance!");
            return balance;
        }
        else {

            balance -= amount;
        }

        return balance;
    }

    static void currentBalance(double balance) {

        System.out.print("Your current balance is = $"+balance);
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nOptions:\n");
            System.out.println("~ Deposit");
            System.out.println("~ Withdraw");
            System.out.println("~ Balance");
            System.out.println("~ Exit\n");

            System.out.print("Enter your option: ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("Deposit")) {

                System.out.print("Enter your deposit amount: $");
                double amount = sc.nextDouble();

                balance = deposit(balance, amount);
            }
            else if (choice.equalsIgnoreCase("Withdraw")) {

                System.out.print("Enter your withdrawal amount: $");
                double amount = sc.nextDouble();

                balance = withdraw(balance, amount);
            }
            else if (choice.equalsIgnoreCase("Balance")) {

                currentBalance(balance);
            }
            else if (choice.equalsIgnoreCase("Exit")) {

                break;
            }
        }
        
        sc.close();
    }
    
}
