// Problem number: 191
// This function calculates the Hamming weight (number of '1' bits) of a given integer.
// It shifts the input number to the right in each iteration and checks if the least significant bit is 1.
// For each '1' found, the count is incremented, and the process repeats until the number becomes 0.

class Solution {
    public int hammingWeight(int n) 
    {
        int count = 0;  // Initialize a count to keep track of '1' bits
        while (n > 0)  // Loop until n becomes 0
        {
            if ((n & 1) == 1)  // Check if the least significant bit is 1
            {
                count++;  // Increment the count if the bit is 1
            }
            n = n >> 1;  // Shift the number to the right by 1 bit
        }
        return count;  // Return the total count of '1' bits
    }
}
