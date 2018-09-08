import java.util.ArrayList;
import java.util.List;

public class Test144 {

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> rs = new ArrayList();
		if (root == null)
			return rs;
		preorder(root, rs);
		return rs;
	}

	private void preorder(TreeNode root, List<Integer> rs) {
		rs.add(root.val);
		if (root.left != null)
			preorder(root.left, rs);
		if (root.right != null)
			preorder(root.right, rs);
	}
}
