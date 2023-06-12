import java.util.*;

public class L3T2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String s1 = sc.next();
            
        System.out.print("Enter string 2: ");
        String s2 = sc.next();

        if (s1.startsWith(s2)) {

            System.out.println("The string \""+s1+"\" starts with \""+s2+"\"");
        }
        else if (s1.endsWith(s2)) {

            System.out.println("The string \""+s1+"\" ends with \""+s2+"\"");
        }
        else {

            System.out.println("The string \""+s1+"\" does not start or with \""+s2+"\"");
        }

        sc.close();

    }
    
}
