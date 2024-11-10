// Problem No: 2185
// Problem Name: Counting Words With a Given Prefix

class Solution {
    public int prefixCount(String[] words, String pref) 
    {
        int pref_length = pref.length(); // Store the length of the prefix
        int count = 0; // Initialize the count of words with the prefix

        // Iterate through each word in the words array
        for (int i = 0; i < words.length; i++) 
        {
            // Check if the word length is at least as long as the prefix
            if (words[i].length() >= pref_length) 
            {
                // Extract the prefix portion of the word
                String checkPrefix = words[i].substring(0, pref_length);
                
                // Compare the extracted prefix with the target prefix
                if (pref.equals(checkPrefix)) 
                {
                    count++; // Increment count if they match
                }
            }
        }
        
        return count; // Return the total count of matching words
    }
}
