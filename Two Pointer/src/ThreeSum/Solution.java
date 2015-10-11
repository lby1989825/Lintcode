package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    /**
     * @param numbers : Give an array numbers of n integer
     * @return : Find all unique triplets in the array which gives the sum of zero.
     */
    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        // write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++) {
            int target = 0 - numbers[i];
            int j = i + 1, k = numbers.length - 1;
            while(j < k) {
                if(numbers[j] + numbers[k] < target) j++;
                else if(numbers[j] + numbers[k] > target) k--;
                else {
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(numbers[i]);
                    list.add(numbers[j]);
                    list.add(numbers[k]);
                    if(!res.contains(list)) res.add(list);
                    j++;
                    k--;
                }
            }
        }
        return res;
    }
}
