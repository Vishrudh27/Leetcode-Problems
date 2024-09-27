// Problem number: 326
// Problem name: Power of Three

class Solution {
    public boolean isPowerOfThree(int n) 
    {
        while (n >= 3) 
        {
            if (n % 3 != 0) return false;  // If n is not divisible by 3, return false
            n = n / 3;  // Divide n by 3 in each iteration
        }   
        return n == 1;  // Return true if n becomes 1, meaning it's a power of 3
    }
}

