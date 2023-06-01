import java.util.*;

public class PROBLEM1 {

    public static void main(String[] args) throws IllegalAgeException{

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        sc.close();

        try {

            if (age<18 || age>120) {

                throw new IllegalAgeException("Age must be between 18-120.");
            }
            else {

                System.out.println("Your age is acceptable.");
            }
        }
        catch (IllegalAgeException e) {

            e.printStackTrace();
        }

    }
    
}
