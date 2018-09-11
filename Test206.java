
public class Test206 {
	public ListNode reverseList(ListNode head) {
		ListNode rs = new ListNode(0);
		if(head == null)return rs.next;
		ListNode temp = rs;
		get(temp,head);
		return rs.next;
	}
	private void get(ListNode rs, ListNode head) {
		if(head.next!=null){
			//ListNode temp = rs;
			get(rs,head.next);
		}
		System.out.println(head.val);
		ListNode temp = rs;
		while(temp.next!=null)temp = temp.next;
		temp.next = head;
		temp = temp.next;
		temp.next = null;
	}
}
