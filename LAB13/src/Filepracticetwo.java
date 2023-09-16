import java.io.*;
import java.util.*;

public class Filepracticetwo {

    public static void main(String[] args) {
        
        try {

            File f1 = new File("GonnaRead.txt");

            Scanner sc = new Scanner(f1);

            if (sc.hasNextLine()) {

                String data = sc.nextLine();
                System.out.println(data);
            }

            sc.close();
        }
        
        catch (FileNotFoundException e ) {

            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    
}
