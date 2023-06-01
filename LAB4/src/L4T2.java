import java.util.*;

public class L4T2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] fib = new int[num];

        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 1;

        for (int i=0; i<num; i++) {

            if (i==0) {

                System.out.print(fib[i]+" ");
            }
            else if (i==1) {

                System.out.print(fib[i]+" ");
            }
            else if (i==2) {

                System.out.print(fib[i]+" ");
            }
            else {

                fib[i] = fib[i-1]+fib[i-2];
                System.out.print(fib[i]+" ");
            }
        }

        sc.close();
    }
    
}
