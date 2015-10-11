package FindMinimuminRotatedSortedArray;

public class Solution {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
        // write your code here
    	return findMin(num, 0, num.length - 1);
    }

	private int findMin(int[] num, int lo, int hi) {
		// TODO Auto-generated method stub
		if(hi - lo <= 1) return Math.min(num[lo], num[hi]);
    	int mid = lo + (hi - lo) / 2;
    	if(num[mid] > num[lo] && num[mid] > num[hi]) {
			if(num[lo] > num[hi]) return findMin(num, mid, hi);
			return findMin(num, lo, mid);
		}
		else if(num[mid] < num[lo] && num[mid] < num[hi]) {
			if(num[lo] > num[hi]) return findMin(num, lo, mid);
			else return findMin(num, mid, hi);
		}
		else return num[lo];
	}
}
