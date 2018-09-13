import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test210_2 {
	public int[] findOrder(int numCourses, int[][] prerequisites) {
		List<List<Integer>> graph = new ArrayList<>();
		int[] visited = new int[numCourses];
		for (int i = 0; i < numCourses; i++)
			graph.add(new ArrayList<>());

		int[] indegree = new int[numCourses];
		Queue<Integer> queue = new LinkedList<>();

		// construct the adjacency list
		for (int[] row : prerequisites) {
			graph.get(row[1]).add(row[0]);
			indegree[row[0]]++;
		}
		int count = 0;
		// every time a node is visited reduce the count of its adjacency vertex by 1
		for (int i = 0; i < numCourses; i++) {
			if (indegree[i] == 0) {
				visited[count] = i;
				queue.offer(i);
				count++;
			}
		}

		while (queue.size() > 0) {

			int i = queue.poll();
			for (int val : graph.get(i)) {
				indegree[val]--;
				if (indegree[val] == 0) {
					queue.offer(val);
					visited[count] = val;
					count++;
				}
			}
		}
		if (numCourses != count)
			return new int[0];
		return visited;
	}
}
