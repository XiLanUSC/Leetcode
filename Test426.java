import java.util.LinkedList;
import java.util.Queue;

public class Test426 {
	public Node1 treeToDoublyList(Node1 root) {
		if (root == null)
			return root;
		Node1 head = root;
		while (head.left != null)
			head = head.left;
		Queue<Node1> queue = new LinkedList<Node1>();
		midSearch(queue, root);
		Node1 pre = null, next = null, temp = null;
		while (!queue.isEmpty()) {
			temp = queue.poll();
			if (!queue.isEmpty()) {
				next = queue.peek();
				temp.right = next;
			} else {
				temp.right = head;
			}
			temp.left = pre;
			pre = temp;
		}
		head.left = temp;

		System.out.println(temp.val);
		return head;
	}

	private void midSearch(Queue queue, Node1 root) {
		if (root.left != null)
			midSearch(queue, root.left);
		queue.add(root);
		if (root.right != null)
			midSearch(queue, root.right);
	}
}
