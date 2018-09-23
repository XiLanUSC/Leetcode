
public class Test543 {
	int max;

	public int diameterOfBinaryTree(TreeNode root) {
		max = 0;
		return height(root);
	}

	private int height(TreeNode root) {
		if (root == null)
			return -1;
		int leftH = height(root.left);
		int rightH = height(root.right);
		int height = Math.max(leftH, rightH) + 1;
		max = Math.max(max, leftH + rightH + 2);
		return height;
	}
}
