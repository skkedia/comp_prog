package linked.list;

class Node {
	Integer data = null;
	Node next = null;
	Node(Integer x) {
		this.data = x;
		this.next = null;
	}
}


public class LinkedList {

	public static void main(String[] args) {
		Node head = new Node(1);
		Node temp1 = new Node(10);
		Node temp2 = new Node(100);
		
		head.next = temp1;
		temp1.next = temp2;
		Node temp = head;
		print(temp);
		head = insertAtBeg(head, 5);
		print(head);
		head = insertAtEnd(head, 15);
		head = insertAtEnd(head, 45);
		head = insertAtEnd(head, 25);
		head = insertAtEnd(head, 35);
		head = insertAtEnd(head, 55);
		head = insertAtEnd(head, 65);
		print(head);
		
		head = deleteAtBeg(head);
		head = deleteAtBeg(head);
		print(head);
		
		head = deleteAtEnd(head);
		head = deleteAtEnd(head);
		print(head);
		
		Integer pos = searchElement(head, 35);
		
		System.out.println(pos);
		
		pos = searchElementRecusively(head, 36);
		
		pos = searchElementRecusively(head, -1);
		pos = searchElementRecusively(head, 10);
		pos = searchElementRecusively(head, 100);
		pos = searchElementRecusively(head, 45);
		head = insertAtEnd(head, -1);
		pos = searchElementRecusively(head, -1);
		
		System.out.println(pos);
		
		print(head);
		
		System.out.println(head.next.next.data);
	}
	
	private static Integer searchElementRecusively(Node head, Integer ele) {
		Integer pos = 0;
		if(head == null) {
			return -1;
		}
		pos++;
		if(head.data.equals(ele)) {
			return pos;
		}
		head = head.next;
		Integer t = searchElementRecusively(head, ele);
		return t.equals(-1) ? -1 : pos + t;
		
	}

	private static Integer searchElement(Node head, Integer ele) {
		if(head == null) {
			return -1;
		}
		Integer pos = 0;
		while(head != null) {
			pos++;
			if(head.data.equals(ele)) {
				return pos;
			}
			head = head.next;
		}
		return -1;
	}

	static Node deleteAtEnd (Node head) {
		if(head == null || head.next ==null) {
			System.out.println("NULL");
			return null;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		return head;
	}
	
	static Node deleteAtBeg (Node head) {
		if(head == null) {
			System.out.println("NULL");
			return null;
		}
		Node temp = head.next;
		head.data = null;
		head.next = null;
		return temp;
	}
	
	static Node insertAtEnd(Node head, Integer x) {
		Node temp = new Node(x);
		if(head == null) {
			return temp;
		}
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		return head;
	}
	
	static Node insertAtBeg(Node head, Integer x) {
		Node temp = new Node(x);
		temp.next = head;
		return temp;
	}
	
	static void print(Node n) {
		if(n == null) {
			return;
		}
		System.out.println(n.data);
		n = n.next;
		print(n);
	}

}
