package WordSearchII;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    /**
     * @param board: A list of lists of character
     * @param words: A list of string
     * @return: A list of string
     */
	Set<String> res = new HashSet<String>();
	public ArrayList<String> wordSearchII(char[][] board, ArrayList<String> words) {
        // write your code here
		Trie trie = new Trie();
		for(String word: words) trie.insert(word);
		int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, visited, "", i, j, trie);
            }
        }
        return new ArrayList<String>(res);
    }
	private void dfs(char[][] board, boolean[][] visited, String str, int x,
			int y, Trie trie) {
		// TODO Auto-generated method stub
		if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) return;
        if (visited[x][y]) return;        
        str += board[x][y];
        if (!trie.startsWith(str)) return;
        
        if (trie.search(str)) {
            res.add(str);
        }        
        visited[x][y] = true;
        dfs(board, visited, str, x - 1, y, trie);
        dfs(board, visited, str, x + 1, y, trie);
        dfs(board, visited, str, x, y - 1, trie);
        dfs(board, visited, str, x, y + 1, trie);
        visited[x][y] = false;
	}
}
