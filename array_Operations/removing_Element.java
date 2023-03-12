import java.util.*;

class removing_Element {
    // Function to remove the element
    public static int[] remove(int arr[], int index) {
        // If the array is empty or the index is not in array range then return the
        // original array
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }
        // Create another array of size one less
        int anotherArray[] = new int[arr.length - 1];
        // Copy the elements except the index the from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {
            // if the index is the removal element index
            if (i == index) {
                continue;
            }
            // if the index is not the removal element index
            anotherArray[k++] = arr[i];
        }
        // return the resultant array
        return anotherArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        // int[] a = { 1, 2, 3, 4, 5 };
        int[] a = new int[n];
        System.out.println("\nEnter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("\nOriginal array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        // System.out.println("Original Array: " + Arrays.toString(a));
        System.out.println();
        int index = 2;
        System.out.print("\nIndex to be removed: " + index);

        // Remove the element
        a = remove(a, index);
        // Print the resultant array
        System.out.println("\nResultant Array after deleting: " + Arrays.toString(a));
    }
}
