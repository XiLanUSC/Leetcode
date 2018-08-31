
public class Test100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		else if (p == null || q == null)
			return false;
		if (p.val == q.val) {
			boolean left = true;
			boolean right = true;
			if (p.left != null && q.left != null)
				left = isSameTree(p.left, q.left);
			else if (p.left == null && q.left == null)
				left = true;
			else
				left = false;
			if (p.right != null && q.right != null)
				right = isSameTree(p.right, q.right);
			else if (p.right == null && q.right == null)
				right = true;
			else
				right = false;
			return left && right;
		} else
			return false;
	}
}
