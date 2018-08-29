import java.util.ArrayList;
import java.util.List;

public class Test94 {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> rs = new ArrayList();
		if (root == null)
			return rs;
		TreeNode pos = root;
		inorder(rs, pos);
		return rs;
	}

	private void inorder(List<Integer> rs, TreeNode pos) {
		if (pos.left != null)
			inorder(rs, pos.left);
		rs.add(pos.val);
		if (pos.right != null)
			inorder(rs, pos.right);
	}
}
