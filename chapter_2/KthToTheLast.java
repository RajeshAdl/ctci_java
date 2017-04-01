package chapter_2;

import library.LinkedListNode;

public class KthToTheLast {
	
	public static class Index {
		public int value = 0;
	}
	
	public static void printKthFromLast1(LinkedListNode n, int index) {
		int len = LinkedListNode.length(n);
		index = len - index;
		if(index < 0) {
			System.out.println("Invalid index");
			return;
		}
		while(index > 0) {
			n = n.next;
			index--;
		}
		System.out.println(n.data);
	}
	
	public static void printKthFromLast2(LinkedListNode n, int index) {
		LinkedListNode head = n;
		for(int i=0; i<index; i++) {
			if(n == null) {
				System.out.println("Invalid index");
				return;
			}
			n = n.next;
		}
		while(n != null) {
			n = n.next;
			head = head.next;
		}
		System.out.println(head.data);
	}
	
	public static LinkedListNode KthFromLast3(LinkedListNode n, int index) {
		Index val = new Index();
		return KthFromLast3_Helper(n, index, val);
	}
	
	public static LinkedListNode KthFromLast3_Helper(LinkedListNode n, int index, Index idx) {
		if(n == null) {
			return null;
		}
		
		LinkedListNode node = KthFromLast3_Helper(n.next, index, idx);
		idx.value = idx.value + 1;
		if(idx.value == index) {
			return n;
		}
		return node;
	}
	
	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4, 5, 6, 7};
		LinkedListNode n = LinkedListNode.buildList(list);
		LinkedListNode.printList(n);
		printKthFromLast1(n, 5);
		printKthFromLast2(n, 5);
		LinkedListNode result = KthFromLast3(n, 5);
		System.out.println(result.data);
	}

}
