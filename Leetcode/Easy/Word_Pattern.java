// Problem number: 290
// Problem name: Word Pattern

class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        String arr[] = s.split(" ");  // Split the input string 's' into words
        if (arr.length != pattern.length())  // Check if the length of words matches the length of the pattern
        {
            return false;  // If not, return false
        }
        
        HashMap<Character, String> hm = new HashMap<>();  // Create a HashMap to map pattern characters to words
        
        for (int i = 0; i < pattern.length(); i++) 
        {
            char ch = pattern.charAt(i);  // Get the current character from the pattern
            boolean containskey = hm.containsKey(ch);  // Check if the character is already in the HashMap

            // If the character is not in the map and the word is already mapped to a different character
            if (!containskey && hm.containsValue(arr[i])) 
            {
                return false;  // Return false if this condition is met
            }

            // If the character is in the map but the associated word does not match the current word
            if (containskey && !hm.get(ch).equals(arr[i])) 
            {
                return false;  // Return false if there's a mismatch
            }

            else 
            {
                hm.put(ch, arr[i]);  // Add the character-word mapping to the HashMap
            }
        }
        return true;  // Return true if the pattern matches
    }
}
