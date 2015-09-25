package CosineSimilarity;

class Solution {
    /**
     * @param A: An integer array.
     * @param B: An integer array.
     * @return: Cosine similarity.
     */
    public double cosineSimilarity(int[] A, int[] B) {
        // write your code here
        int divend = 0, square1 = 0, square2 = 0;
        for(int i = 0; i < A.length; i++) {
            divend += A[i] * B[i];
            square1 += Math.pow(A[i], 2);
            square2 += Math.pow(B[i], 2);
        }
        return (Math.pow(square1, 0.5) * Math.pow(square2, 0.5)) == 0 ? 2.0000 : (double) divend / (Math.pow(square1, 0.5) * Math.pow(square2, 0.5));
    }
}
