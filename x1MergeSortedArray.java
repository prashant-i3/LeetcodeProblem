import java.util.Arrays;

public class x1MergeSortedArray {

    /**
     * Merges two sorted arrays into the first array.
     *
     * @param nums1 The first sorted array (length = m + n).
     * @param m     The number of elements in the first array.
     * @param nums2 The second sorted array (length = n).
     * @param n     The number of elements in the second array.
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointers for the two arrays and the position to merge elements
        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;

        // Iterate through the arrays from the end to the beginning
        while (p2 >= 0) {
            // Compare elements from both arrays and merge them into the first array
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[pMerge--] = nums1[p1--];
            } else {
                nums1[pMerge--] = nums2[p2--];
            }
        }
    }

    /**
     * Main method to demonstrate the usage of the merge method.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create an instance of the x1MergeSortedArray class
        x1MergeSortedArray merger = new x1MergeSortedArray();

        // Example arrays
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;

        // Merge arrays using the merge method
        merger.merge(nums1, m, nums2, n);

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }
}
