// Problem No: 3024
// Problem Name: Type Of Triangle

class Solution {
    public String triangleType(int[] nums) 
    {
        // Check if the given sides cannot form a triangle
        if (nums[0] + nums[1] <= nums[2] || nums[1] + nums[2] <= nums[0] || nums[0] + nums[2] <= nums[1]) {
            return "none";  // Not a valid triangle
        }
        
        // Check if all sides are equal
        if ((nums[0] == nums[1]) && (nums[1] == nums[2])) {
            return "equilateral";  // All sides are equal
        }
        
        // Check if any two sides are equal
        else if ((nums[0] == nums[1]) || (nums[1] == nums[2]) || (nums[0] == nums[2])) {
            return "isosceles";  // Two sides are equal
        }
        
        // If no sides are equal
        else {
            return "scalene";  // All sides are different
        }
    }
}
