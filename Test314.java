import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test314 {
	public List<List<Integer>> verticalOrder(TreeNode root) {
		List<List<Integer>> rs = new ArrayList();
		if (root == null)
			return rs;
		HashMap<Integer, List<Integer>> map = new HashMap();
		Queue<Integer> levels = new LinkedList();
		Queue<TreeNode> nodes = new LinkedList();
		int min = 0, max = 0;
		nodes.add(root);
		levels.add(0);
		while (!nodes.isEmpty()) {
			TreeNode temp = nodes.poll();
			int level = levels.poll();
			if (level < min)
				min = level;
			if (level > max)
				max = level;
			if (map.containsKey(level)) {
				map.get(level).add(temp.val);
			} else {
				List<Integer> list = new ArrayList();
				list.add(temp.val);
				map.put(level, list);
			}
			if (temp.left != null) {
				nodes.add(temp.left);
				levels.add(level - 1);
			}
			if (temp.right != null) {
				nodes.add(temp.right);
				levels.add(level + 1);
			}
		}
		for (int i = min; i <= max; i++) {
			rs.add(map.get(i));

		}
		return rs;
	}
}
