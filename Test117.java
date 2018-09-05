import java.util.LinkedList;
import java.util.Queue;

public class Test117 {
	public void connect(TreeLinkNode root) {
		if (root == null)
			return;
		Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
		queue.add(root);
		int count = 0, boundNow = 1,boundNext = 0;
		while(!queue.isEmpty()) {
			TreeLinkNode temp = queue.poll();
			if(++count ==boundNow) {
				temp.next = null;
				if(temp.left!=null){
					queue.add(temp.left);
					boundNext++;
				}
				if(temp.right!=null) {
					queue.add(temp.right);
					boundNext++;
				}
				boundNow = boundNext;
				boundNext = 0;
				count = 0;
			}else {
				temp.next = queue.peek();
				if(temp.left!=null){
					queue.add(temp.left);
					boundNext++;
				}
				if(temp.right!=null) {
					queue.add(temp.right);
					boundNext++;
				}
			}
		}
	}
}
