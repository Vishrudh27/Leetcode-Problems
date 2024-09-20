// Problem number: 202
// This function checks if a number is a "happy number".
// A happy number is one where repeatedly summing the squares of its digits eventually leads to 1.
// The function uses a HashSet to track numbers encountered during the process to detect cycles (unhappy numbers).
// If the number becomes 1, it is happy, otherwise, if a cycle is detected, it is not.

class Solution {
    public boolean isHappy(int n) 
    {
        Set<Integer> hm = new HashSet<>();  // Initialize a HashSet to track numbers and detect cycles
        while (true)
        {
            int sum = 0;  // Variable to store the sum of the squares of digits
            while (n != 0)
            {
                sum += Math.pow(n % 10, 2.0);  // Square the last digit and add to the sum
                n = n / 10;  // Remove the last digit
            }
            n = sum;  // Set the new number as the sum of squares

            if (n == 1)  // If the sum equals 1, the number is happy
            {
                return true;
            }

            if (hm.contains(n))  // If the number has been seen before, there's a cycle (not happy)
            {
                return false;
            }
            hm.add(n);  // Add the number to the set to track it
        }
    }
}

