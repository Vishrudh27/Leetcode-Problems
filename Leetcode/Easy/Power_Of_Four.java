// Problem number: 342
// Problem name: Power of Four

class Solution {
    public boolean isPowerOfFour(int n) 
    {
        while (n >= 4) 
        {
            if (n % 4 != 0) return false;  // If n is not divisible by 4, return false
            n = n / 4;  // Divide n by 4 in each iteration
        }
        return n == 1;  // Return true if n becomes 1, meaning it's a power of 4
    }
}
