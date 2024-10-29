// Problem No: 1486
// Problem Name: XOR Operation in an Array

class Solution {
    public int xorOperation(int n, int start) 
    {
        int res[] = new int[n];  // Initialize an array to store elements based on formula
        for (int i = 0; i < n; i++) {    
            res[i] = start + 2 * i;  // Calculate each element in the array using start + 2 * i
        }

        int ans = 0;  // Initialize the result for XOR operations
        for (int num : res) {
            ans ^= num;  // Apply XOR operation between elements
        }

        return ans;  // Return the final XOR result
    }
}
