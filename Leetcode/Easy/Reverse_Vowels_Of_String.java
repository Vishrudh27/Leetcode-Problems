// Problem number: 345
// Problem name: Reverse Vowels of a String
// This function reverses the vowels in a given string.
// Two pointers approach is used, where 'start' moves from the beginning and 'end' from the end.
// When both pointers point to vowels, they are swapped.


public String reverseVowels(String s) {
    char ch[] = s.toCharArray();  // Convert the string into a char array
    int start = 0;  // Pointer at the start of the array
    int end = s.length() - 1;  // Pointer at the end of the array

    // Loop to process until the two pointers meet
    while (start < end) {
        // Move 'start' forward if it's not a vowel
        if (!isVowel(ch[start])) {
            start++;
        } 
        // Move 'end' backward if it's not a vowel
        else if (!isVowel(ch[end])) {
            end--;
        } 
        // If both 'start' and 'end' point to vowels, swap them
        else {
            char temp = ch[start];  // Temporary variable for swapping
            ch[start] = ch[end];  // Swap vowels
            ch[end] = temp;
            start++;  // Move 'start' forward
            end--;  // Move 'end' backward
        }
    }
    // Convert char array back to string and return
    return String.valueOf(ch);
}

// Helper function to check if a character is a vowel
private boolean isVowel(char c) {
    return "AEIOUaeiou".indexOf(c) != -1;
}
