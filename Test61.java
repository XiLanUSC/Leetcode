
public class Test61 {
	public ListNode rotateRight(ListNode head, int k) {
		if(head == null||head.next == null)return head;
		ListNode p = head;
		int count = 1;
		while(p.next!=null) {
			p = p.next;
			count++;
		}
		if(k>count) {
			k = k%count;
		}
		for(int i =0;i<k;i++) {
			head = moveHead(head);
		}
		return head;

	}
	private ListNode moveHead(ListNode head) {
		ListNode p = head;
		while(p.next.next!=null) {
			p = p.next;
		}
		p.next.next = head;
		head = p.next;
		p.next = null;
		return head;
	}
}
