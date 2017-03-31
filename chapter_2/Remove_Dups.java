package chapter_2;

import java.util.HashSet;
import library.LinkedList;

public class Remove_Dups {
	public static void deleteDups1(LinkedList n) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedList previous = null;
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
	
	public static void deleteDups2(LinkedList n) {
		while(n != null) {
			LinkedList runner = n;
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
        LinkedList n = LinkedList.buildList(list);
        LinkedList.printList(n);
        deleteDups2(n);
        LinkedList.printList(n);
	}
}
