package BackpackII;

public class Solution {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A & V: Given n items with size A[i] and value V[i]
     * @return: The maximum value
     * �������ⶨ��״̬����f[i][v]��ʾǰi����Ʒǡ����һ������Ϊv�ı������Ի�õ�����ֵ������״̬ת�Ʒ��̱��ǣ�

f[i][v]=max{f[i-1][v],f[i-1][v-c[i]]+w[i]}

������̷ǳ���Ҫ�����������и�������ص�����ķ��̶����������������ġ������б�Ҫ������ϸ����һ�£�����ǰi����Ʒ��������Ϊv�ı����С���������⣬��ֻ���ǵ�i����Ʒ�Ĳ��ԣ��Ż򲻷ţ�����ô�Ϳ���ת��Ϊһ��ֻǣ��ǰi-1����Ʒ�����⡣������ŵ�i����Ʒ����ô�����ת��Ϊ��ǰi-1����Ʒ��������Ϊv�ı����С�����ֵΪf[i-1][v]������ŵ�i����Ʒ����ô�����ת��Ϊ��ǰi-1����Ʒ����ʣ�µ�����Ϊv-c[i]�ı����С�����ʱ�ܻ�õ�����ֵ����f[i-1][v-c[i]]�ټ���ͨ�������i����Ʒ��õļ�ֵw[i]��
     */
	public int backPackII(int m, int[] A, int V[]) {
        // write your code here
        int[][] dp = new int[A.length + 1][m + 1];
        for(int i = 0; i <= A.length; i++) {
            for(int j = 0; j <= m; j++) {
                if(i == 0 || j == 0) dp[i][j] = 0;
                else if(j - A[i - 1] >= 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - A[i - 1]] + V[i - 1]);
                }
                else dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[A.length][m];
    }
}