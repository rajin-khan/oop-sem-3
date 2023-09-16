public class Matrix {

    private int rows;
    private int columns;

    int[][] matrix; //the matrix is declared here so it is visible to the other methods

    Matrix(int rows, int columns) { //the constructor for setting the number of rows and cols

        this.rows = rows;
        this.columns = columns;

        matrix = new int[rows][columns]; //creating the matrix whenever the constructor is called
    }

    //GETTERS AND SETTERS FOR THE ROWS AND COLUMNS OF THE MATRIX

    public int getRows() {

        return rows;
    }

    public int getColumns() {

        return columns;
    }

    public void setRows(int rows) {

        this.rows = rows;
    }

    public void setColumns(int columns) {

        this.columns = columns;
    }

    //GETTERS AND SETTERS FOR THE ELEMENTS OF THE MATRIX 

    public int getElement(int rowIndex, int colIndex) {

        return matrix[rowIndex][colIndex];
    }

    public void setElement(int rowIndex, int colIndex, int value) {

        matrix[rowIndex][colIndex] = value;
    }

    //GETTER FOR MATRIX OBJECT IN INTEGER ARRAY FORMAT

    public int[][] getMatrix() {

        return matrix;
    }

    //THE ADD METHOD

    public int[][] add(int[][] newMatrix, int newMatrixRows, int newMatrixCols) {

        int[][] addMatrix = new int[this.rows][this.columns];

        if (this.rows==newMatrixRows && this.columns==newMatrixCols) {

            for (int i=0; i<this.rows; i++) {

                for (int j=0; j<this.columns; j++) {

                    addMatrix[i][j] = this.getElement(i, j) + newMatrix[i][j];
                }
            }
        }
        else {

            System.out.println("\nMatrices cannot be added.\n");
        }

        return addMatrix;
    }

    //THE MULTIPLY METHOD

    public int[][] multiply(int[][] newMatrix, int newMatrixRows, int newMatrixCols) {

        int[][] multiplyMatrix = new int[this.rows][newMatrixCols];

        if (this.columns==newMatrixRows) {

            for (int i=0; i<this.rows; i++) {

                for (int j=0; j<newMatrixCols; j++) {

                    int sum=0;

                    for (int k=0; k<this.columns; k++) {

                        sum+= this.getElement(i, k)*newMatrix[k][j];
                    }

                    multiplyMatrix[i][j] = sum;
                }
            }
        }
        else {

            System.out.println("\nMatrices cannot be multiplied.\n");
        }

        return multiplyMatrix;
    }

}