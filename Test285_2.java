
public class Test285_2 {

	public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
		if (root == null)
			return null;
		TreeNode rs = null;
		while (root != null) {
			if (root.val > p.val) {
				rs = root;
				root = root.left;
			} else
				root = root.right;
		}
		return rs;

	}

}
