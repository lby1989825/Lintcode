package NQueens;

import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * Get all distinct N-Queen solutions
     * @param n: The number of queens
     * @return: All distinct solutions
     * For example, A string '...Q' shows a queen on forth position
     */
    ArrayList<ArrayList<String>> solveNQueens(int n) {
        // write your code here
    	ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
    	helper(n, 0, new int[n], res);
		return res;
    }

	private void helper(int n, int row, int[] colRow, ArrayList<ArrayList<String>> res) {
		// TODO Auto-generated method stub
		if(n == row) {
			List<String> list = new ArrayList<String>();
			for(int i = 0; i < n; i++) {
				String str = "";
				for(int j = 0; j < n; j++) {
					if(colRow[i] == j) str += 'Q';
					else str += '.';
				}
				list.add(str);
			}
			res.add(new ArrayList<String>(list));
			return;
		}
		else {
			for(int col = 0; col < n; col++) {
				if(check(colRow, row, col)) {
					colRow[row] = col;
					helper(n, row + 1, colRow, res);
				}
			}
		}
	}

	private boolean check(int[] colRow, int row, int col) {
		// TODO Auto-generated method stub
		for(int r = 0; r < row; r++) {
			int c = colRow[r];
			if(col == c || row - r == Math.abs(col - c)) return false;
		}
		return true;
	}
};

