import java.util.*;

public class L2T4 {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
        }

        System.out.println();

        int max = 150;
        int min = 100;
        int counter = max;

        while (counter>=min) {

            if (counter%8==0) {

                System.out.print(counter+" ");
            }

            counter--;
        }

        
    

        System.out.println("\n");
    }
    
}
