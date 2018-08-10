
public class Test19 {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode rs = new ListNode(0);
		rs.next = head;

		ListNode p1 = head;
		ListNode p2 = rs;
		int k = 0;
		while (p1 != null) {
			k++;
			p1 = p1.next;
		}
		int temp = k-n+1;
		int pos = 1;
		while (pos != temp) {
			p2 = p2.next;
			pos++;
		}
			
		p2.next = p2.next.next;
		return rs.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
//		head.next = new ListNode(2);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);
		System.out.println(removeNthFromEnd(head,1));
	}

}
