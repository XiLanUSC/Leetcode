import java.util.Arrays;

public class Test200 {
	boolean[][] reached;

	public int numIslands(char[][] grid) {
		int count = 0;
		reached = new boolean[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				reached[i][j] = false;
			}
		}
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1' && reached[i][j] == false) {
					count++;
					search(grid, i, j);
				}
			}
		}

		return count;
	}

	private void search(char[][] grid, int i, int j) {
		if (grid[i][j] == '0')
			return;
		else
			reached[i][j] = true;
		if (i > 0 && reached[i - 1][j] == false)
			search(grid, i - 1, j);
		if (j > 0 && reached[i][j - 1] == false)
			search(grid, i, j - 1);
		if (i < grid.length - 1 && reached[i + 1][j] == false)
			search(grid, i + 1, j);
		if (j < grid[0].length - 1 && reached[i][j + 1] == false)
			search(grid, i, j + 1);
	}
}
