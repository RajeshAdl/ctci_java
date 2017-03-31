package library;

public class LinkedList {
	public int data;
	public LinkedList next = null;
	
	LinkedList(int data) {
		this.data = data;
	}
	
	public static LinkedList buildList(int[] a) {
		if(a == null || a.length == 0)
			return null;
		LinkedList n = new LinkedList(a[0]);
		LinkedList head = n;
		for(int i=1; i<a.length; i++) {
			n.next = new LinkedList(a[i]);
			n = n.next;
		}
		return head;
	}
	
	public static void printList(LinkedList n) {
		while(n.next != null) {
			System.out.printf(n.data+ "->");
			n = n.next;
		}
		System.out.println("null");
	}
}
