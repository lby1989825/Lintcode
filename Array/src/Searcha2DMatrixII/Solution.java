package Searcha2DMatrixII;

public class Solution {
    /**
     * @param matrix: A list of lists of integers
     * @param: A number you want to search in the matrix
     * @return: An integer indicate the occurrence of target in the given matrix
     */
    public int searchMatrix(int[][] matrix, int target) {
        // write your code here
    	int rows = matrix.length;
    	if(rows == 0) return 0;
    	int cols = matrix[0].length;
    	int i = rows - 1, j = 0, count = 0;
    	while(i > -1 && j < cols) {
    		if(matrix[i][j] == target) {
    			count++;
    			j++;
    		}
    		else if(matrix[i][j] < target) {
    			j++;
    		}
    		else i--;
    	}
    	return count;
    }
}
