// Problem No:   905 
// Problem Name: Sort Array By Parity

class Solution {
    public int[] sortArrayByParity(int[] nums)
    {
        int i = 0; // Pointer at the start of the array
        int j = nums.length - 1; // Pointer at the end of the array

        while (i < j) 
        {
            // If the element at i is odd and the element at j is even, swap them
            if (nums[i] % 2 > nums[j] % 2) 
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            // Increment i if the element at i is even
            if (nums[i] % 2 == 0) i++;
            // Decrement j if the element at j is odd
            if (nums[j] % 2 == 1) j--;
        }    

        return nums; // Return the sorted array
    }
}
