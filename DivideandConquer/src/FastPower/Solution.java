package FastPower;

class Solution {
    /*
     * @param a, b, n: 32bit integers
     * @return: An integer
     */
    public int fastPower(int a, int b, int n) {
        // write your code here
    	long res = helper(a, b, n);
    	return (int) res;
    }

	private long helper(int a, int b, int n) {
		// TODO Auto-generated method stub
		long res = helper(a, b, n / 2);
		res *= res;
		res %= b;
		if(n % 2 == 1) res *= helper(a, b, 1);
		res %= b;
		return res;
	}
};
