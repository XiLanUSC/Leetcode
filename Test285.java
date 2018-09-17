
public class Test285 {
	public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
		if (root == null)
			return null;
		if (p.val == root.val) {
			if (root.right != null)
				return root.right;
			else
				return null;
		}
		if (p.val < root.val) {
			return inorder(root.left, p, root);
		} else {
			return inorder(root.right, p, root);
		}
	}

	private TreeNode inorder(TreeNode root, TreeNode p, TreeNode pre) {
		if (root.val == p.val) {
			if (root.right != null)
				return root.right;
			else {
				if (pre.val < root.val)
					return null;
				return pre;
			}
		}
		if (p.val < root.val) {
			return inorder(root.left, p, root);
		} else {
			return inorder(root.right, p, root);
		}
	}
}
