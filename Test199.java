import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test199 {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> rs = new ArrayList();
		if (root == null)
			return rs;
		Queue<TreeNode> queue = new LinkedList();
		queue.add(root);
		Queue<Integer> layer = new LinkedList();
		layer.add(0);
		int addLayer = 1;
		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			int laynow = layer.poll();
			// System.out.println(temp.val+" "+laynow+" "+addLayer);

			if (temp.left != null) {
				queue.add(temp.left);
				layer.add(addLayer);
			}
			if (temp.right != null) {
				queue.add(temp.right);
				layer.add(addLayer);
			}
			if (queue.isEmpty() || layer.peek() != laynow) {
				addLayer++;
				rs.add(temp.val);
			}
		}
		return rs;
	}
}
