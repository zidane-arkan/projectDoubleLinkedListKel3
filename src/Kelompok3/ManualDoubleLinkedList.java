package Kelompok3;

public class ManualDoubleLinkedList {
    private Node head = null;
    private Node tail = null;

    public static class Node{
        int nilaiData;
        Node nextAddress;
        Node prevAddress;

        Node(int d){
            nilaiData = d;
            nextAddress = null;
            prevAddress = null;
            public void removeFirst() {
		Object head;
		Node node = head.next;
		node.prev = null;
		head = node ;
	}
	
	
	public void remove(Node node ) {
		Node last = head;
		while (last.next != null) {
			if (last.next == node) {
				last.next.prev = last;
				node.next.prev = last;
				break;
			}
			last = last.next;
		}
	}
	
	public void removeLast() {
		Node node = tail.prev;
		node.next = null;
		tail = node;
		
	}
        }
    }
}
