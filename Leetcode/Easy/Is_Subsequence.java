// Problem number: 392  
// Problem name: Is Subsequence  

class Solution {
    public boolean isSubsequence(String s, String t)
    {
        int i = 0, j = 0; // Initialize pointers for both 's' and 't'
        
        while (i < s.length() && j < t.length()) { // Loop through both strings while there are characters to check
            if (s.charAt(i) == t.charAt(j)) { // If the characters at the pointers match
                i++; // Move the pointer in 's' to check the next character
            }
            j++; // Always move the pointer in 't' to the next character
        }
        
        return i == s.length(); // Return true if all characters in 's' were found in the correct order in 't'
    }
}
