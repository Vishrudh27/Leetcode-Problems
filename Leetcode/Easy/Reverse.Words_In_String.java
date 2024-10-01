// Problem number: 151
// Problem name: Reverse Words in a String

public String reverseWords(String s) {
    String words[] = s.split(" +"); // Split by spaces
    StringBuilder sb = new StringBuilder(); // StringBuilder to build result
    for (int i = words.length - 1; i >= 0; i--) { // Iterate in reverse
        sb.append(words[i]); // Append each word
        sb.append(" "); // Add space
    } 
    return sb.toString().trim(); // Return trimmed result
}
