// Problem No: 35
// Problem Name: Search Insert Position

class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int start = 0;  // Initialize the start of the search range
        int end = nums.length - 1;  // Initialize the end of the search range

        while (start <= end)  // Perform binary search while start is less than or equal to end
        {
            int mid = (start + end) / 2;  // Calculate the mid-point of the current range
            
            if (nums[mid] == target)  // If target is found at mid, return the mid index
            {
                return mid;
            }
            else if (nums[mid] > target)  // If mid value is greater than target, search in the left half
            {
                end = mid - 1;
            }
            else if (nums[mid] < target)  // If mid value is less than target, search in the right half
            {
                start = mid + 1;
            }
        } 
        return start;  // If the target is not found, return the position where it should be inserted
    }
}
