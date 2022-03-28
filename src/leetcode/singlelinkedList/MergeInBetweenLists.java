package leetcode.singlelinkedList;

public class MergeInBetweenLists {
	
	public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode s1 = list1;
        ListNode s2 = new ListNode();
        for(int i = 0; i < a - 1; i++) {
            s1 = s1.next;
        }
        s2 = list1;
        for (int i = 0; i < b + 1; i++) {
            s1 = s1.next;
        }
        while(list2 != null) {
            s1.next = list2;
            list2 = list2.next;
        }
        s1.next = s2;
        return s1;
        
    }

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		ListNode n7 = new ListNode(7);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		
		ListNode n8 = new ListNode(1);
		ListNode n9 = new ListNode(10);
		ListNode n0 = new ListNode(411);
		n8.next = n9;
		n9.next = n0;
		ListNode nss = mergeInBetween(n1, 1, 3, n8);
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
