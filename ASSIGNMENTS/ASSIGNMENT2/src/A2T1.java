import java.util.*;

public class A2T1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //GETTING THE USER INPUT FOR THE MATRICES

        System.out.println("\nPlease enter the rows and columns of your first matrix.");

        System.out.print("Rows: ");
        int matARows = sc.nextInt();

        System.out.print("Columns: ");
        int matACols = sc.nextInt();

        Matrix matA = new Matrix(matARows, matACols);

        System.out.println("\nPlease enter the rows and columns of your second matrix.");

        System.out.print("Rows: ");
        int matBRows = sc.nextInt();

        System.out.print("Columns: ");
        int matBCols = sc.nextInt();

        Matrix matB = new Matrix(matBRows, matBCols);
        
        System.out.println("\nPlease enter the elements of your first matrix: ");

        for (int i=0; i<matARows; i++) {

            for (int j=0; j<matACols; j++) {

                System.out.print("Enter the element at index ["+ i + "], [" + j + "]: ");
                int value = sc.nextInt();
                matA.setElement(i, j, value);
            }
        }

        System.out.println("\nPlease enter the elements of your second matrix: ");

        for (int i=0; i<matBRows; i++) {

            for (int j=0; j<matBCols; j++) {

                System.out.print("Enter the element at index ["+ i + "], [" + j + "]: ");
                int value = sc.nextInt();
                matB.setElement(i, j, value);
            }
        }

        //SHOWING THE MATRICES TO THE USER FOR BETTER UNDERSTANDING

        System.out.println("\nYour matrix 1 is: ");

        for (int i=0; i<matARows; i++) {

            for (int j=0; j<matACols; j++) {

                System.out.print(matA.getElement(i, j) + "\t");
            }
            System.out.print("\n");
        }

        System.out.println("\nYour matrix 2 is: ");

        for (int i=0; i<matBRows; i++) {

            for (int j=0; j<matBCols; j++) {

                System.out.print(matB.getElement(i, j) + "\t");
            }
            System.out.print("\n");
        }

        sc.close();

        //ADDING THE MATRIX AND PRINTING IT

        int[][] additionMatrix = matA.add(matB.getMatrix(), matBRows, matBCols);

        System.out.println("\nTheir addition is: "); 

        for (int i=0; i<matARows; i++) {

            for (int j=0; j<matACols; j++) {

                System.out.print(additionMatrix[i][j] + "\t");
            }
            System.out.print("\n");
        }

        //MULTIPLYING THE MATRIX AND PRINTING IT

        System.out.println("\nTheir multiplication is: "); 

        int[][] multiplyMatrix = matA.multiply(matB.getMatrix(), matBRows, matBCols);

        for (int i=0; i<matARows; i++) {

            for (int j=0; j<matBCols; j++) {

                System.out.print(multiplyMatrix[i][j] + "\t");
            }
            System.out.print("\n");
        }

        System.out.println("\n");
    }

}
