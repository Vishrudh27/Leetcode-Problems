// Problem No: 557
// Problem Name: Reverse Words in a String III

class Solution {
    public String reverseWords(String s) 
    {
        char arr[] = s.toCharArray();  // Convert the input string to a character array
        int right = 0, left = 0;  // Initialize two pointers: left for the start of a word, right for the end
        
        while (right < arr.length)  // Loop through the entire character array
        {
            if (arr[right] == ' ')  // If a space is encountered, reverse the current word
            {
                reverse(arr, left, right - 1);  // Reverse the word between 'left' and 'right - 1'
                left = right + 1;  // Move the left pointer to the next word
            }
            right++;  // Move the right pointer forward
        }
        reverse(arr, left, right - 1);  // Reverse the last word after the loop ends

        return new String(arr);  // Return the modified array as a new string
    }

    private void reverse(char arr[], int left, int right)  // Helper function to reverse a word in place
    {
        while (left < right)  // Swap characters until the pointers meet
        {
            char temp = arr[left];  // Temporary storage for the character at 'left'
            arr[left] = arr[right];  // Assign the character at 'right' to 'left'
            arr[right] = temp;  // Assign the temporary value to 'right'
            left++;  // Move the left pointer inward
            right--;  // Move the right pointer inward
        }
    }
}
