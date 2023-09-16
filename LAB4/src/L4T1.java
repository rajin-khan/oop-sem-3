import java.util.*;

public class L4T1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double[] a = new double[6];
        double sum = 0, avg = 0, percentage = 0;
        int count = 0;
    
        System.out.println();

        for (int i=0; i<6; i++) {

            System.out.print("Enter your value (in index "+i+"): ");
            a[i] = sc.nextDouble();
            sum += a[i];
        }

        avg = sum/6;

        for (int i=0; i<6; i++) {

            if (a[i]>avg) {

                count++;
            }
        }

        percentage = (count*100)/6;

        System.out.println("\nThe percentage of numbers above the average is: "+percentage+"%\n");

        sc.close();
    }
    
}
