package NumberofAirplanesintheSky;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    /**
     * @param intervals: An interval array
     * @return: Count of airplanes are in the sky.
     */
    public int countOfAirplanes(List<Interval> airplanes) { 
        // write your code here
    	if(airplanes.size() == 0) return 0;
    	int max = 1;
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int i = 0; i < airplanes.size(); i++) {
    		Interval inter = airplanes.get(i);
    		for(int j = inter.start; j < inter.end; j++) {
    			if(!map.containsKey(j)) map.put(j, 1);
    			else map.put(j, map.get(j) + 1);
    		}
    	}
    	
    	for(int key : map.keySet()) {
    		if(map.get(key) > max) {
    			max = map.get(key);
    		}
    	}
		return max;
    }
}
