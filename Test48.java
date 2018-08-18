
public class Test48 {
	public void rotate(int[][] matrix) {
		int height = matrix.length / 2;

		for (int i = 0; i < height; i++) {
			for (int j = i; j < matrix.length - i - 1; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[matrix.length - j - 1][i];
				matrix[matrix.length - j - 1][i] = matrix[matrix.length - i - 1][matrix.length - j - 1];
				matrix[matrix.length - i - 1][matrix.length - j - 1] = matrix[j][matrix.length - i - 1];
				matrix[j][matrix.length - i - 1] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
