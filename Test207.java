import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test207 {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		int[] inDegree = new int[numCourses];
		int count = 0;
		List<List<Integer>> graph = new ArrayList();
		for (int i = 0; i < numCourses; i++) {
			graph.add(new ArrayList());
		}

		for (int i = 0; i < prerequisites.length; i++) {
			inDegree[prerequisites[i][0]]++;
			graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
		}
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < numCourses; i++) {
			if (inDegree[i] == 0) {
				queue.offer(i);
				count++;
			}
		}
		while (!queue.isEmpty()) {
			int i = queue.poll();
			for (int val : graph.get(i)) {
				inDegree[val]--;
				if (inDegree[val] == 0) {
					queue.offer(val);
					count++;
				}
			}
		}
		if (count == numCourses)
			return true;
		else
			return false;
	}
}
