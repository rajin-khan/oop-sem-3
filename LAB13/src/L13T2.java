import java.io.*;
import java.util.*;

public class L13T2 {

    public static void main(String[] args) {

        int count = 0;

        try {

            File f1 = new File("FirstQuiz.txt");

            Scanner sc = new Scanner(f1);

            while (sc.hasNextLine()) {

                sc.nextLine(); //moves the cursor to the next lines, one by one
                count++;
            }

            sc.close();

            Scanner sc2 = new Scanner(f1);

            Quiz[] q1 = new Quiz[count];

            for (int i=0; i<count; i++) {

                int id = sc2.nextInt();
                int mark = sc2.nextInt();
                
                q1[i] = new Quiz(id, mark);
            }

            for (int i=0; i<count; i++) {

                System.out.println("ID: " + q1[i].getId() + ", Mark: " + q1[i].getMark());
            }

            sc2.close();

            int max = 0;

            for (int i=0; i<count; i++) {

                if (q1[i].getMark()>max) {

                    max = q1[i].getMark();
                }
            }

            for (int i=0; i<count; i++) {

                if (q1[i].getMark()==max) {

                    System.out.println("Highest mark obtained by ID: " + q1[i].getId());
                }
            }

        }
        catch (IOException e) {

            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    
    }
    
}
