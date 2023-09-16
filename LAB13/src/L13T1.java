import java.io.*;
import java.util.*;

public class L13T1 {

    public static void main(String[] args) {
        
        double sum = 0;
        int count = 0;

        System.out.println();

        try {

            File f1 = new File("Sumavg.txt");

            if (f1.createNewFile()) {

                System.out.println(f1.getName() + " created successfully");
            }
            else {

                System.out.println("File already exists.");
            }

            FileWriter w1 = new FileWriter("Sumavg.txt", false);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your integers and hit return. Enter a negative number to stop input and calculate results.\n");

            while (true) {

                int num = sc.nextInt();

                if (num<0) {

                    break;
                }
                else {

                    w1.write(num + " ");
                }
            }

            sc.close();
            w1.close();

            Scanner sc2 = new Scanner(f1);

            while (sc2.hasNext()) {

                sum += sc2.nextInt();
                count++;
            }

            sc2.close();
        }
        catch (IOException e) {

            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

        System.out.println("\nThe sum is = " + sum + ", and the average is = " + sum/count);
        System.out.println();
    }
    
}
