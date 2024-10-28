// Problem No: 1394
// Problem Name: Find Lucky Integer in an Array

class Solution {
    public int findLucky(int[] arr) 
    {
        HashMap<Integer, Integer> hm = new HashMap<>();  // Create a HashMap to store frequencies of elements

        // Loop through the array to populate the HashMap with frequencies
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);  // Increment frequency if key exists
            } else {
                hm.put(arr[i], 1);  // Initialize frequency to 1 if key is new
            }
        }

        int max = -1;  // Initialize max to -1 to store the largest lucky integer

        // Traverse the HashMap to find the largest lucky integer
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            // Check if the frequency matches the integer itself
            if (entry.getKey() == entry.getValue()) {
                max = Math.max(entry.getValue(), max);  // Update max if a larger lucky integer is found
            }
        }

        return max;  // Return the largest lucky integer found, or -1 if none exists
    }
}

