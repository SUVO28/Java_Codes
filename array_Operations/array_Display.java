import java.util.*;

public class array_Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("\nEnter the elements for the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Index [" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("\nThe input array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
