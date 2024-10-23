// Problem No: 448
// Problem Name: Find All Numbers Disappeared in an Array

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        ArrayList<Integer> output = new ArrayList<>();  // List to store the missing numbers

        int appeared[] = new int[nums.length + 1];  // Array to track the occurrence of numbers in nums

        // Increment the count in appeared array for each number in nums
        for (int i : nums) {
            appeared[i]++;
        }

        // Check which numbers from 1 to nums.length have not appeared in the array
        for (int i = 1; i <= nums.length; i++) {
            if (appeared[i] == 0) {  // If a number is missing (appeared[i] == 0), add it to the output list
                output.add(i);
            }
        }

        return output;  // Return the list of missing numbers
    }
}
