import java.io.*;
import java.util.*;

public class PROBLEM3 {

    public static void main(String[] args) {

        Student[] fromfile = new Student[4];
        Student[] tofile = new Student[4];

        try {

            File f1 = new File("prac.txt");

            Scanner sc = new Scanner(f1);

            for (int i=0; i<4; i++) {

                int id = sc.nextInt();
                String name = sc.next();
                int age = sc.nextInt();

                fromfile[i] = new Student(id, name, age);

                System.out.println(fromfile[i].getId() + " " + fromfile[i].getName() + " " + fromfile[i].getAge());
            }

            sc.close();

            FileWriter w1 = new FileWriter(f1, true);

            tofile[0] = new Student(24512, "ditcher", 19);
            tofile[1] = new Student(22345, "lloid", 29);
            tofile[2] = new Student(21356, "yor", 27);
            tofile[3] = new Student(25678, "anya", 5);


            for (int i=0; i<4; i++) {

                for (int j=0; j<4; j++) {

                    if (fromfile[i].getId()==tofile[j].getId()) {

                        tofile[j].setName("Duplicate");
                    }
                    else {

                        continue;
                    }
                }
            }

            for (int i=0; i<4; i++) {

                if (tofile[i].getName()!="Duplicate") {

                    w1.write(tofile[i].getId() + " " + tofile[i].getName() + " " + tofile[i].getAge() + "\n");
                }
                else {

                    continue;
                }
            }

            w1.close();
        }
        catch (IOException  e) {

            System.out.println("An error occurred");
            e.printStackTrace();
        }

    }
    
}
