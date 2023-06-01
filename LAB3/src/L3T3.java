import java.util.*;

public class L3T3 {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter string : ");
            String s = sc.next();

            int counter =0;

            for (int i=s.length()-1; i>=0; i--) {

                if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {

                    counter++;

                    if (counter==2) {

                        System.out.println(s.charAt(i));
                    }
                }
            }
        }
    }
}
