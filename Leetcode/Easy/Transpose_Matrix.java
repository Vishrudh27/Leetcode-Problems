// Problem number: 867
// Problem name: Transpose Matrix

class Solution {
    public int[][] transpose(int[][] matrix) 
    {
        int rows = matrix.length; // Get the number of rows in the matrix
        int columns = matrix[0].length; // Get the number of columns in the matrix
        int result[][] = new int[columns][rows]; // Create a new matrix for the transposed result

        // Loop through the matrix and assign transposed values
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                result[j][i] = matrix[i][j]; // Transpose the element
            }
        }
        
        return result; // Return the transposed matrix
    }
}
