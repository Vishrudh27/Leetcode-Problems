// Problem number: 58
// Problem name: Length of Last Word

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0; // Initialize count variable (not used, can be removed if unused)
        String arr[] = s.split(" "); // Split the string 's' into words based on spaces
        
        // If no words exist (empty string), return 0
        if (arr.length == 0) {
            return 0;
        } else {
            // Return the length of the last word in the array
            return arr[arr.length - 1].length();
        }
    }
}
