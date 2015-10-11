package MergeIntervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    /**
     * @param intervals: Sorted interval list.
     * @return: A new sorted interval list.
     */
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
    	Collections.sort(intervals, new ListComparator());
    	if(intervals.size() == 1) return intervals;
    	List<Interval> left = new ArrayList<Interval>(intervals.subList(0, intervals.size() / 2));
    	List<Interval> right = new ArrayList<Interval>(intervals.subList(intervals.size() / 2, intervals.size()));
    	List<Interval> l1 = merge(left), l2 = merge(right);
    	return mergeTwoList(l1, l2);
    }

	private List<Interval> mergeTwoList(List<Interval> left, List<Interval> right) {
		// TODO Auto-generated method stub
		List<Interval> res = new ArrayList<Interval>();
		if(left.get(left.size() - 1).start == right.get(0).start) {
			left.remove(left.size() - 1);
			res.addAll(left);
			res.addAll(right);
		}
		else if(left.get(left.size() - 1).end >= right.get(0).start) {
			if(left.get(left.size() - 1).end >= right.get(0).end) {
				while(right.size() != 0 && left.get(left.size() - 1).end >= right.get(0).end) right.remove(0);
				if(right.size() == 0) res.addAll(left);
				else if(left.get(left.size() - 1).end < right.get(0).start) {
					res.addAll(left);
					res.addAll(right);
				}
				else if(left.get(left.size() - 1).end >= right.get(0).start) {
					int i = left.get(left.size() - 1).start, j = right.get(0).end;
					left.remove(left.size() - 1);
					right.remove(0);
					res.addAll(left);
					res.add(new Interval(i, j));
					res.addAll(right);
				}
			}
			else if(left.get(left.size() - 1).end < right.get(0).end) {
				int i = left.get(left.size() - 1).start, j = right.get(0).end;
				left.remove(left.size() - 1);
				right.remove(0);
				res.addAll(left);
				res.add(new Interval(i, j));
				res.addAll(right);
			}
		}
		else {
			res.addAll(left);
			res.addAll(right);
		}
		return res;
	}

}
