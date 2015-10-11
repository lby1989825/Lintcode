package HashFunction;

class Solution {
    /**
     * @param key: A String you should hash
     * @param HASH_SIZE: An integer
     * @return an integer
     */
    public int hashCode(char[] key, int HASH_SIZE) {
        // write your code here
    	int hashCode = 0;
        for(int i = 0; i < key.length; i++) {
        	int offset = getOffset(key.length - 1 - i, HASH_SIZE);
        	hashCode += offset * key[i] % HASH_SIZE;
        }
        return hashCode % HASH_SIZE;
    }

    private int getOffset(int count, int HASH_SIZE) {
        int res = 1;
        for(int i = 0; i < count; i++) {
            res *= 33 % HASH_SIZE;
        }
        return res % HASH_SIZE;
    }

}
