// Problem No: 1539
// Problem Name: Kth Missing Positive Number

class Solution {
    public int findKthPositive(int[] arr, int k) 
    {
        int left = 0; // Initialize left boundary for binary search
        int right = arr.length; // Initialize right boundary

        // Binary search to find the position where the Kth missing number would be
        while (left < right) 
        {
            int mid = left + (right - left) / 2; // Calculate mid-point
            
            // Check how many numbers are missing until arr[mid]
            if (arr[mid] - mid - 1 < k) 
            {
                left = mid + 1; // Move left boundary to the right
            } 
            else 
            {
                right = mid; // Move right boundary to the left
            }
        }
        
        // Calculate the Kth missing number using final left position
        return left + k;
    }
}
