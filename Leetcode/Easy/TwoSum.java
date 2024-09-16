// Problem: LeetCode 1 - Two Sum

// Class to implement the twoSum function
class Solution {
    
    // Method to find indices of two numbers that add up to the target
    public int[] twoSum(int[] nums, int target) {
        
        // Create a HashMap to store the numbers and their indices
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {

            // Calculate the required number to reach the target
            int req_num = target - nums[i];
            
            // Check if the required number is already in the HashMap
            if (hm.containsKey(req_num)) {

                // Return the indices of the two numbers
                int[] arr = { hm.get(req_num), i };
                return arr;
            }

            // Add the current number and its index to the HashMap
            hm.put(nums[i], i);
        }

        // Return null if no solution is found
        return null;
    }
}
