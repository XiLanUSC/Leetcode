
public class Test86 {
	public ListNode partition(ListNode head, int x) {
		if(head == null)return head;
		ListNode before = new ListNode(0);
		before.next = head;
		ListNode pre = before;
		ListNode pos = head;
		ListNode lesspre =before,less = head,greaterpre = before,greater = head;
		if(head.val>=x) {
			greaterpre = head;
			greater = head.next;
		}else {
			lesspre = head;
			less = head.next;
			greaterpre = head;
			greater = head.next;
		}
		while (pos.next != null) {
			if (pos.val < x) {
				pre.next = pos.next;
				lesspre.next = pos;
				pos.next = less;
				lesspre = lesspre.next;
				pos = pre.next;
				
			} else {
				pre.next = pos.next;
				greaterpre.next = pos;
				pos.next = greater;
				greaterpre = greaterpre.next;
				pos = pre.next;
			}
		}

		return before.next;

	}
}
