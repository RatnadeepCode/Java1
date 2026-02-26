import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a1, b1, a2, b2;

        // Input matrix sizes
        System.out.println("Enter rows and columns of Matrix 1:");
        a1 = in.nextInt();
        b1 = in.nextInt();

        System.out.println("Enter rows and columns of Matrix 2:");
        a2 = in.nextInt();
        b2 = in.nextInt();

        // Check if multiplication is possible
        if (b1 != a2) {
            System.out.println("Matrix multiplication not possible!");
            in.close();
            return;
        }

        // Declare matrices
        int arr1[][] = new int[a1][b1];
        int arr2[][] = new int[a2][b2];
        int result[][] = new int[a1][b2];

        // Input Matrix 1
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < b1; j++) {
                arr1[i][j] = in.nextInt();
            }
        }

        // Input Matrix 2
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < a2; i++) {
            for (int j = 0; j < b2; j++) {
                arr2[i][j] = in.nextInt();
            }
        }

        // Matrix Multiplication Logic
        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < b2; j++) {
                for (int k = 0; k < b1; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        // Print Result
        System.out.println("Result Matrix:");
        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < b2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
