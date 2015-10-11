package SpaceReplacement;

public class Solution {
    /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        // Write your code here
    	int spaceCount = 0, newLen, i = 0, res;
    	if(string.length == 0) return 0;
    	for(i = 0; i < length; i++) {
    		if(string[i] == ' ') spaceCount++;
    	}
    	newLen = length + spaceCount * 2;
    	string[newLen] = '\0';
    	res = newLen;
    	for(i = length - 1; i > -1; i--) {
    		if(string[i] == ' ') {
    			string[newLen - 1] = '0';
    			string[newLen - 2] = '2';
    			string[newLen - 3] = '%';
    			newLen -= 3;
    		}
    		else {
    			string[newLen - 1] = string[i];
    			newLen -= 1;
    		}
    	}
    	return res;
    }
}
