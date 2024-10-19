// Problem No: 344
// Problem Name: Reverse String

class Solution {
    public void reverseString(char[] s) 
    {
        int start = 0;  // Initialize the start pointer
        int end = s.length - 1;  // Initialize the end pointer
        
        while (start < end)  // Loop until the start pointer is less than the end pointer
        {
            char c = s[start];  // Temporarily store the character at the start
            s[start] = s[end];  // Assign the character at the end to the start
            s[end] = c;  // Assign the temporarily stored character to the end
            
            start++;  // Move the start pointer forward
            end--;    // Move the end pointer backward
        }
    }
}
