package NumberofIslands;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] grid = new boolean[5][5];
		boolean t = true, f = false;
		grid[0] = new boolean[]{t,t,f,f,f};
		grid[1] = new boolean[]{f,t,f,f,t};
		grid[2] = new boolean[]{f,f,f,t,t};
		grid[3] = new boolean[]{f,f,f,f,f};
		grid[4] = new boolean[]{f,f,f,f,t};
		Solution s = new Solution();
		s.numIslands(grid);
	}

}
