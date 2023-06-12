import java.util.*;

public class L3T4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String s1 = sc.next();
        System.out.print("Enter string 2: ");
        String s2 = sc.next();

        if (s1.equals(s2)||s2.equals(s1)) {

            System.out.println("The strings are exactly equal, \""+s1+"\" = \""+s2+"\"");
        }
        else if (s1.equalsIgnoreCase(s2)||s2.equalsIgnoreCase(s1)) {

            System.out.println("The strings are exactly equal, if cases are ignored, \""+s1+"\" = \""+s2+"\"");
        }
        else if (s1.startsWith(s2)||s2.startsWith(s1)) {

            System.out.println("The string \""+s1+"\" starts with \""+s2+"\"");
        }
        else if (s1.endsWith(s2)||s2.endsWith(s1)) {

            System.out.println("The string \""+s1+"\" ends with \""+s2+"\"");
        }        
        else if (s1.contains(s2)) {

            System.out.println("\""+s2+"\" is a substring of \""+s1+"\"");
        }
        else if (s2.contains(s1)) {

            System.out.println("\""+s1+"\" is a substring of \""+s2+"\"");
        }
        else {

            System.out.println("The strings don't match in any way.");
        }

        sc.close();
    }

}
