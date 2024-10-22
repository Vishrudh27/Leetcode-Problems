// Problem No: 349
// Problem Name: Intersection of Two Arrays

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashSet<Integer> hs1 = new HashSet<>();  // HashSet to store elements from nums1
        HashSet<Integer> hs2 = new HashSet<>();  // HashSet to store intersecting elements    

        // Add all elements of nums1 to hs1
        for (int i : nums1) {
            hs1.add(i);
        }

        // Check if elements of nums2 are in hs1 and add to hs2 if they exist
        for (int i : nums2) {
            if (hs1.contains(i)) {
                hs2.add(i);  // Add the intersecting elements to hs2
            }
        }

        // Create the result array with the size of hs2 (intersection)
        int result[] = new int[hs2.size()];
        int index = 0;

        // Populate the result array with elements from hs2
        for (int i : hs2) {
            result[index++] = i;  // Add elements of hs2 to result array
        }
        
        return result;  // Return the result array containing the intersection
    }
}
