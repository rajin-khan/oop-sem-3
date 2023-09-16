import java.util.*;

public class Customer {

    private int id;
    private String name;
    private String address;
    private int phone;
    private int acctno;
    private double currentbalance;

    Customer(int id, String name, String address, int phone, int acctno, double currentbalance) {

        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.acctno = acctno;
        this.currentbalance = currentbalance;
    }

    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public String getAddress() {

        return address;
    }

    public int getPhone() {

        return phone;
    }

    public int getAcctno() {

        return acctno;
    }

    public double getCurrentbalance() {

        return currentbalance;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public void setPhone(int phone) {

        this.phone = phone;
    }

    public void setAcctno(int acctno) {

        this.acctno = acctno;
    }

    public void setCurrentbalance(double currentbalance) {

        this.currentbalance = currentbalance;
    }

    public void DepositMoney(double balance) {

        setCurrentbalance(getCurrentbalance() + balance);
    }

    public void WithdrawMoney(double balance) {

        if (balance>getCurrentbalance()) {

            System.out.println("You don't have enough money to complete this transaction.");
            System.out.println("Your current balance is: $" + getCurrentbalance() + ", please enter an amount equal to or lower than that.\n");
        }
        else {

            System.out.println("Withdrawal successful!\n");
            setCurrentbalance(getCurrentbalance() - balance);
        }   

    }

    public void ApplyForLoan() {

        if (getCurrentbalance()>200000) {

            System.out.println("Your application has been successful.");
        }
        else {

            System.out.println("Your application has been declined.");
        }
    }

    public void RequestCard() {

        if (getCurrentbalance()>200000) {

            System.out.println("Your request has been successful.");
        }
        else {

            System.out.println("Your request has been declined.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Customer c1 = new Customer(420, "Son Goku", "Japan", 245682345, 69, 150000);

        System.out.println("\nPlease choose an option from the following.");

        while (true) {

            System.out.println();

            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Apply for Loan");
            System.out.println("4. Apply for a Card");
            System.out.println("5. Exit");

            System.out.print("\nEnter a number: ");

            int choice = sc.nextInt();

            if (choice==1) {

                System.out.println("\nYour current balance is: " + c1.getCurrentbalance());

                System.out.print("Enter the amount you want to deposit: ");
                double balance = sc.nextDouble();

                c1.DepositMoney(balance);

                System.out.println("\nDeposit successful!\nYour new balance is: " + c1.getCurrentbalance());

                System.out.println();
            }
            else if (choice==2) {

                System.out.println("\nYour current balance is: " + c1.getCurrentbalance());

                System.out.print("Enter the amount you want to withdraw: ");
                double balance = sc.nextDouble();

                c1.WithdrawMoney(balance);

                System.out.println("Your balance is: " + c1.getCurrentbalance());

                System.out.println();
            }
            else if (choice==3) {

                System.out.println();
                c1.ApplyForLoan();
            }
            else if (choice==4) {

                System.out.println();
                c1.RequestCard();
            }
            else if (choice==5) {

                break;
            }
            else {

                System.out.println("Please enter e number corresponding to the following options: ");
            }
        }

        sc.close();
    }

}