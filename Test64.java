
public class Test64 {
	public int minPathSum(int[][] grid) {
		int[][] ways = new int[grid.length][grid[0].length];
		ways[0][0] = grid[0][0];
		for (int i = 1; i < grid.length; i++)
			ways[i][0] = ways[i - 1][0] + grid[i][0];
		for (int j = 1; j < grid[0].length; j++)
			ways[0][j] = ways[0][j - 1] + grid[0][j];
		for (int i = 1; i < grid.length; i++) {
			for (int j = 1; j < grid[0].length; j++) {
				ways[i][j] = Math.min(ways[i - 1][j], ways[i][j - 1]) + grid[i][j];
			}
		}

		return ways[grid.length - 1][grid[0].length-1];
	}
}
