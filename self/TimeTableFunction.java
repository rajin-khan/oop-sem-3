import java.util.*;

public class TimeTableFunction {

    public static void timesTable(int number) {

        for (int i=1; i<=12; i++) {

            System.out.println(number + " * " + i + " = " + (number*i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter a number to display its times table: ");
        int num = sc.nextInt();

        timesTable(num);

        sc.close();
    }
    
}
