
public class Test106 {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if (inorder.length == 0)
			return null;
		return build(inorder, postorder);
	}

	private TreeNode build(int[] inorder, int[] postorder) {
		int len = inorder.length;
		TreeNode head = new TreeNode(postorder[len - 1]);

		int i = 0;
		for (; i < len; i++) {
			if (inorder[i] == postorder[len - 1])
				break;
		}
		if (i - 1 >= 0) {
			int[] postleft = new int[i];
			int[] inleft = new int[i];
			for (int j = 0; j < i; j++) {
				inleft[j] = inorder[j];
				postleft[j] = postorder[j];
			}
			head.left = build(inleft, postleft);
		} else
			head.left = null;
		if (len - i - 2 >= 0) {
			int[] postright = new int[len - i - 1];
			int[] inright = new int[len - i - 1];

			for (int j = 0; j < len - i - 1; j++) {
				inright[j] = inorder[i + j + 1];
				postright[j] = postorder[i + j];
			}
			head.right = build(inright, postright);
		} else
			head.right = null;
		return head;
	}
}
