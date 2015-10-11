package RotateImage;

public class Solution {
	public void rotate(int[][] matrix) {
        // write your code here
		int len = matrix.length, layer = len / 2;
		for(int i = 0; i < layer; i++) {
			int offset = len - 1 - i;
			for(int j = i; j < offset; j++) {
				int top = matrix[i][j];
    			matrix[i][j] = matrix[offset + i - j][i]; //top == left
    			matrix[offset + i - j][i] = matrix[offset][offset + i - j];
    			matrix[offset][offset  + i - j] = matrix[j][offset];
    			matrix[j][offset] = top;
    			
			}
		}
    }
}
