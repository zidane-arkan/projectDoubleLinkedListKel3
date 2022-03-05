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
    public void printList(boolean asc){
        Node n = null;
        
        if(asc){
            n = head;
        }
        else{
            n = tail;
        }
        System.out.print("[ ");
        
	while(n != null) {
              System.out.print(n.nilaiData + " ");	
              if(asc){
                   n = n.nextAddress;
              }
              else{
                   n = n.prevAddress;	
              }
	}
        System.out.println("]");
    }
    
    public boolean find(int nilaiData) {
	boolean cari = false;
	Node n = head;
	while(n != null) {
		if(n.nilaiData == nilaiData) {
			cari = true;
			break;
		}
		n = n.nextAddress;
	}
	return cari;
    }

    public void hapusAwal() {
	Node node = head.nextAddress;
	node.prevAddress = null;
	head = node;
     }

    public void hapusTengah(Node node) {
    Node last = head;
	while(last.nextAddress != null) {
		if(last.nextAddress == node) {
			last.nextAddress = node.nextAddress;
			node.nextAddress.prevAddress = last;
			break;
		}
		last = last.nextAddress;
	     }
     }
    public void hapusAkhir() {
	    Node node = tail.prevAddress;
	    node.nextAddress = null;
	    tail = node;
     }
}
