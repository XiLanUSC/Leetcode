import java.util.LinkedList;
import java.util.Queue;
//Time Limit Exceeded
public class Test222 {
	public int countNodes(TreeNode root) {
		int rs = 0;
		if (root == null)
			return rs;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			rs++;
			if (temp.left != null)
				queue.add(temp.left);
			if (temp.right != null)
				queue.add(temp.right);
		}
		return rs;
	}
}
