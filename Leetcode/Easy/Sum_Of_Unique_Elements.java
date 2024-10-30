// Problem No: 1748
// Problem Name: Sum of Unique Elements

class Solution {
    public int sumOfUnique(int[] nums) 
    {
        int freq[] = new int[101];  // Array to store frequencies of numbers (1 to 100)
        int sum = 0;                // Initialize sum for unique elements

        // Loop to count occurrences of each number in nums
        for (int num : nums) {
            freq[num]++;
        }

        // Traverse the frequency array to find numbers appearing exactly once
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {     // Check if the number is unique
                sum += i;           // Add unique number to the sum
            }
        }

        return sum;  // Return the sum of unique elements
    }
}
