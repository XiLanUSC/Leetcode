import java.util.ArrayList;
import java.util.List;

public class Test95 {
	public List<TreeNode> generateTrees(int n) {
		if (n <= 0)
			return new ArrayList();

		return create(1, n);
	}

	private List<TreeNode> create(int left, int right) {
		List<TreeNode> rs = new ArrayList();
		if (right < left) {
			rs.add(null);
			return rs;
		}
		for (int i = left; i <= right; i++) {
			for (TreeNode l : create(left, i - 1)) {
				for (TreeNode r : create(i + 1, right)) {
					TreeNode root = new TreeNode(i);
					root.left = l;
					root.right = r;
					rs.add(root);
				}
			}
		}
		return rs;
	}
}
