package leetcode.singlelinkedList;

public class MergeNodesBetweenZeroes {

	public static void main(String[] args) {
		
		ListNode n1 = new ListNode(0);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(0);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(3);
		ListNode n6 = new ListNode(3);
		ListNode n7 = new ListNode(0);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		ListNode nss = merge(n1);
		print(nss);
	}
	
	private static ListNode merge(ListNode head) {
		if(head == null) {
			return null;
		}
		ListNode ln = head.next;
		Integer sum = 0;
		ListNode newNode = new ListNode();
		ListNode sumNode = newNode;
		while (ln != null) {
			if(ln.val != 0) {
				sum += ln.val;
			} else {
				ListNode tempNode = new ListNode();
				tempNode.val = sum;
				sumNode.next = tempNode;
				sumNode = sumNode.next;
				sum = 0;
			}
			ln = ln.next;
		}
		
		return newNode.next;
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
