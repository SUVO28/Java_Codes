import java.util.*;

public class rowMax_rowMin_colMax_colMin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter matrix dimension: ");
        System.out.print("Enter rows: ");
        int row = sc.nextInt();
        System.out.print("Enter columns: ");
        int col = sc.nextInt();

        int a[][] = new int[row][col];

        System.out.println("\nEnter the elements in the array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Position [" + i + "," + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nInput matrix is: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nRow maximum element of the matrix is: ");
        for (int i = 0; i < a.length; i++) {
            int max = a[i][0];
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            System.out.print(max + " ");
        }

        System.out.println("\n\nRow minimum element of the matrix is: ");
        for (int i = 0; i < a.length; i++) {
            int min = a[i][0];
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
            System.out.print(min + " ");
        }

        System.out.println("\n\nColumn maximum element of the matrix is: ");
        for (int j = 0; j < a.length; j++) {
            int max1 = a[0][j];
            for (int i = 0; i < a.length; i++) {
                if (a[i][j] > max1) {
                    max1 = a[i][j];
                }
            }
            System.out.print(max1 + " ");
        }

        System.out.println("\n\nColumn minimum element of the matrix is: ");
        for (int j = 0; j < a.length; j++) {
            int min1 = a[0][j];
            for (int i = 0; i < a.length; i++) {
                if (a[i][j] < min1) {
                    min1 = a[i][j];
                }
            }
            System.out.print(min1 + " ");
        }
        sc.close();
    }
}
