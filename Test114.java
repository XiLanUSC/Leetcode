
public class Test114 {
	TreeNode pre = null;

	public void flatten(TreeNode root) {
		if (root == null)
			return;
		TreeNode right = root.right;
		if (pre != null) {
			pre.left = null;
			pre.right = root;

		}
		pre = root;
		flatten(pre.left);
		flatten(right);
	}
}
