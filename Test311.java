
public class Test311 {
	public int[][] multiply(int[][] A, int[][] B) {

		int arow = A.length, brow = B.length, acol = A[0].length, bcol = B[0].length;
		int[][] rs = new int[arow][bcol];
		for (int i = 0; i < arow; i++) {
			for (int j = 0; j < bcol; j++) {
				int sum = 0;
				for(int k = 0;k<brow;k++) {
					sum+=A[i][k]*B[k][j];
				}
				rs[i][j] = sum;
				
			}
		}

		return rs;
	}
}
