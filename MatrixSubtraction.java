import java.util.Scanner;

public class MatrixSubtraction {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int rows, cols;

        // Input size
        System.out.println("Enter number of rows:");
        rows = in.nextInt();

        System.out.println("Enter number of columns:");
        cols = in.nextInt();

        int[][] arr1 = new int[rows][cols];
        int[][] arr2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        // Input Matrix 1
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j] = in.nextInt();
            }
        }

        // Input Matrix 2
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2[i][j] = in.nextInt();
            }
        }

        // Subtraction Logic
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = arr1[i][j] - arr2[i][j];
            }
        }

        // Display Result
        System.out.println("Result Matrix (Subtraction):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
