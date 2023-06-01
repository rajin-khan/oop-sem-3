import java.io.*;

public class Filepractice {

    public static void main(String[] args) {


        try {

            //creating the file
            File f1 = new File("Inforthemation.txt");

            if (f1.createNewFile()) {

                System.out.println("File " + f1.getName() + ".txt has been created successfully.");
            }
            else {

                System.out.println("The file already exists.");
            }

            //writing to the file
            FileWriter w1 = new FileWriter("Inforthemation.txt", true);

            w1.write("Woah, I like, wrote, again again.");
            w1.close(); // close the writer in the try block

            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e){ //same catch for both writing and creating file

            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    
}
