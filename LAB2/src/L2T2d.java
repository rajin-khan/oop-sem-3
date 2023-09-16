import java.util.*;

public class L2T2d {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        for (int i=5; i>0; i--) {

            for (int j=1; j<=5-i; j++) {

                System.out.print(" ");
            }

            for (int k=((2*i)-1); k>=1; k--) {

                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
