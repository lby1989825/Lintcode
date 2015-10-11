package KthSmallestNumberinSortedMatrix;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[][] matrix = new int[3][3];
		matrix[0] = new int[]{1 ,5 ,7};
		matrix[1] = new int[]{3 ,7 ,8};
		matrix[2] = new int[]{4 ,8 ,9};
		int res = s.kthSmallest(matrix, 7);
		System.out.println(res);
	}
}
