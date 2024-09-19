// Problem number: 153
// This function finds the minimum value in a given array.
// It initializes the min variable to the maximum integer value 
// and iterates through the array, updating min whenever a smaller value is encountered.
// Finally, it returns the smallest value found in the array.

class Solution {
    public int findMin(int[] nums) 
    {
        int min = Integer.MAX_VALUE;  // Initialize min to the highest possible integer value
        for (int i = 0; i < nums.length; i++)  // Loop through the array
        {
            if (nums[i] < min)  // Update min if the current element is smaller
            {
                min = nums[i];
            }
        }
        return min;  // Return the smallest value found
    }
}
