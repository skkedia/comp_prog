package leetcode.singlelinkedList;


public class RemoveDuplicateElementsV2 {
	
	private static ListNode removeDuplicateElementsV2(ListNode head) {
		ListNode curr = new ListNode(0, head);
		ListNode temp = curr;
		while (head != null) {
			if(head.next != null && head.val == head.next.val) {
				while (head.next != null && head.val == head.next.val) {
					head = head.next;
				}
				temp.next = head.next;
			} else {
				temp = temp.next;
			}
			head = head.next;
		}
		return curr.next;
	}
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(4);
		ListNode n6 = new ListNode(4);
		ListNode n7 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		ListNode nss = removeDuplicateElementsV2(n1);
		print(nss);
	}
	static void print(ListNode n) {
		if(n == null) {
			return;
		}
		System.out.println(n.val);
		n = n.next;
		print(n);
	}


}
