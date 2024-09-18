// Problem number: 7 (Reverse Integer)
// This function reverses the digits of a given integer `x`.
// It checks for overflow by ensuring the reversed number doesn't exceed Integer.MAX_VALUE or fall below Integer.MIN_VALUE.
// If overflow is detected, the function returns 0 to signify an invalid reversal.

class Solution {
    public int reverse(int x) 
    {
        int rev = 0;
        while(x != 0)
        {
            int digit = x % 10;  // Get the last digit of `x`
            // Check for overflow conditions
            if(rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10)
            {
                return 0;  // Return 0 if reversing would cause overflow
            }
            else
            {
                rev = (rev * 10) + digit;  // Update reversed number
                x = x / 10;  // Remove the last digit from `x`
            }
        }  
        return rev;  // Return the reversed number
    }
}

