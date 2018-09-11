
public class Test206_2 {
	public ListNode reverseList(ListNode head) {
		ListNode rs = new ListNode(0);
		
		while(head!=null) {
			ListNode temp = new ListNode(head.val);
			temp.next = rs.next;
			rs.next = temp;
			head = head.next;
		}
		return rs.next;
	}
}
