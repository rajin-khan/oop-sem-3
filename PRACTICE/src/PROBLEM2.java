import java.util.*;

public class PROBLEM2 {

    public static void main(String[] args) throws IllegalStringLengthException{

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        sc.close();

        try {

            if (name.length()>26) {
                throw new IllegalStringLengthException("Your entered name cannot be greater than 26 characters.");
            }
            
        }
        catch (IllegalStringLengthException e) {

            e.printStackTrace();
        }
    }
    
}