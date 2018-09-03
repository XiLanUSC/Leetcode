
public class Test109 {
	public TreeNode sortedListToBST(ListNode head) {
		TreeNode rs = null;
		ListNode temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		int mid = count / 2;
		count = 0;
		ListNode before = new ListNode(0);
		before.next = head;
		temp = head;
		ListNode tempbef = before;
		while (temp != null && count < mid) {
			tempbef = tempbef.next;
			temp = temp.next;
			count++;
		}
		tempbef.next = null;
		if (temp == null) {
			rs = null;
		} else {
			rs = new TreeNode(temp.val);
			rs.left = sortedListToBST(head);
			rs.right = sortedListToBST(temp.next);
		}
		return rs;
	}
	public TreeNode sortedListToBST1(ListNode head) {
		TreeNode rs = null;
		ListNode temp = head;
		int count = 0;
		while (temp != null) {
            
			count++;
            
			temp = temp.next;
		}
        System.out.println(count);
        if(count == 1){
            rs = new TreeNode(head.val);
            return rs;
        }
		int mid = count / 2;
		count = 0;

		temp = head;
		while (temp != null && count < mid) {
			temp = temp.next;
			count++;
		}
		if (temp == null) {
            System.out.println("null");
            System.out.println();
			rs = null;
		} else {
			rs = new TreeNode(temp.val);
//System.out.println(temp.val);
			rs.right = sortedListToBST(temp.next);
			temp = null;
			rs.left = sortedListToBST(head);
		}
		return rs;
	}
}
