import java.util.*;

public class matrix_Multiplication {
    public static void main(String args[]) {
        int i, j;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Matrix 1 dimension: ");
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int columns = sc.nextInt();
        int arr1[][] = new int[rows][columns];

        System.out.println("\nEnter Matrix 2 dimension: ");
        System.out.print("Enter rows: ");
        int m = sc.nextInt();
        System.out.print("Enter columns: ");
        int n = sc.nextInt();
        int arr2[][] = new int[m][n];
        
        int resultant[][] = new int[rows][n];

        System.out.println("\nEnter elements for Matrix 1: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print("Position [" + i + "," + j + "]: ");
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter elements for Matrix 2: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("Position [" + i + "," + j + "]: ");
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix 1: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix 2: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        for (i = 0; i < rows; i++) {
            for (j = 0; j < n; j++) {
                for (int k = 0; k < columns; k++) {
                    resultant[i][j] = resultant[i][j] + (arr1[i][k] * arr2[k][j]);
                }
            }
            System.out.println();
        }

        System.out.println("The product of Matrix 1 and Matrix 2 is: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(resultant[i][j] + " ");
            }
            System.out.println();
        }
    }
}
