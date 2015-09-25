package Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<String> anagrams(String[] strs) {
		List<String> res = new ArrayList<String>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for(String str: strs) {
			char[] c = str.toCharArray();
			Arrays.sort(c);
			String temp = new String(c);
			if(!map.containsKey(temp)) {
				List<String> list = new ArrayList<String>();
				list.add(str);
				map.put(temp, list);
			}
			else map.get(temp).add(str);
		}
		Iterator iter = map.values().iterator();
		while(iter.hasNext()) {
			List<String> list = (List<String>) iter.next();
			if(list.size() != 1) res.addAll(list);
		}
		return res;
	}
}
