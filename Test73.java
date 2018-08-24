
public class Test73 {
	public static void setZeroes(int[][] matrix) {
		boolean top = false, left = false;
		for (int i = 0; i < matrix.length; i++)
			if (matrix[i][0] == 0)
				top = true;

		for (int j = 0; j < matrix[0].length; j++)
			if (matrix[0][j] == 0)
				left = true;
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][0] == 0)
				colZero(i, matrix);
		}
		for (int j = 1; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0)
				rowZero(j, matrix);
		}
		if (top)
			rowZero(0, matrix);
		if (left)
			colZero(0, matrix);
	}

	private static void colZero(int i, int[][] matrix) {
		for (int j = 0; j < matrix[0].length; j++)
			matrix[i][j] = 0;
	}

	private static void rowZero(int j, int[][] matrix) {
		for (int i = 0; i < matrix.length; i++)
			matrix[i][j] = 0;
	}
	public static void main(String args[]) {
		int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		setZeroes(matrix);
	}
}
