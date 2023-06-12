import java.util.*;

public class L1T4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
        System.out.println("\nThis program will tell whether or not your entered year is a leap year.\n");

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if ( (year%400==0) || ( (year%4==0) && (year%100!=0) ) ) {

            System.out.println(year+" is a leap year.\n");
        }
        else {

            System.out.println(year+" is not a leap year.\n");
        }

        sc.close();
    }
}