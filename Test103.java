import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Test103 {
	boolean done = false;

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> rs = new ArrayList();
		Stack<TreeNode> s = new Stack();
		s.push(root);

		while (!done) {
			s = getStackRev(rs, s);
			s = getStack(rs, s);
		}
		return rs;
	}

	private Stack<TreeNode> getStack(List<List<Integer>> rs, Stack<TreeNode> stack) {
		Stack<TreeNode> s = new Stack();
		List<Integer> temp = new ArrayList();
		int count = 0;
		boolean exist = false;
		for (TreeNode node : stack) {
			temp.add(node.val);
			exist = true;
			if (node.left != null) {
				s.push(node.left);
				System.out.println(node.left.val);
				count++;
			}
			if (node.right != null) {
				s.push(node.right);
				count++;
			}
		}
		if (count == 0)
			done = true;
		if(exist)
			rs.add(temp);
		return s;
	}

	private Stack<TreeNode> getStackRev(List<List<Integer>> rs, Stack<TreeNode> stack) {
		Stack<TreeNode> s = new Stack();
		List<Integer> temp = new ArrayList();
		int count = 0;
		boolean exist = false;
		for (TreeNode node : stack) {
			temp.add(node.val);
			exist = true;
			if (node.right != null) {
				s.push(node.right);
				count++;
			}
			if (node.left != null) {
				s.push(node.left);
				count++;
			}
		}
		if (count == 0)
			done = true;
		if(exist)
			rs.add(temp);

		return s;
	}
}
