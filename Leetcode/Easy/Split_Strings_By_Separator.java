// Problem No: 2788 
// Problem Name: Split Strings  by Separator

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) 
    {
        List<String> result = new ArrayList<>(); // List to store words after splitting by separator
        
        // Loop through each word in the input list
        for (int i = 0; i < words.size(); i++) 
        {
            // Split the word by the given separator
            String wordsarray[] = words.get(i).split("[" + separator + "]");
            
            // Add each non-empty split part to the result list
            for (String word : wordsarray) 
            {
                if (!word.equals("")) 
                {
                    result.add(word);
                }
            }
        }    
        
        return result; // Return the list of split words
    }
}
