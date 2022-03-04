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
			node.next.prevAddress = last;
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
    public static void main(String[] args){
        ManualDoubleLinkedList DL = new ManualDoubleLinkedList();
        boolean asc = true;
        
        DL.head = new Node(1);
        Node dua = new Node(2);
        Node tiga = new Node(3);
        
        DL.head.nextAddress = dua;
        dua.prevAddress = DL.head;
        dua.nextAddress = tiga;
        tiga.prevAddress = dua;
        DL.tail = tiga;
        
        System.out.print("Cetak data: ");
	DL.printList(asc);
        
	DL.hapusAwal();
	System.out.print("Data setelah dilakukan Operasi Penghapusan Data Awal: ");
	DL.printList(asc);
		
	DL.hapusTengah(tiga);
	System.out.print("Data setelah dilakukan Operasi Penghapusan Data Tengah: ");
	DL.printList(asc);
		
	DL.hapusAkhir();
	System.out.print("Data setelah dilakukan Operasi Penghapusan Data Akhir: ");
	DL.printList(asc);
	    
        System.out.println();
	if(DL.find(2)) {
		System.out.println("Data ditemukan");
	}
	else {
		System.out.println("Data tidak ditemukan");
	}
    }
}
