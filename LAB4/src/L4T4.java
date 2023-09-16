import java.util.*;

public class L4T4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int num = sc.nextInt();

        int[] a = new int[num];

        for (int i=0; i<num; i++) {

            System.out.print("Enter your value (in index "+i+"): ");
            a[i] = sc.nextInt();
        }

        System.out.println();

        for (int i=0; i<num; i++) {
            
            if ((a[i]==a[i+1])&&(a[i]==a[i+2])) {

                System.out.print(a[i]+" ");
            }
        }

        sc.close();
    }
    
}
