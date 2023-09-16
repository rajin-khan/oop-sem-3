import java.io.*;
import java.util.*;

public class Filepracticethree {

    public static void main(String[] args){
        
        try {

            File f1 = new File("Writetothis.txt");

            if (f1.createNewFile()) {

                System.out.println(f1.getName() + ".txt has been created successfully.");
            }
            else {

                System.out.println("The file already exists.");
            }

            FileWriter w1 = new FileWriter("Writetothis.txt");

            w1.write("Michael Bob 20 Science");
            w1.close();

            Scanner sc = new Scanner(f1);

            //reading stuff separately, not line by line, from a file
            while (sc.hasNext()) {

                String firstName = sc.next();
                String lastName = sc.next();
                int age = sc.nextInt();
                String subject = sc.next();
                
                System.out.println("Name: " + firstName + " " + lastName + ", Age: " + age + ", Subject: " + subject);
            }

            sc.close();
        }
        catch (IOException e) {

            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
