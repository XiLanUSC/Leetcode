
public class Test82 {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return head;
		ListNode before = new ListNode(0);
		before.next = head;
		ListNode pos = head, pre = before;
		while (pos != null && pos.next != null) {
			// System.out.println(pos.val);
			if (pos.val == pos.next.val) {
				// pos = pos.next;
				while (pos.next != null && pos.val == pos.next.val) {
					pos = pos.next;
					// System.out.println(pre.val+" "+pos.val);
				}

				// pos = pos.next;
				pre.next = pos.next;
				pos = pos.next;
			} else {
				pos = pos.next;
				pre = pre.next;
			}
		}
		return before.next;
	}
}
