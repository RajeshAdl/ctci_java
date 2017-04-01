package library;

public class LinkedListNode {
	public int data;
	public LinkedListNode next = null;
	
	LinkedListNode(int data) {
		this.data = data;
	}
	
	public static LinkedListNode buildList(int[] a) {
		if(a == null || a.length == 0)
			return null;
		LinkedListNode n = new LinkedListNode(a[0]);
		LinkedListNode head = n;
		for(int i=1; i<a.length; i++) {
			n.next = new LinkedListNode(a[i]);
			n = n.next;
		}
		return head;
	}
	
	public static int length(LinkedListNode n) {
		int length = 0;
		while(n != null) {
			n = n.next;
			length++;
		}
		return length;
	}
	
	public static void printList(LinkedListNode n) {
		while(n != null) {
			System.out.printf(n.data+ "->");
			n = n.next;
		}
		System.out.println("null");
	}
}
