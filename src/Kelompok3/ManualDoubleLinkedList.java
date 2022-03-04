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
        
        System.out.println();
	if(DL.find(2)) {
		System.out.println("Data ditemukan");
	}
	else {
		System.out.println("Data tidak ditemukan");
	}
    }
}
