package ARRAY;

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start from the end of both arrays
        int i = m - 1;  // Last element in nums1 (considering only valid elements)
        int j = n - 1;  // Last element in nums2
        int k = m + n-21;  // Last position in nums1 where the merged element should go

        // Merge nums1 and nums2 from the back
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2, copy them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        // Example input
        int[] nums1 = {1, 2, 3, 0, 0, 0};  // nums1 has enough space to hold nums2 elements
        int m = 3;  // Number of valid elements in nums1
        int[] nums2 = {2, 5, 6};
        int n = 3;  // Number of elements in nums2

        // Merge nums2 into nums1
        merge(nums1, m, nums2, n);

        // Print the merged array
        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
