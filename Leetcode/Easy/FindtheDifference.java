// Problem: LeetCode 389 - Find the Difference
// The function finds the extra character added to string 't' compared to string 's'.

class Solution {
    public char findTheDifference(String s, String t) 
    {
        int total = 0;  // Initialize total to hold the sum of ASCII values.
        
        // Sum the ASCII values of all characters in 't'
        for(int i = 0; i < t.length(); i++) {
            total += t.charAt(i);
        }
        
        // Subtract the ASCII values of all characters in 's' from the total
        for(int i = 0; i < s.length(); i++) {
            total -= s.charAt(i);
        }
        
        // The remaining value in 'total' corresponds to the extra character in 't'
        return (char) total;
    }
}
