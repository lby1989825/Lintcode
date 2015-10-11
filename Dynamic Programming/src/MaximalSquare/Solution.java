package MaximalSquare;

public class Solution {
    /**
     * @param matrix: a matrix of 0 and 1
     * @return: an integer
     */
     private int max = 0;
    public int maxSquare(int[][] matrix) {
        // write your code here
        int rows = matrix.length;
    	if(rows == 0) return 0;
    	int cols = matrix[0].length;
    	for(int i = 0; i < rows; i++) {
    		for(int j = 0; j < cols; j++) {
    			if(matrix[i][j] == 1) {
    				expandSquare(matrix, i, i, j, j);
    			}
    		}
    	}
		return max;
    }
    
    private void expandSquare(int[][] matrix, int is, int ie, int js, int je) {
		// TODO Auto-generated method stub
		int num = (int) Math.pow(ie - is + 1, 2);
		if(ie == matrix.length - 1 || je == matrix[0].length - 1) {
			max = Math.max(max, num);
			return;
		}
		int j = js, i = is;
		while(j <= je) {
			if(matrix[ie + 1][j] == 0) {
			    max = Math.max(max, num);
			    return;
			}
			j++;
		}
		while(i <= ie) {
			if(matrix[i][je + 1] == 0) {
			    max = Math.max(max, num);
			    return;
			}
			i++;
		}
		if(matrix[ie + 1][je + 1] == 0) {
			max = Math.max(max, num);
			return;
		}
		expandSquare(matrix, is, ie + 1, js, je + 1);
	}
}
