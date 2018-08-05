
public class Test2_1 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = null;
		ListNode temp1 = l1, temp2 = l2,temp = result;
		int plus = 0;
		
		while (temp1 != null || temp2 != null) {
			int i1 = 0, i2 = 0, a;
			if (isnull(temp1))
				i1 = 0;
			else
				i1 = temp1.val;
			if (isnull(temp2))
				i2 = 0;
			else
				i2 = temp2.val;
			a = i1 + i2 + plus;
			if (a >= 10) {
				plus = 1;
				a = a % 10;
			} else {
				plus = 0;
				a = a % 10;
			}
			temp = new ListNode(a);
			temp = temp.next;
			
			if (!isnull(temp1))
				temp1 = temp1.next;
			if (!isnull(temp2))
				temp2 = temp2.next;
			
		}
		if(plus == 1) {
			temp = new ListNode(1);
		}
		return result;

	}

	private boolean isnull(ListNode l) {
		if (l != null)
			return false;
		else
			return true;
	}
}
