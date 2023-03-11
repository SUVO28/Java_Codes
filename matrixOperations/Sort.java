import java.util.*;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        // int arr[] = { 9, 7, 6, 0, 4, 1, 5, 3, 2, 8, 10 };
        int arr[] = new int[n];
        int i, j, temp;

        System.out.println("\nEnter the elements in the array: ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nInput array is:");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        for (i = 0; i < arr.length / 2; i++) {
            for (j = i + 1; j < arr.length / 2; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (i = arr.length / 2; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("\nOutput array is:");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
