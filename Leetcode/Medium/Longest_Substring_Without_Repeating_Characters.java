// Problem number: 3
// Problem name: Longest Substring Without Repeating Characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0; // Start pointer of the window
        int end = 0;   // End pointer of the window
        int max_length = 0; // Maximum length of substring without repeating characters
        List<Character> list = new ArrayList<>(); // List to store unique characters in the current window

        // Iterate through the string
        while (end < s.length()) {
            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end)); // Add non-repeating character to the list
                end++; // Move the end pointer
                max_length = Math.max(max_length, list.size()); // Update the max length
            } else {
                list.remove(Character.valueOf(s.charAt(start))); // Remove the character at the start pointer
                start++; // Move the start pointer
            }
        }
        return max_length; // Return the length of the longest substring without repeating characters
    }
}
