// LeetCode Problem 88: Merge Sorted Array
// Merges two sorted arrays into one sorted array in place.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int i = m - 1; // Last element of nums1
        int j = n - 1; // Last element of nums2
        int k = m + n - 1; // Last position in nums1
        
        // Merge until all elements from nums2 are processed
        while (j >= 0)
	 {
            if (i >= 0 && nums1[i] > nums2[j])
	    {
                nums1[k] = nums1[i]; // Place nums1[i] at the end
                i--;
            }
	     else
	     {
                nums1[k] = nums2[j]; // Place nums2[j] at the end
                j--;
             }
               k--; // Move to the next position
        }
    }
}
