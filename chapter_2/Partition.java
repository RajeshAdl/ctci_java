package chapter_2;

import library.LinkedListNode;

public class Partition {

	public static LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode head = node;
		LinkedListNode tail = node;

		while(node != null) {
			LinkedListNode next = node.next;
			if(node.data < x) {
				node.next = head;
				head = node;
			}
			else {
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;
		return head;
	}

	public static LinkedListNode partition2(LinkedListNode node, int x) {
		LinkedListNode afterStart = null;
		LinkedListNode beforeStart = null;
		LinkedListNode afterEnd = null;
		LinkedListNode beforeEnd = null;

		while(node != null) {
			LinkedListNode next = node.next;
			if(node.data < x) {
				if(beforeStart == null) {
					beforeStart = node;
					beforeEnd = node;
				}
				else {
					beforeEnd.next = node;
					beforeEnd = node;
				}
			}
			else {
				if(afterStart == null) {
					afterStart = node;
					afterEnd = node;
				}
				else {
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			node = next;
		}

		if(beforeStart == null) {
			return afterStart;
		}
		
		beforeEnd.next = afterStart;
		return beforeStart;
	}

	public static void main(String[] args) {
		int[] a = {1, 4, 6, 7, 3, 2, 5, 9};
		LinkedListNode head = LinkedListNode.buildList(a);
		LinkedListNode.printList(head);
		head = partition(head, 4);
		LinkedListNode.printList(head);
	}
}
