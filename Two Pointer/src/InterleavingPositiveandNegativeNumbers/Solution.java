package InterleavingPositiveandNegativeNumbers;

class Solution {
    /**
     * @param A: An integer array.
     * @return: void
     */
    public void rerange(int[] A) {
        // write your code here
    	int positiveCount = 0, negitiveCount = 0, positiveIndex = 0, negitiveIndex = 0;
    	for(int i = 0; i < A.length; i++) {
    		if(A[i] > 0) positiveCount++;
    		else if(A[i] < 0) negitiveCount++;
    	}
    	int flag;
    	if(positiveCount - negitiveCount == 1) flag = 0;
    	else if(negitiveCount - positiveCount == 1) flag = 1;
    	else flag = A[0] < 0 ? 1 : 0;
    	for(int i = 0; i < A.length; i++) {
			flag = Math.abs(flag - 1);
			if(flag == 1 && A[i] > 0) {
				positiveIndex = i;
			}
			else if((flag == 1 && A[i] < 0)) {
				int j = findNextPositive(A, positiveIndex + 1);
				positiveIndex = j;
				exch(A, i, j);
			}
			else if(flag == 0 && A[i] < 0) { 
				negitiveIndex = i;
			}
			else {
				int j = findNextNegitive(A, negitiveIndex + 1);
				negitiveIndex = j;
				exch(A, i, j);
			}
		}
    }
    private int findNextNegitive(int[] A, int j) {
		// TODO Auto-generated method stub
	   for(int i = j; i < A.length; i++) {
		   if(A[i] < 0) return i;
	   }
	   throw new IllegalArgumentException();
   }
   private int findNextPositive(int[] A, int j) {
	   for(int i = j; i < A.length; i++) {
		   if(A[i] > 0) return i;
	   }
	   throw new IllegalArgumentException();
   }
   
   private void exch(int[] A, int i, int j) {
	   int t = A[i];
	   A[i] = A[j];
	   A[j] = t;
   }
}
