package leetcode.singlelinkedList;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		ListNode n1 = new ListNode(0);
		ListNode n2 = new ListNode(0);
		ListNode n3 = new ListNode(0);
		ListNode n4 = new ListNode(0);
		ListNode n5 = new ListNode(0);
		ListNode n6 = new ListNode(0);
		ListNode n7 = new ListNode(1);
		
		//[9,9,9,9,9,9,9], l2 = [9,9,9,9]
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		ListNode n8 = new ListNode(0);
		ListNode n9 = new ListNode(0);
		ListNode n10 = new ListNode(0);
		ListNode n11 = new ListNode(1);
		n8.next = n9;
		n9.next = n10;
		n10.next = n11;
		ListNode nss = add(n1, n8);
		print(nss);
	}
	
	
	
	private static ListNode add(ListNode l1, ListNode l2) {
		Integer len1 = 0;
		Integer len2 = 0;
		ListNode t1 = l1;
		while(t1 != null) {
			len1 += 1;
			t1 = t1.next;
		}
		ListNode t2 = l2;
		while(t2 != null) {
			len2 += 1;
			t2 = t2.next;
		}
		ListNode ml = l1;
		ListNode nl = l2;
		if(len2 > len1) {
			ml = l2;
			nl = l1;
		}
		Integer carry = 0;
		ListNode sumList = new ListNode();
		ListNode s1 = sumList;
		while(nl != null) {
			ListNode temp = new ListNode();
			temp.val = nl.val;
			Integer i = (temp.val + carry + ml.val);
			temp.val = i % 10;
			carry = i / 10;
			s1.next = temp;
			s1 = s1.next;
			nl = nl.next;
			ml = ml.next;
		}
		while(ml != null) {
			ListNode temp = new ListNode();
			Integer i = (carry + ml.val);
			temp.val = i % 10;
			carry = i / 10;
			s1.next = temp;
			s1 = s1.next;
			ml = ml.next;
		}
		if(carry != 0) {
			ListNode carryNode = new ListNode();
			carryNode.val = carry;
			carryNode.next = null;
			s1.next = carryNode;
		}
		return sumList.next;
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
