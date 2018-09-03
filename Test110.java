
public class Test110 {
	boolean balance = true;

	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		System.out.println(search(root));
		return balance;
	}

	private int search(TreeNode root) {
		if (balance == false)
			return 0;
		if (root.left == null && root.right == null) {
			return 1;
		}
		if (root.left == null) {
			if (Math.abs(search(root.right)) > 1)
				balance = false;

			return search(root.right) + 1;
		}
		if (root.right == null) {
			if (Math.abs(search(root.left)) > 1)
				balance = false;
			return search(root.left) + 1;
		} else {
			if (Math.abs(search(root.left) - search(root.right)) > 1)
				balance = false;
			return Math.max(search(root.left), search(root.right)) + 1;
		}
	}

}
