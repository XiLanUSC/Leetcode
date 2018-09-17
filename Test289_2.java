
public class Test289_2 {
	//modify in place
	// 0--0 0
	// 1--1 1
	// 2--0 1
	// 3--1 0
	public void gameOfLife(int[][] board) {
		if (board.length == 0)
			return;
		int[][] move = { { 1, 0 }, { -1, 0 }, { 1, 1 }, { 1, -1 }, { 0, 1 }, { 0, -1 }, { -1, 1 }, { -1, -1 } };
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				int count = 0;
				for (int k = 0; k < 8; k++) {
					if (i + move[k][0] >= 0 && i + move[k][0] <= board.length - 1 && j + move[k][1] >= 0
							&& j + move[k][1] <= board[0].length - 1) {
						if (board[i + move[k][0]][j + move[k][1]] == 1 || board[i + move[k][0]][j + move[k][1]] == 3)
							count++;
					}
				}
				if (board[i][j] == 1) {
					if (count == 2 || count == 3)
						board[i][j] = 1;
					else
						board[i][j] = 3;
				} else {
					if (count == 3)
						board[i][j] = 2;
					else
						board[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 2)
					board[i][j] = 1;
				if (board[i][j] == 3)
					board[i][j] = 0;
			}
		}
	}
}
