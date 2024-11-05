// Problem No: 6537
// Problem Name: Count Symmetric Integers Within a Range

class Solution {
    public int countSymmetricIntegers(int low, int high) 
    {
        int count = 0; // Initialize counter for symmetric integers
        
        while (low <= high) // Iterate through the range from low to high
        {
            String value = String.valueOf(low); // Convert integer to string for easy splitting
            int len = value.length(); // Get the length of the number
            
            if (len % 2 == 0) // Process only even-length numbers
            {
                // Split into first and second halves
                String firstHalf = value.substring(0, len / 2);
                String secondHalf = value.substring(len / 2);
                
                // Compare the sum of digits in both halves
                if (digitSum(firstHalf) == digitSum(secondHalf)) 
                {
                    count++; // Increment count if the number is symmetric
                }
            }
            low++; // Move to the next number in the range
        }
        return count; // Return the final count of symmetric integers
    }

    private int digitSum(String digit) 
    {
        int n = Integer.parseInt(digit); // Convert string to integer
        int sum = 0; // Initialize sum of digits
        
        while (n > 0) 
        {
            sum += n % 10; // Add the last digit to sum
            n = n / 10; // Remove the last digit from the number
        }
        return sum; // Return the sum of digits
    }
}
