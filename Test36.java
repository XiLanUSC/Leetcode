import java.util.Stack;

public class Test36 {
	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			char[] c = board[i];
			if (!isCopied(c))
				return false;
		}
		for (int i = 0; i < board[0].length; i++) {
			char[] c = new char[board[0].length];
			for (int j = 0; j < c.length; j++) {
				c[j] = board[j][i];
			}
			if (!isCopied(c))
				return false;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int posi = 3 * i, posj = 3 * j;
				char[] c = new char[9];
				int count = 0;
				for (int m = posi; m < posi + 3; m++) {
					for (int n = posj; n < posj + 3; n++) {
						c[count] = board[m][n];
						count++;
					}
				}
				if (!isCopied(c))
					return false;
			}
		}
		return true;
	}

	private boolean isCopied(char[] c) {
		Stack s = new Stack();
		for (int i = 0; i < c.length; i++) {
			if (c[i] != '.') {
				if (s.contains(c[i]))
					return false;
				else {
					s.push(c[i]);
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
