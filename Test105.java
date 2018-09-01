
public class Test105 {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0)return null;
		TreeNode head = build(preorder,inorder);
		return head;
	}

	private TreeNode build(int[] preorder, int[] inorder) {
		TreeNode head = new TreeNode(preorder[0]);
		int len = preorder.length;
		int i = 0;
		for (; i < len; i++) {
			if (inorder[i] == preorder[0])
				break;
		}
		if (i - 1 >= 0) {
			int[] preleft = new int[i];
			int[] inleft = new int[i];
			for (int j = 0; j < i; j++) {
				preleft[j] = preorder[j + 1];
				inleft[j] = inorder[j];
			}
			head.left = build(preleft,inleft);
		}else
			head.left = null;
		if(len-i-2>=0) {
			int[] preright = new int[len - i - 1];
			int[] inright = new int[len - i - 1];

			for (int j = 0; j < len - i - 1; j++) {
				preright[j] = preorder[i + j + 1];
				inright[j] = inorder[i + j +1];
			}
			head.right = build(preright,inright);
		}else
			head.right = null;
		return head;
	}

}
