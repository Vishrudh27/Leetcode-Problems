// Problem No: 1929
// Problem Name: Concatenation of Array

class Solution {
    public int[] getConcatenation(int[] nums) 
    {
        int res[] = new int[2 * nums.length];  // Initialize array with double the length of nums

        // Copy original array to the first half of res
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }

        // Copy original array again to the second half of res
        int index = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res[index++] = nums[i];
        }

        return res;  // Return the concatenated array
    }
}
