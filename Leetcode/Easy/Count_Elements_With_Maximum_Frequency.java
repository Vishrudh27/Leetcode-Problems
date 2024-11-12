// Problem No: 3005
// Problem Name: Count Elements With Maximum Frequency

class Solution {
    public int maxFrequencyElements(int[] nums) 
    {
        int maxfreq = 0; // Variable to track maximum frequency
        int freq[] = new int[101]; // Frequency array to count occurrences of each number (0-100)

        // Count frequency of each element in nums and determine max frequency
        for (int num : nums) 
        {
            freq[num]++;
            maxfreq = Math.max(maxfreq, freq[num]);
        }    

        int sum = 0; // Variable to sum elements with max frequency

        // Sum the frequency of elements that match the max frequency
        for (int i = 0; i <= 100; i++) 
        {
            if (freq[i] == maxfreq) 
            {
                sum += maxfreq;
            }
        }

        return sum; // Return the total sum of elements with max frequency
    }
}
