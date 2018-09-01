import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test103_2 {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> rs = new ArrayList();
		if (root == null)
			return rs;
		Queue<TreeNode> nodes = new LinkedList<TreeNode>();
		Queue<Integer> layers = new LinkedList<Integer>();

		nodes.add(root);
		layers.add(0);
		int lastLayer = 0;
		List<Integer> temp = new ArrayList<Integer>();
		while (!nodes.isEmpty()) {
			TreeNode node = nodes.poll();
			int layer = layers.poll();
			if (layer != lastLayer) {
				if (lastLayer % 2 == 1) {
					Collections.reverse(temp);
				}
				rs.add(temp);
				temp = new ArrayList();
				lastLayer = layer;
			}
			temp.add(node.val);

			if (node.left != null) {
				nodes.add(node.left);
				layers.add(layer + 1);
			}
			if (node.right != null) {
				nodes.add(node.right);
				layers.add(layer + 1);
			}

		}
		if (lastLayer % 2 == 1) {
			Collections.reverse(temp);
		}
		rs.add(temp);

		return rs;
	}
}
