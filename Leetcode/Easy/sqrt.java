// Problem number: 69 (Sqrt(x))
// This function calculates the integer part of the square root of a given number `x`.
// The Math.sqrt() method is used to get the square root as a double, which is then cast to an integer,
// effectively discarding the decimal portion to return the floor value of the square root.

class Solution {
    public int mySqrt(int x) 
    {
        double sqr = Math.sqrt(x);  // Compute the square root as a double
        int sq = (int) sqr;  // Cast the result to an integer, discarding the decimal part
        return sq;  // Return the integer square root
    }
}
