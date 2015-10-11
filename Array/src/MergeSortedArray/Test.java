package MergeSortedArray;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[5];
		A[0] = 1;
		A[1] = 2;
		A[2] = 3;
//		A[3] = 6;
		int[] B = new int[]{4, 5};
		Solution s = new Solution();
		s.mergeSortedArray(A, 3, B, 2);
	}

}
