package FindMinimuminRotatedSortedArrayII;

public class Solution {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
        // write your code here
    	if(num.length == 0) return 0;
    	int lo = 0, hi = num.length - 1;
    	int min = num[0];
    	while(hi - lo > 1) {
    		int mid = lo + (hi - lo) / 2;
    		if(num[mid] < num[lo]) {
    			min = Math.min(num[mid], min);
    			hi = mid - 1;
    		}
    		else if(num[mid] > num[lo]) {
    			min = Math.min(num[lo], min);
    			lo = mid + 1;
    		}
    		else lo++;
    	}
    	min = Math.min(Math.min(num[lo], num[hi]), min);
    	return min;
    }
}
