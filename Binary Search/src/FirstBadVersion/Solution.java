package FirstBadVersion;

class Solution {
    /**
     * @param n: An integers.
     * @return: An integer which is the first bad version.
     */
    public int findFirstBadVersion(int n) {
        // write your code here
    	if(n == 1) return 1;
    	int lo = 1, hi = n;
    	while(lo < hi) {
    		int mid = lo + (hi - lo) / 2;
    		if(VersionControl.isBadVersion(mid)) hi = mid;
    		else if(!VersionControl.isBadVersion(mid)) lo = mid;
    	}
    	if (VersionControl.isBadVersion(lo)) return lo;
    	return hi;
    }
}
