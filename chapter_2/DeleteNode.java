package chapter_2;

import library.LinkedListNode;

public class DeleteNode {
	
	public static void deleteNode(LinkedListNode n, int index) {
		while(index-->0) {
			if(n.next == null) {
				System.out.println("Can't delete this node");
				return;
			}
			n = n.next;
		}
		n.data = n.next.data;
		n.next = n.next.next;
	}
	
	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4, 5, 6, 7};
        LinkedListNode n = LinkedListNode.buildList(list);
        LinkedListNode.printList(n);
        deleteNode(n, 3);
        LinkedListNode.printList(n);
	}

}
