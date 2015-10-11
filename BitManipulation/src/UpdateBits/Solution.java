package UpdateBits;

class Solution {
    /**
     *@param n, m: Two integer
     *@param i, j: Two bit positions
     *return: An integer
     */
    public int updateBits(int n, int m, int i, int j) {
        // write your code here
        long allOnes = ~0;
        long left = allOnes << (j + 1), right = (1 << i) - 1;
        long mask = left | right;
        long n_clear = n & mask, m_shift = m << i;
        return (int) (n_clear | m_shift);
    }
}
