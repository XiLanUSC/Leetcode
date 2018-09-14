import java.util.Stack;

public class Test236 {
	boolean foundp = false, foundq = false;
	Stack<TreeNode> stackp;
	Stack<TreeNode> stackq;

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode rs = null;
		stackp = new Stack<TreeNode>();
		stackq = new Stack<TreeNode>();
		preorder(root, p, q);
		if (stackp.size() > stackq.size()) {
			int len = stackq.size();
			for (int i = 0; i < len; i++) {
				TreeNode temp = stackq.pop();
				if (stackp.contains(temp))
					return temp;
			}
		} else {
			int len = stackp.size();
			for (int i = 0; i < len; i++) {
				TreeNode temp = stackp.pop();
				if (stackq.contains(temp))
					return temp;
			}
		}
		return rs;
	}

	private void preorder(TreeNode root, TreeNode p, TreeNode q) {
		if (!foundp && root.val == p.val) {
			System.out.println(root.val);
			stackp.add(root);
			foundp = true;
		} else if (!foundp) {
			// System.out.println(root.val);
			stackp.add(root);
		}
		if (!foundq && root.val == q.val) {
			stackq.add(root);
			foundq = true;
		} else if (!foundq) {
			stackq.add(root);
		}
		if (root.left != null) {
			preorder(root.left, p, q);
		}
		if (root.right != null) {
			preorder(root.right, p, q);
		}
		if (!foundp) {
			// System.out.println(stackp.peek().val);
			stackp.pop();
		}
		if (!foundq)
			stackq.pop();

	}
}
