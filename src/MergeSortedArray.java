public class MergeSortedArray {
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.print("Output 1: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example 2
        int[] nums3 = {1};
        int m2 = 1;
        int[] nums4 = {};
        int n2 = 0;

        merge(nums3, m2, nums4, n2);
        System.out.print("Output 2: ");
        for (int num : nums3) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example 3
        int[] nums5 = {0};
        int m3 = 0;
        int[] nums6 = {1};
        int n3 = 1;

        merge(nums5, m3, nums6, n3);
        System.out.print("Output 3: ");
        for (int num : nums5) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
