// Problem number: 1455
// Problem name: Check If a Word Occurs As a Prefix of Any Word in a Sentence

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] str = sentence.split(" ");  // Split the sentence into words
        for (int i = 0; i < str.length; i++) {  // Loop through the words
            if (str[i].startsWith(searchWord)) {  // Check if the word starts with searchWord
                return i + 1;  // Return the 1-based index if found
            }
        }
        return -1;  // Return -1 if no word starts with searchWord
    }
}