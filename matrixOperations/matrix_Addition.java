import java.util.*;

public class matrix_Addition {
    public static void main(String args[]) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix dimension: ");
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int columns = sc.nextInt();
        int arr1[][] = new int[rows][columns];
        int arr2[][] = new int[rows][columns];
        int resultant[][] = new int[rows][columns];

        System.out.println("Enter elements for Matrix 1: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print("Position [" + i + "," + j + "]");
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter elements for Matrix 2: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print("Position [" + i + "," + j + "]");
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
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                resultant[i][j] = arr1[i][j] + arr2[i][j];
            }
            System.out.println();
        }

        System.out.println("The sum of Matrix 1 and Matrix 2 is: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print(resultant[i][j] + " ");
            }
            System.out.println();
        }
    }
}
