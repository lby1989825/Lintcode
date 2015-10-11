package PlusOne;

public class Solution {
    /**
     * @param digits a number represented as an array of digits
     * @return the result
     */
    public int[] plusOne(int[] digits) {
        // Write your code here
        int carry = 1;
        for(int i = digits.length - 1; i > -1; i--) {
        	int digit = digits[i] + carry;
            digits[i] = digit % 10;
            carry = digit / 10;
        }
        if(carry == 1) {
            int[] res = new int[digits.length + 1];
            System.arraycopy(digits, 0, res, 1, digits.length);
            res[0] = 1;
            return res;
        }
        else return digits;
    }
}
