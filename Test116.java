import java.util.LinkedList;
import java.util.Queue;

public class Test116 {
	public void connect(TreeLinkNode root) {
		if (root == null)
			return;
		Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
		queue.add(root);
		int count = 0, bound = 1;
		while (!queue.isEmpty()) {
			TreeLinkNode temp = queue.poll();
			if (++count == bound) {
				temp.next = null;
				bound *= 2;
				count = 0;
			} else {
				temp.next = queue.peek();
			}
			if (temp.left != null) {
				queue.add(temp.left);
				queue.add(temp.right);
			}
		}

	}
}
