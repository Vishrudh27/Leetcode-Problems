// Problem No: 1961
// Problem Name: Check If String Is a Prefix of Array

class Solution {
    public boolean isPrefixString(String s, String[] words) 
    {
        StringBuilder sb = new StringBuilder();  // Initialize a StringBuilder to build prefix string

        // Loop through each word in words array
        for (String word : words) {
            sb.append(word);  // Append the current word to the StringBuilder

            // Check if the built string matches s
            if (sb.toString().equals(s)) {
                return true;  // If match found, return true
            }
        }

        return false;  // Return false if no match found after appending all words
    }
}
