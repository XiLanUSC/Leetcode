import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test102 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> rs = new ArrayList();
		if(root == null)return rs;
		Queue<TreeNode> line = new LinkedList<TreeNode>();
		Queue<Integer> level = new LinkedList<Integer>();
		List<Integer> order = new ArrayList();
		line.add(root);
		level.add(0);
		int lastlevel = -1;
		while (!line.isEmpty()) {
			TreeNode temp = line.poll();
			int levelnow = level.poll();
			if (levelnow != lastlevel) {
				if (levelnow != 0)
					rs.add(order);
				order = new ArrayList();
				order.add(temp.val);
				lastlevel = levelnow;
				if (temp.left != null) {
					line.add(temp.left);
					level.add(levelnow + 1);
				}
				if (temp.right != null) {
					line.add(temp.right);
					level.add(levelnow + 1);
				}
			} else {
				order.add(temp.val);
				if (temp.left != null) {
					line.add(temp.left);
					level.add(levelnow + 1);
				}
				if (temp.right != null) {
					line.add(temp.right);
					level.add(levelnow + 1);
				}
			}

		}
		rs.add(order);
		return rs;
	}
}
