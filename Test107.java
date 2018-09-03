import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Test107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Queue<Integer> levels = new LinkedList<Integer>();
		Stack<List<Integer>> stack = new Stack<List<Integer>>();
		List<List<Integer>> rs = new ArrayList();
		if (root == null)
			return rs;
		queue.add(root);
		levels.add(1);
		List<Integer> row = new ArrayList();
		int lastLevel = 0;
		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			int level = levels.poll();
			if (level != lastLevel && row.size() != 0) {
				stack.add(new ArrayList(row));
				row = new ArrayList();
				lastLevel = level;
			}
			row.add(temp.val);
			if (temp.left != null) {
				queue.add(temp.left);
				levels.add(level + 1);
			}
			if (temp.right != null) {
				queue.add(temp.right);
				levels.add(level + 1);
			}

		}
		if (row.size() != 0)
			stack.add(new ArrayList(row));
		while (!stack.isEmpty()) {
			List<Integer> temp = stack.pop();
			rs.add(new ArrayList(temp));
		}
		return rs;
	}
}
