
public class Test289 {
	public void gameOfLife(int[][] board) {
		if (board.length == 0)
			return;
		int[][] future = new int[board.length][board[0].length];
		int[][] move = { { 1, 0 }, { -1, 0 }, { 1, 1 }, { 1, -1 }, { 0, 1 }, { 0, -1 }, { -1, 1 }, { -1, -1 } };
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				int count = 0;
				for (int k = 0; k < 8; k++) {
					if (i + move[k][0] >= 0 && i + move[k][0] <= board.length - 1 && j + move[k][1] >= 0
							&& j + move[k][1] <= board[0].length - 1) {
						if (board[i + move[k][0]][j + move[k][1]] == 1)
							count++;
					}
				}
				if (board[i][j] == 1) {
					if (count == 2 || count == 3)
						future[i][j] = 1;
					else
						future[i][j] = 0;
				} else {
					if (count == 3)
						future[i][j] = 1;
				}
				if (i == 0 && j == 1)
					System.out.println(future[i][j] + " " + board[i][j]);
			}
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = future[i][j];
			}
		}
	}
}
