import java.util.ArrayList;
import java.util.List;

public class Test257 {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> rs = new ArrayList();
		if (root == null)
			return rs;
		search(root, "", rs);
		return rs;
	}

	private void search(TreeNode root, String path, List<String> rs) {
		int len = 0;
		String temp = root.val + "";
		if (root.left == null && root.right == null) {
			if (path.equals(""))
				path = temp;
			else
				path = path + "->" + temp;
			rs.add(path);
			path = path.substring(0, Math.max(0, path.length() - 2 - temp.length()));
			return;
		}
		if (path.equals(""))
			path = temp;
		else
			path = path + "->" + temp;
		if (root.left != null) {
			search(root.left, path, rs);
		}
		if (root.right != null) {
			search(root.right, path, rs);
		}
		path = path.substring(0, Math.max(0, path.length() - 2 - temp.length()));
	}
}
