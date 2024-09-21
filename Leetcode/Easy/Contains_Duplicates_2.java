// Problem 219: Contains Duplicate II
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        // Initialize a HashMap to store each element and its latest index
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        // Iterate through the array 'nums'
        for(int i = 0; i < nums.length; i++) 
        {
            // If the current number is not already in the HashMap, add it with its index
            if(!hm.containsKey(nums[i])) 
            {
                hm.put(nums[i], i);  // Store the current index of nums[i]
            } 
            else 
            {
                // Retrieve the past index of the current number from the HashMap
                int pastIndex = hm.get(nums[i]);
                
                // Check if the difference between the current index and past index is <= k
                if(Math.abs(pastIndex - i) <= k) 
                {
                    return true;  // Return true if the condition is met
                } 
                else 
                {
                    // Update the HashMap with the new index of the current number
                    hm.put(nums[i], i);
                }
            }
        }
        // If no nearby duplicate is found within the distance 'k', return false
        return false;
    }
}
