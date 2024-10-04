// Problem number: 189
// Problem name: Rotate Array

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;  // Get the length of the array
        k %= n;  // Get the effective rotation steps (in case k is larger than n)
        
        // Reverse the entire array
        reverse(nums, 0, n - 1);  
        
        // Reverse the first part of the array (0 to k-1)
        reverse(nums, 0, k - 1);  
        
        // Reverse the remaining part of the array (k to n-1)
        reverse(nums, k, n - 1);  
    }

    // Helper function to reverse a portion of the array
    public static void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];  // Swap the elements
            nums[start] = nums[end];
            nums[end] = temp;
            start++;  // Move start pointer forward
            end--;  // Move end pointer backward
        }
    }
}
