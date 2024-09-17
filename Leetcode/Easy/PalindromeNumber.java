// Problem: LeetCode 9 - Palindrome Number
// This function checks if a given integer 'x' is a palindrome.

class Solution {
    public boolean isPalindrome(int x) 
    {
        int sum = 0;      // Variable to store the reversed number
        int val = x;      // Store the original value of 'x' for comparison
        
        // Reverse the number
        while(x > 0) 
        {
            int rem = x % 10;     // Get the last digit
            sum = sum * 10 + rem; // Build the reversed number
            x = x / 10;           // Remove the last digit from 'x'
        }
        
        // If the reversed number is equal to the original, it's a palindrome
        if(sum == val) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
}

