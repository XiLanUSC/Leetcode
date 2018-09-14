
public class Test222_2 {
	public int countNodes(TreeNode root) {
		int rs = 0;
		if (root == null)
			return 0;
		int hl = 1, hr = 1;
		TreeNode left = root, right = root;
		// System.out.println(root.val);
		while (left.left != null) {
			left = left.left;
			hl++;
		}
		while (right.right != null) {
			right = right.right;
			hr++;
		}
		if (hl == hr) {
			// System.out.println(root.val+" "+((int) Math.pow(2, hl) - 1)+" "+hl);
			return (int) Math.pow(2, hl) - 1;
		}

		return 1 + countNodes(root.left) + countNodes(root.right);
	}
}
