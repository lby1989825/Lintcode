package NutsBoltsProblem;

import java.util.Arrays;

public class Solution {
    /**
     * @param nuts: an array of integers
     * @param bolts: an array of integers
     * @param compare: a instance of Comparator
     * @return: nothing
     */
    public void sortNutsAndBolts(String[] nuts, String[] bolts, NBComparator compare) {
        // write your code here
    	Arrays.sort(nuts, compare);
    	Arrays.sort(bolts, compare);
    }
};
