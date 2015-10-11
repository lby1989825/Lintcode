package NumberofIslands;

public class Solution {
    /**
     * @param grid a boolean 2D matrix
     * @return an integer
     */
	private boolean[][] marked;
	private int count = 0;
    public int numIslands(boolean[][] grid) {
        // Write your code here
    	if(grid.length == 0) return 0;
    	int rows = grid.length, cols = grid[0].length;
    	marked = new boolean[rows][cols];
    	for(int i = 0; i < rows; i++) {
    		for(int j = 0; j < cols; j++) {
    			if(!marked[i][j] && grid[i][j]) {
    				dfs(grid, i, j);
    				count++;
    			}
    		}
    	}
    	return count;
    }
	private void dfs(boolean[][] grid, int i, int j) {
		// TODO Auto-generated method stub
		marked[i][j] = true;
		if(i - 1 > -1 && !marked[i - 1][j] && grid[i - 1][j]) dfs(grid, i - 1, j);
		if(i + 1 < grid.length && !marked[i + 1][j] && grid[i + 1][j]) dfs(grid, i + 1, j);
		if(j - 1 > -1 && !marked[i][j - 1] && grid[i][j - 1]) dfs(grid, i, j - 1);
		if(j + 1 < grid[0].length && !marked[i][j + 1] && grid[i][j + 1]) dfs(grid, i, j + 1);
	}
}
