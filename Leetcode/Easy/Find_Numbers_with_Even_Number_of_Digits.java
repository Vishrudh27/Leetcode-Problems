// Problem No: 1295
// Problem Name: Find Numbers with Even Number of Digits

class Solution {
    public int findNumbers(int[] nums) 
    {
        int count = 0;  // Initialize a counter for numbers with even digits

        // Loop through each number in the array nums
        for (int num : nums) {
            // Convert the number to a string, get its length, and check if it's even
            if (String.valueOf(num).length() % 2 == 0) {
                count++;  // Increment count if the number of digits is even
            }
        }    

        return count;  // Return the final count of numbers with even digits
    }
}
