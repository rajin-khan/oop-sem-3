import java.util.*;

public class L2T2a {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
        }

        for (int i=0; i<5; i++) {

            for (int k=0; k<i; k++) {

                System.out.print(" ");
            }

            for (int j=5; j>0; j--) {

                if (j-i<=0) {

                    continue;
                }

                System.out.print(j-i);
            }
            System.out.println();
        }
    }
    
}
