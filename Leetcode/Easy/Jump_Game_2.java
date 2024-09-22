// Problem number: 45
// This function calculates the minimum number of jumps required to reach the end of the array.
// It uses a greedy approach, updating the maximum coverage reachable at each step.
// The loop tracks the point where the last jump was made and increments the jump count.
// If the current jump covers the destination, the total jumps count is returned.

class Solution {
    public int jump(int[] nums) 
    {
       int totaljumps = 0;  // Total number of jumps made
       int coverage = 0;  // Maximum index reachable with current jumps
       int lastjumpidx = 0;  // The index where the last jump was made
       int destination = nums.length - 1;  // Destination index (last index)

       // If the array contains only one element, no jumps are needed
       if (nums.length == 1) return 0;

       // Iterate through the array to calculate jumps
       for (int i = 0; i < nums.length; i++) 
       {
           // Update the coverage with the farthest reachable index
           coverage = Math.max(coverage, i + nums[i]);

           // When we reach the index of the last jump, make a new jump
           if (i == lastjumpidx) 
           {
               lastjumpidx = coverage;  // Update the last jump index
               totaljumps++;  // Increment total jumps count
           }

           // If the last jump can cover the destination, return the number of jumps
           if (lastjumpidx >= destination)
               return totaljumps;
       }

       return totaljumps;  // Return the total jumps made
    }
}
