// Problem number: 1768
// This function merges two strings, word1 and word2, by alternating characters from each string.
// The function uses a while loop to append characters from both words one by one.
// If one word is shorter than the other, it continues appending characters from the longer word.
// A StringBuilder is used for efficient string manipulation.

class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        StringBuilder sb = new StringBuilder();  // StringBuilder to efficiently build the merged string
        int i = 0;  // Index variable to track the current position in both strings

        // Loop continues as long as there are characters left in either word
        while (i < word1.length() || i < word2.length()) 
        {
            // If word1 has characters left, append the current character to sb
            if (i < word1.length()) 
            {
                sb.append(word1.charAt(i));
            }

            // If word2 has characters left, append the current character to sb
            if (i < word2.length()) 
            {
                sb.append(word2.charAt(i));
            }

            i++;  // Move to the next character in both words
        }

        return sb.toString();  // Return the merged string
    }
}
