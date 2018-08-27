
public class Test86_2 {
	public ListNode partition(ListNode head, int x) {
		ListNode head1 = new ListNode(0),head2= new ListNode(0);
		ListNode pos = head, pos1 = head1,pos2 = head2;
		while(pos!=null) {
			if(pos.val<x) {
				pos1.next = new ListNode(pos.val);
				pos1 = pos1.next;
				pos = pos.next;
			}else {
				pos2.next = new ListNode(pos.val);
				pos2 = pos2.next;
				pos = pos.next;
			}
		}
		ListNode temp = head1;
		while(temp.next!= null) {
			temp = temp.next;
		}
		temp.next = head2.next;
		return head1.next;
		
	}
}
