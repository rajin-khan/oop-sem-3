import java.util.*;

public class L12T2 {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        
        Scanner sc = new Scanner(System.in);

        int index;

        int[] intArray = new int[100];

        for (int i=0; i<100; i++) {

            intArray[i] = (int)(Math.random() * 10000);
        }

        System.out.print("\nEnter the array index you would like to view: ");
        index = sc.nextInt();

        while (true) {

            try {

                if ((index>99)||(index<0)) {
    
                    throw new ArrayIndexOutOfBoundsException();
                }
                else {
    
                    System.out.println(intArray[index]);
                    break;
                }  
            }
            catch (ArrayIndexOutOfBoundsException e){
    
                System.out.println("\nYou must enter an index between 0 and 99.");
                e.printStackTrace();
                System.out.print("\nEnter the array index you would like to view: ");
                index = sc.nextInt();
            }

        }

        sc.close();

    }
    
}
