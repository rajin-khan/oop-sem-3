import java.util.*;

public class L5T1 {

    static int countVowels(String input) {

        int count = 0;

        for (int i=0; i<input.length(); i++) {

            if (input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u') {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("This program will return the number of vowels in your string.");

        System.out.print("Enter your string: ");
        String st = sc.next();

        System.out.println("The number of vowels in your string is = "+countVowels(st.toLowerCase()));

        sc.close();
    }
    
}
