package InsertInterval;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    /**
     * Insert newInterval into intervals.
     * @param intevals: Sorted interval list.
     * @param newInterval: A new interval.
     * @return: A new sorted interval list.
     */
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        // write your code here
        intervals.add(newInterval);
        Collections.sort(intervals, new ListComparator());
        for(int i = 1; i < intervals.size(); i++) {
        	Interval pre = intervals.get(i - 1), cur = intervals.get(i);
        	if(pre.start == cur.start) {
        		intervals.remove(i - 1);
        		i--;
        	}
        	else if(pre.end >= cur.end) {
        		intervals.remove(i--);
        	}
        	else if(pre.end >= cur.start) {
        		intervals.remove(i--);
        		intervals.remove(i);
        		intervals.add(i, new Interval(pre.start, cur.end));
        	}
        	else if(pre.end < cur.start) continue;
        }
        result = intervals;
        return result;
    }
}

