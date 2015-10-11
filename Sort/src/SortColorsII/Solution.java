package SortColorsII;

class Solution {
    /**
     * @param colors: A list of integer
     * @param k: An integer
     * @return: nothing
     */
    public void sortColors2(int[] colors, int k) {
        // write your code here
        int[] count = new int[k];
        for(int i = 0; i < colors.length; i++) {
        	count[colors[i] - 1]++;
        }
        int i = 0;
        for(int j = 0; j < count.length; j++) {
        	int c = count[j];
        	while(c > 0) {
        		colors[i++] = j + 1;
        		c--;
        	}
        }
        return;
    }
}
