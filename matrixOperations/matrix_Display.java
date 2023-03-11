import java.util.*;

public class matrix_Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        System.out.println("\nEnter elements for the array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Position [" + i + "," + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("\nThe original array is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}