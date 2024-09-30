// Problem number: 41
// Problem name: First Missing Positive

class Solution {
    public int firstMissingPositive(int[] nums) 
    {
        int missingnumber = 1; // Initialize the first missing positive number to 1
        Arrays.sort(nums); // Sort the array to check the numbers in ascending order
        
        // Iterate through the sorted array
        for (int num : nums) 
        {
            // Only check positive numbers
            if (num > 0) 
            {
                // If the current number matches the expected missing number, increment it
                if (num == missingnumber) 
                {
                    missingnumber++; // Move to the next expected missing positive
                }
            }
        }
        return missingnumber; // Return the first missing positive number
    }
}

