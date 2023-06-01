import java.util.*;

public class L5T2 {

    static boolean isPalindrome(String input) {

        String rev = "";

        for (int i=input.length()-1; i>=0; i--) {

            rev += input.charAt(i);
        }

        if (input.equalsIgnoreCase(rev)) {

            return true;
        }
        else {

            return false;
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("This program will return whether or not your string is a palindrome.");

        System.out.print("Enter your string: ");
        String st = sc.next();

        if (isPalindrome(st)==true) {

            System.out.println("Your string is a palindrome.");
        }
        else {

            System.out.println("Your string is not a palindrome.");
        }

        sc.close();
    }
    
}
