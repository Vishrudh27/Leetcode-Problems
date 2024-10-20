// Problem No: 367
// Problem Name: Valid Perfect Square

class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {  // If the number is 1, it's a perfect square
            return true;
        }
        
        int left = 1;  // Initialize the left boundary of the binary search
        int right = num / 2;  // Initialize the right boundary as half of the number

        while (left <= right) {  // Continue binary search while left is less than or equal to right
            int mid = (left + right) / 2;  // Calculate the mid-point
            long midsquare = (long) mid * mid;  // Compute the square of the mid-point, cast to long to avoid overflow

            if (midsquare == num) {  // If the square of mid equals the number, it's a perfect square
                return true;
            } else if (midsquare > num) {  // If mid squared is greater than the number, search the left half
                right = mid - 1;
            } else {  // Otherwise, search the right half
                left = mid + 1;
            }
        }
        
        return false;  // Return false if no perfect square root is found
    }
}
