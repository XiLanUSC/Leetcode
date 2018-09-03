import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test107_2 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<List<Integer>> rs = new ArrayList();
		if (root == null)
			return rs;
		queue.add(root);
		while (!queue.isEmpty()) {
			int len = queue.size();
			List<Integer> temp = new ArrayList<>();
			for (int i = 0; i < len; i++) {
				TreeNode pos = queue.poll();
				if (pos.left != null)
					queue.offer(pos.left);
				if (pos.right != null)
					queue.offer(pos.right);
				temp.add(pos.val);
			}
			rs.add(0, new ArrayList<>(temp));
		}
		return rs;
	}
}
