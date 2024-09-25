// Problem number: 283
// Problem name: Move Zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0; // Initialize index to track the position to place non-zero elements
        
        // First pass: Move non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) { // Check if the current element is non-zero
                nums[index] = nums[i]; // Place non-zero element at 'index'
                index++; // Increment the index for the next non-zero element
            }
        }
        
        // Second pass: Fill the rest of the array with zeroes
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0; // Set remaining positions to zero
        }
    }
}
