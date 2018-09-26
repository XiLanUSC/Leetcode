
public class Test547_2 {
	public int findCircleNum(int[][] M) {
		if (M.length == 0)
			return 0;
		int count = 0;
		for (int i = 0; i < M.length; i++) {
			if (bfs(M, i))
				count++;
		}
		return count;
	}

	private boolean bfs(int[][] M, int i) {
		boolean found = false;
		for (int j = 0; j < M[0].length; j++) {
			if (M[i][j] == 1) {
				found = true;
				M[i][j] = 2;
				bfs(M, j);
			} else if (M[i][j] == 2)
				return false;
		}
		return found;
	}
}
