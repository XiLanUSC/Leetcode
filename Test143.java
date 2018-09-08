
public class Test143 {
	public void reorderList(ListNode head) {
		if (head == null || head.next == null) {
			return;
		}
		ListNode preMid = head, slow = head.next, fast = head.next;
		while (fast != null && fast.next != null) {
			preMid = preMid.next;
			slow = slow.next;
			fast = fast.next.next;
		}
		// System.out.println(slow.val);
		preMid.next = null;
		ListNode reverseHead = reverse(slow), temp = head;

		while (temp != null) {

			if (reverseHead == null) {
				break;
			}
			ListNode revNext = reverseHead.next;
			// System.out.println("get in"+temp.val);
			ListNode next = temp.next;
			// System.out.println(temp.val+" "+reverseHead.val+" "+next.val);
			temp.next = reverseHead;
			reverseHead.next = next;

			reverseHead = revNext;
			temp = next;

			// temp = temp.next.next;

		}

	}

	private ListNode reverse(ListNode head) {
		ListNode pre = null, temp = head, next = null;
		while (temp != null) {

			next = temp.next;
			temp.next = pre;
			pre = temp;
			temp = next;
		}
		return pre;
	}
}
