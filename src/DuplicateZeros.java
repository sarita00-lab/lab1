public class DuplicateZeros {
    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr1);
        System.out.print("Output 1: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example 2
        int[] arr2 = {1, 2, 3};
        duplicateZeros(arr2);
        System.out.print("Output 2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }

    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        // Count the number of zeros in the array
        for (int num : arr) {
            if (num == 0) {
                zeros++;
            }
        }

        int lastIndex = n + zeros - 1;

        // Loop from the end of the original array
        // and place the elements in the new position
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                if (lastIndex < n) {
                    arr[lastIndex] = 0;
                }
                lastIndex--;
            }
            if (lastIndex < n) {
                arr[lastIndex] = arr[i];
            }
            lastIndex--;
        }
    }
}