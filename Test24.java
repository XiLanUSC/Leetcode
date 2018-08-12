
public class Test24 {
	public static ListNode swapPairs(ListNode head) {
		ListNode p = head;
		if (head == null || head.next == null)
			return head;
		ListNode temp = p.next;
		p.next = p.next.next;
		temp.next = p;
		head = temp;
		p = p.next;
		ListNode temp2 = head.next;
		while(p!=null&&p.next!=null) {
			temp = p.next;
			p.next = p.next.next;
			temp2.next = temp;
			temp.next = p;
			p = p.next;
			temp2 = temp2.next.next;
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		swapPairs(head);
	}

}
