
public class Test210 {
	public int[] findOrder(int numCourses, int[][] prerequisites) {

		int[][] map = new int[numCourses][numCourses];

		for (int i = 0; i < numCourses; i++) {
			for (int j = 0; j < numCourses; j++) {
				if (i == j)
					continue;
				map[i][j] = 1;
			}
		}
		for (int i = 0; i < prerequisites.length; i++) {
			map[prerequisites[i][0]][prerequisites[i][1]] = 0;
		}
		boolean[] reached = new boolean[numCourses];
		int[] rs = new int[numCourses];
		int count = 0;
		boolean[] isStart = new boolean[numCourses];
		for (int i = 0; i < numCourses; i++) {
			isStart[i] = true;
		}
		for (int i = 0; i < prerequisites.length; i++) {
			isStart[prerequisites[i][0]] = false;
		}
		for (int i = 0; i < numCourses; i++) {
			if (isStart[i]) {
				rs[count++] = i;
				reached[i] = true;
			}
		}
		if (count > 0) {
			if (dfs(map, reached, rs, rs[count - 1], count - 1, prerequisites)) {
				return rs;
			}
		}

		return new int[0];
	}

	private boolean dfs(int[][] map, boolean[] reached, int[] rs, int pos, int count, int[][] prerequisites) {
		for (int i = 0; i < prerequisites.length; i++) {
			if (prerequisites[i][0] == pos) {
				if (!reached[prerequisites[i][1]])
					return false;
			}
		}
		rs[count] = pos;
		reached[pos] = true;
		if (count == reached.length - 1)
			return true;
		for (int i = 0; i < reached.length; i++) {
			if (i == pos)
				continue;
			if (!reached[i] && map[pos][i] == 1) {
				if (dfs(map, reached, rs, i, count + 1, prerequisites))
					return true;
			}
		}
		reached[pos] = false;
		return false;
	}
}
