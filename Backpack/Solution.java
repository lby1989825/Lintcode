package Backpack;
/**
 * Given n items with size Ai, an integer m denotes the size of a backpack. How full you can fill this backpack?
 * @author lby
 *
 */
public class Solution {
	public int backPack(int m, int[] A) {
		if(A.length == 0) return 0;
		boolean[] dp = new boolean[m + 1];
		dp[0] = true;
		for(int i = 0; i < A.length; i++) {
			for(int j = m; j > -1; j--) {
				if(j - A[i] >= 0 && dp[j - A[i]]) {
					dp[j] = true;
				}
			}
		}
		for(int i = m; i > -1; i--) {
			if(dp[i]) return i;
		}
		return 0;
	}
}
