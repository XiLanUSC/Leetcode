
public class Test547 {
	public int findCircleNum(int[][] M) {
		if (M.length == 0)
			return 0;
		int count = 0;
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				if (M[i][j] == 1) {
					count++;
					bfs(M, i, j);
				}
			}
		}
		return count;
	}

	private void bfs(int[][] M, int i, int j) {
		M[i][j] = 2;
		if (i - 1 >= 0 && M[i - 1][j] == 1) {
			bfs(M, i - 1, j);
		}
		if (i + 1 < M.length && M[i + 1][j] == 1) {
			bfs(M, i + 1, j);
		}
		if (j - 1 >= 0 && M[i][j - 1] == 1) {
			bfs(M, i, j - 1);
		}
		if (j + 1 < M[0].length && M[i][j + 1] == 1) {
			bfs(M, i, j + 1);
		}
	}
}
