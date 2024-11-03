// Problem No: 2180
// Problem Name: Count Integers With Even Digit Sum

class Solution {
    public int countEven(int num) 
    {
        int count = 0;  // Initialize count of numbers with even digit sum

        // Iterate from 1 to num
        for (int i = 1; i <= num; i++) {
            // Check if the sum of digits is even
            if (sumOfDigits(i) % 2 == 0) {
                count++;  // Increment count if sum of digits is even
            }
        }
        
        return count;  // Return total count
    }

    // Helper function to calculate sum of digits
    private int sumOfDigits(int n) 
    {
        int sum = 0;  // Initialize sum of digits

        // Extract digits and add to sum
        while (n != 0) {
            int digit = n % 10;  // Get last digit
            sum += digit;        // Add to sum
            n = n / 10;          // Remove last digit
        }

        return sum;  // Return the sum of digits
    }
}
