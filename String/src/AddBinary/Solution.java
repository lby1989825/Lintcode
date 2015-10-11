package AddBinary;

public class Solution {
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
    public String addBinary(String a, String b) {
        // Write your code here
        StringBuilder sb = new StringBuilder();
        int len1 = a.length(), len2 = b.length();
        String offset = "";
        for(int i = 0; i < Math.abs(len1 - len2); i++) offset += "0";
        if(len1 > len2) b = offset + b;
        else if(len1 < len2) a = offset + a;
        int[] res = new int[a.length()];
        int carry = 0;
        for(int i = res.length - 1; i > -1; i--) {
            res[i] = (Integer.parseInt(a.substring(i, i + 1)) + Integer.parseInt(b.substring(i, i + 1)) + carry) % 2;
            carry = (Integer.parseInt(a.substring(i, i + 1)) + Integer.parseInt(b.substring(i, i + 1)) + carry) / 2;
        }
        if(carry == 1) {
            sb.append(carry + "");
            for(int i = 0; i < res.length; i++) sb.append(res[i]);
        }
        else for(int i = 0; i < res.length; i++) sb.append(res[i]);
        return sb.toString();
    }
}

