package SortLettersbyCase;

public class Solution {
    /** 
     *@param chars: The letter array you should sort by Case
     *@return: void
     */
    public void sortLetters(char[] chars) {
        //write your code here
    	int i = 0, j = chars.length - 1;
    	while(i < j) {
    		while(i < chars.length && Character.isLowerCase(chars[i])) i++;
    		while(j > -1 && Character.isUpperCase(chars[j])) j--;
    		if(i > j) break;
    		exch(chars, i, j);
    	}
    	return;
    }

	private void exch(char[] chars, int i, int j) {
		// TODO Auto-generated method stub
		char c = chars[i];
		chars[i] = chars[j];
		chars[j] = c;
	}
}
