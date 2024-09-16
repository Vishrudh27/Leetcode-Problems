// Problem: LeetCode 27 - Remove Element
// The function removes all instances of 'val' from the array and returns the new length of the array.

class Solution {
    public int removeElement(int[] nums, int val) {

        int count = 0;  // Keeps track of valid elements.
        int j = 0;  // Index for placing non-val elements.

        // Loop through all elements in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to 'val'
            if (nums[i] != val) {
                nums[j] = nums[i];  // Move the non-val element to the front
                count++;  // Increment the count of valid elements
                j++;  // Move the index for the next valid element
            }
        }

        // Return the new length of the array after removing 'val' elements
        return count;
    }
}

