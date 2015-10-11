package CoinsinaLine;

public class Solution {
    /**
     * @param n: an integer
     * @return: a boolean which equals to true if the first player will win
     */
    public boolean firstWillWin(int n) {
        // write your code here
        boolean[] b = new boolean[n];
        b[0] = true;
        b[1] = true;
        for(int i = 2; i < b.length; i++) {
            b[i] = (!(b[i - 1] && b[i - 2]));
        }
        return b[n - 1];
    }
}
