import java.util.*;

public class printing_Boundary_Elements {

    public static void printBoundary(int arr[][], int m, int n) {
        System.out.println("\nThe output matrix is: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0)
                    System.out.print(arr[i][j] + " ");
                else if (i == m - 1)
                    System.out.print(arr[i][j] + " ");
                else if (j == 0)
                    System.out.print(arr[i][j] + " ");
                else if (j == n - 1)
                    System.out.print(arr[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix dimension: ");

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];

        System.out.println("\nEnter elements in the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Position [" + i + "," + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nThe input matrix is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

        printBoundary(arr, 4, 4);
    }
}
