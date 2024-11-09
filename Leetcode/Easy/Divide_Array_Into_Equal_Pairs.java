// Problem No: 2206
// Problem Name: Divide Array Into Equal Pairs

class Solution {
    public boolean divideArray(int[] nums) 
    {
        Set<Integer> s = new HashSet<>(); // Create a HashSet to track elements
        
        // Iterate through each number in nums
        for (int num : nums) 
        {
            // If the number is already in the set, remove it (pair completed)
            if (s.contains(num)) 
            {
                s.remove(num);
            } 
            else 
            {
                s.add(num); // Otherwise, add the number to the set
            }
        }
        
        // Check if set is empty, indicating all numbers were paired
        return s.isEmpty();
    }
}
