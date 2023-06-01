import java.util.*;

public class L4T3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double[][] a = new double[3][3];
        double[] rowsum = new double[3];
        double[] colsum = new double[3];
        double rightdgsum = 0, leftdgsum = 0; 

        for (int i=0; i<3; i++) {

            for (int j=0; j<3; j++) {

                System.out.print("Enter your value ( in index ["+i+"] ["+j+"] ): ");
                a[i][j] = sc.nextDouble();
            }
        }

        for (int i=0; i<3; i++) {

            double temp = 0;
            
            for (int j=0; j<3; j++) {

                temp+=a[i][j];
            }
            rowsum[i] = temp;
        }

        for (int i=0; i<3; i++) {

            double temp = 0;

            for (int j=0; j<3; j++) {

                temp+=a[j][i];
            }
            colsum[i] = temp;
        }

        for (int i=0; i<3; i++) {

            for (int j=0; j<3; j++) {

                if (i==j) {

                    leftdgsum += a[i][j];
                }
            }
        }

        for (int i=0; i<3; i++) {

            for (int j=0; j<3; j++) {

                if (i+j==2) {

                    rightdgsum += a[i][j];
                }
            }
        }

        System.out.println();

        for (int i=0; i<3; i++) {

            System.out.println("The sum of column "+(i+1)+" is =  "+colsum[i]);
        }
        
        System.out.println();

        for (int i=0; i<3; i++) {

            System.out.println("The sum of row "+(i+1)+" is =  "+rowsum[i]);
        }

        System.out.println();

        System.out.println("The sum of the left diagonal is = "+leftdgsum);
        System.out.println("The sum of the right diagonal is = "+rightdgsum);

        System.out.println();

        sc.close();
    }
}
