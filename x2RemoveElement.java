public class x2RemoveElement {

    public int removeElement(int[] nums, int val) {
        // Initialize two pointers
        int left = 0; //Points to the current position to insert a non-val element
        int right = 0;

        // Iterate through the array
        while(right < nums.length){
            // If the current element is not equal to val
            if(nums[right] != val) {
                // Replace the value at the left pointer with the non-val element
                nums[left] = nums[right];
                // Move the left pointer to the next position 
                left++;
            }
            // Move the right pointer to the next position
            right++;
        }
        // The left pointer now represents the number of elements in the array
        // that are not equal to val, and ir can be used as the length of the modified array
        return left;

    }
    
}
