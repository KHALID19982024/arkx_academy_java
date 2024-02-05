package Day9DataStructure;

public class MatrixOperation {
    //Print the matrix.
    //Transpose the matrix (swap rows with columns) and print the result.
    public static void main(String[] args) {

        //Create a Java program that performs operations on a 2D matrix:
        //Initialize a 2D matrix with values.
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("print matrix:");
        MatrixPrint(matrix);
        String []topics={"Opinion", "Tech", "Science","Health"};

        //Find and print the sum of all elements in the matrix.
        System.out.println("Sum of all elements: " + MatrixSum(matrix));

        //Transpose the matrix (swap rows with columns) and print the result.
        int[][] transposedMatrix = MatrixTranspose(matrix);
        System.out.println("Transposed matrix:");
        MatrixPrint(transposedMatrix);
    }

    static void MatrixPrint(int[][] matrix) {
        for (int[] items : matrix) {
            for (int item : items) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    static int MatrixSum(int[][] matrix) {
        int sum = 0;
        for (int[] items : matrix) {
            for (int item : items) {
                sum += item;
            }
        }
        return sum;
    }

    static int[][] MatrixTranspose(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
}

