
public class Test129 {
	public int sumNumbers(TreeNode root) {
		if (root == null)
			return 0;
		return preOrder(0, root);
	}

	private int preOrder(int sum, TreeNode root) {
		if (root.left == null && root.right == null) {
			return sum * 10 + root.val;
		}
		sum = sum * 10 + root.val;
		int temp = 0;
		if (root.left != null) {
			temp += preOrder(sum, root.left);
		}
		if (root.right != null) {
			temp += preOrder(sum, root.right);
		}
		return temp;
	}
}
