import java.util.ArrayList;
import java.util.List;

public class Test113 {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> rs = new ArrayList();
		List<Integer> temp = new ArrayList();
		if (root == null)
			return rs;
		getSum(rs, temp, root, sum, 0);
		return rs;
	}

	private void getSum(List<List<Integer>> rs, List<Integer> temp, TreeNode root, int target, int sumNow) {
		if (root.left == null && root.right == null)
			if (target == sumNow + root.val) {
				temp.add(root.val);
				rs.add(new ArrayList(temp));
				temp.remove(temp.size()-1);
			} else {
				return;
			}
		sumNow += root.val;
		temp.add(root.val);
		boolean rsLeft = false, rsRight = false;
		if (root.left != null) {
			getSum(rs, temp, root.left, target, sumNow);
		}
		if (root.right != null) {
			getSum(rs, temp, root.right, target, sumNow);
		}
		sumNow -= root.val;
		temp.remove(temp.size() - 1);
	}
}
