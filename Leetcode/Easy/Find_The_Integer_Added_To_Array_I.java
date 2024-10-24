// Problem No: 3131
// Problem Name: Find the Integer Added to Array I

class Solution {
    public int addedInteger(int[] nums1, int[] nums2) 
    {
        // Sort both input arrays nums1 and nums2
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        // Return the difference between the first element of nums2 and nums1
        // Assuming the problem asks for the difference between corresponding first elements of sorted arrays
        return nums2[0] - nums1[0];
    }
}
