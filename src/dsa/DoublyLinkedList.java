package dsa;


class DoubleNode {
	Integer data;
	DoubleNode prev;
	DoubleNode next;
	
	DoubleNode(Integer data) {
		this.data = data;
		prev = null;
		next = null;
	}
}

public class DoublyLinkedList {
	
	public static void main(String[] args) {
		DoubleNode head = new DoubleNode(10);
		DoubleNode temp1 = new DoubleNode(20);
		DoubleNode temp2 = new DoubleNode(30);
		
		
		
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		
		head = insertAtBegin(head, 5);
		
		head = insertAtEng(head, 15);
		
		head = insertAtEng(head, 15);
		
		head = reverseDoublyLinkList();
		

	}

	private static DoubleNode reverseDoublyLinkList() {
		
		
		return null;
	}

	private static DoubleNode insertAtEng(DoubleNode head, Integer i) {
		if(i == null) {
			return head;
		}
		
		if(head == null) {
			return new DoubleNode(i);
		}
		DoubleNode temp = new DoubleNode(i);
		
		DoubleNode curr = head;
		
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		temp.prev = curr;
		return head;
	}

	private static DoubleNode insertAtBegin(DoubleNode head, Integer i) {
		if(i == null) {
			return head;
		}
		DoubleNode t = new DoubleNode(i);
		t.next = head;
		if(head != null) {
			head.prev = t;
		}
		return t;
	}

}
