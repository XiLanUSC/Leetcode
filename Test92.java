
public class Test92 {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode before = new ListNode(0);
		before.next = head;
		ListNode pos = before, mark1 = new ListNode(0), mark2 = null;
		ListNode[] temp = new ListNode[n - m + 1];

		for (int i = 0; i <= n + 1; i++) {
			if (i == m - 1)
				mark1 = pos;
			if (i == n + 1)
				mark2 = pos;
			if (i >= m && i <= n)
				temp[i - m] = pos;
			if (i != n + 1)
				pos = pos.next;
		}
		pos = mark1;
		for (int i = n - m; i >= 0; i--) {
			pos.next = temp[i];
			pos = pos.next;
		}
		pos.next = mark2;

		return before.next;
	}
}
