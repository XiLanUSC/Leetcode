import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test144_2 {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> rs = new ArrayList();
		if (root == null)
			return rs;
		Stack<TreeNode> s = new Stack();
		Stack<Boolean> isLeft = new Stack();
		Stack<Boolean> isRight = new Stack();
		s.push(root);
		isLeft.push(false);
		isRight.push(false);
		while (!s.isEmpty()) {

			TreeNode temp = s.pop();

			boolean left = isLeft.pop();
			boolean right = isRight.pop();
			if (!left) {
				rs.add(temp.val);
				if (temp.left != null) {

					s.push(temp);
					isLeft.push(true);
					isRight.push(false);
					s.push(temp.left);
					isLeft.push(false);
					isRight.push(false);
				} else {
					s.push(temp);
					isLeft.push(true);
					isRight.push(false);
				}
			} else if (!right) {
				if (temp.right != null) {
					s.push(temp.right);
					isLeft.push(false);
					isRight.push(false);
				}
			}
		}
		return rs;
	}
}
