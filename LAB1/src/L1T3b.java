import java.util.*;

public class L1T3b {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
        System.out.println("\nThis program will assess your health based on your BMI.\n");

        System.out.print("\nEnter your BMI: ");
        float bmi = sc.nextFloat();

        String result = bmi>=18.5? "Healthy" : "Underweight";

        result = bmi>=25? "Overweight" : result;

        result = bmi>=30? "Obese" : result;
            
        result = bmi>40? "Invalid" : result;

        System.out.println("\n" + result + "\n");
        
        sc.close();
    }
    
}
