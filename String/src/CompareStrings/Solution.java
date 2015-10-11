package CompareStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        List<Character> keyList = new ArrayList<Character>();
        for(int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if(!map1.containsKey(c)) map1.put(c, 1);
            else map1.put(c, map1.get(c) + 1);
        }
        for(int i = 0; i < B.length(); i++) {
            char c = B.charAt(i);
            if(!map2.containsKey(c)) {
                map2.put(c, 1);
                keyList.add(c);
            }
            else map2.put(c, map2.get(c) + 1);
        }
        for(int i = 0; i < keyList.size(); i++) {
            char c = keyList.get(i);
            if(!map1.containsKey(c)) return false;
            else if(map1.get(c) < map2.get(c)) return false;
        }
        return true;
    }
}
