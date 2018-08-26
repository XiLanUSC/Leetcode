
public class Test79 {
	boolean getted = false;

	public boolean exist(char[][] board, String word) {
		int m = board.length, n = board[0].length;
		boolean[][] valid = new boolean[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				valid[i][j] = true;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0))
					find(i, j, board, "", word, valid, m, n);
			}
		}
		return getted;
	}

	private void find(int i, int j, char[][] board, String wordnow, String word, boolean[][] valid, int m, int n) {
		if (getted)
			return;
		
		valid[i][j] = false;
		wordnow = wordnow + board[i][j];
		if (wordnow.equals(word)) {
			getted = true;
			return;
		}
		if (wordnow.length() == word.length())
			return;
		// go right
		if (i < m - 1 && valid[i + 1][j] == true && board[i + 1][j] == word.charAt(wordnow.length())) {
			find(i + 1, j, board, wordnow, word, valid, m, n);
		}
		if (i > 0 && valid[i - 1][j] == true && board[i - 1][j] == word.charAt(wordnow.length())) {
			find(i - 1, j, board, wordnow, word, valid, m, n);
		}
		if (j < n - 1 && valid[i][j + 1] == true && board[i][j + 1] == word.charAt(wordnow.length())) {
			find(i, j + 1, board, wordnow, word, valid, m, n);
		}
		if (j > 0 && valid[i][j - 1] == true && board[i][j - 1] == word.charAt(wordnow.length())) {
			find(i, j - 1, board, wordnow, word, valid, m, n);
		}
		valid[i][j] = true;
		wordnow = wordnow.substring(0, wordnow.length() - 1);
	}
}
