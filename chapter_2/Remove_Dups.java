package chapter_2;

import java.util.HashSet;
import library.LinkedListNode;

public class Remove_Dups {
	public static void deleteDups1(LinkedListNode n) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode previous = null;
		while(n != null) {
			if(set.contains(n.data)) {
				previous.next = n.next;
			}
			else {
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}
	
	public static void deleteDups2(LinkedListNode n) {
		while(n != null) {
			LinkedListNode runner = n;
			while(runner.next != null) {
				if(runner.next.data == n.data) {
					runner.next = runner.next.next;
				}
				else {
					runner = runner.next;
				}
			}
			n = n.next;
		}
	}
	
	public static void main(String[] args) {	
		int[] list = {1,1,2,3,3,4,2,5,5};
        LinkedListNode n = LinkedListNode.buildList(list);
        LinkedListNode.printList(n);
        deleteDups2(n);
        LinkedListNode.printList(n);
	}
}
