// Problem No: 1480
// Problem Name: Running Sum of 1d Array

class Solution {
    public int[] runningSum(int[] nums) 
    {
        int sum = 0;  // Initialize sum to store the running sum
        int result[] = new int[nums.length];  // Array to store the running sums

        // Loop through each element in nums
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];  // Add the current number to the running sum
            result[i] = sum;  // Store the running sum in the result array
        }  

        return result;  // Return the array with running sums
    }
}
