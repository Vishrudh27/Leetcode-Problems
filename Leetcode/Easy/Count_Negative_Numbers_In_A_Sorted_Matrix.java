// Problem No: 1351
// Problem Name: Count Negative Numbers in a Sorted Matrix

class Solution {
    public int countNegatives(int[][] grid) 
    {
        int n = grid.length;      // Number of rows in the grid
        int m = grid[0].length;   // Number of columns in the grid
        int r = n - 1;            // Start from the bottom-left corner row
        int c = 0;                // Start from the first column
        int count = 0;            // Initialize count for negative numbers

        // Traverse the grid from bottom-left to top-right
        while (r >= 0 && c < m) {
            if (grid[r][c] < 0) {
                --r;              // Move up if a negative number is found
                count += m - c;   // All elements to the right are negative
            } else {
                ++c;              // Move right if the current number is non-negative
            }
        }

        return count;  // Return the total count of negative numbers
    }
}
