// Problem No: 41
// Problem Name: First Missing Positive

class Solution {
    public int firstMissingPositive(int[] nums) 
    {
        int missingnumber = 1;      // Initialize the smallest positive missing number to 1
        Arrays.sort(nums);          // Sort the array to check numbers in order

        // Traverse through each number in the sorted array
        for (int num : nums) {
            if (num > 0) {          // Only consider positive numbers
                if (num == missingnumber) {
                    missingnumber++; // Increment the missing number if the current number matches
                }
            }
        }

        return missingnumber;       // Return the smallest missing positive number
    }
}
