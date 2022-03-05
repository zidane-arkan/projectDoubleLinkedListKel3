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
	public void setFirst(int dataAwal) { //Berikan While untuk mengulangi penmabhana data agar data bisa otomatis
		Node newData = new Node(dataAwal);
		if(head != null) {
			newData.nextAddress = head;
			head.prevAddress = newData;
			head = newData;
		}else {
			head = newData;
			tail = newData;
		}
	}
	public void setMiddle(int dataTengah) {
		Node nodeTengah = new Node(dataTengah);
		int panjangList = length();
//		System.out.println(panjangList);
		if(head == null && tail == null) {
			head = tail = nodeTengah;
			head.prevAddress = null;
			tail.nextAddress = null;
		}else {
			try {
				Node nodeNow = head;
				if(nodeNow != null) {
					Node temp = null;
					int midNode = (panjangList  % 2 == 0) ? (panjangList / 2) : ((panjangList + 1)/2);
					for(int i = 1; i < midNode; i++) {
						nodeNow = nodeNow.nextAddress;
					}

					temp = nodeNow.nextAddress;
					temp.prevAddress = nodeNow;

					nodeNow.nextAddress = nodeTengah;
					nodeTengah.prevAddress = nodeNow;
					nodeTengah.nextAddress = temp;
					temp.prevAddress = nodeTengah;
				}else {
					nodeNow = tail;
					Node temp = null;
					int midNode = (panjangList  % 2 == 0) ? (panjangList / 2) : ((panjangList + 1)/2);

					for(int i = 1; i < midNode; i++) {
						nodeNow = nodeNow.prevAddress;
					}

					temp = nodeNow.prevAddress;
					temp.nextAddress = nodeNow;

					nodeNow.prevAddress = nodeTengah;
					nodeTengah.nextAddress = nodeNow;
					nodeTengah.prevAddress = temp;
					temp.nextAddress = nodeTengah;
				}
			}catch(Exception e) {
				setFirst(dataTengah);
			}
		}
	}
	public void setEnd(int dataAkhir) {
		Node lastData = new Node(dataAkhir);
		lastData.prevAddress = tail;
		lastData.nextAddress = null;
		if(tail != null) {
			tail.nextAddress = lastData ;
		}

		tail = lastData;
	}
	//Delete Double Linked List
	public void deleteFirst() {
		if(head != null) {
			Node firstNode = head;
			head = head.nextAddress;
			firstNode = null;
			if(head != null) {
				head.prevAddress = null;
			}
		}else {
			tail = null;
		}
	}
	public void deleteMiddle() {
		if(head != null) {
			Node currentNode = head;
			int panjangList = length();
			int middleList = (panjangList % 2 == 0) ? (panjangList / 2) : ((panjangList + 1)/2);
			for(int j = 1; j < middleList; j++) {
				currentNode = currentNode.nextAddress;
			}
			if(currentNode == head) {
				head = currentNode.nextAddress;
			}else if(currentNode == tail) {
				tail = tail.prevAddress;
			}  else {
				currentNode.prevAddress.nextAddress = currentNode.nextAddress;
				currentNode.nextAddress.prevAddress = currentNode.prevAddress;
			}
			currentNode = null;
		}
	}
	public void deleteLast() {
		Node lastNode = tail.prevAddress;
		lastNode.nextAddress = null;
		tail = lastNode;
	}
	//Pencarian Data Double Linked List (Indra)
	public int findData(int data) {
		Node cariData = head;
		int lokasiData = 0;
		while(cariData.nilaiData != data && cariData.nextAddress != null ) {
			lokasiData++;
			cariData = cariData.nextAddress;
		}
		if(cariData.nilaiData != data) {
			lokasiData = -1;
		}
		return lokasiData + 1;
	}
	//Perubahan data Double Linked List
	public boolean replaceData(int indexData, int dataReplace) {
		Node nodeReplace = head;
		boolean check = false;
		int panjangData = length();
		if(indexData <= panjangData) {
			for(int i = 0; i < panjangData; i++) {
				if((indexData-1) == i) {
					nodeReplace.nilaiData = dataReplace;
					check = true;
					break;
				}
				nodeReplace = nodeReplace.nextAddress;
			}
		}
		return check;
	}
	//Panjang Linked List
	public int length() {
		Node tempHead = this.head;
		Node tempTail = this.tail;
		int count = 0;
		if(tempHead != null) {
			while (tempHead != null) {
				count++;
				tempHead = tempHead.nextAddress;
			}
		}else {
			while (tempTail != null) {
				count++;
				tempTail = tempTail.prevAddress;
			}
		}
		return count;
	}
	//Cetak Data
	public void cetakNilai() {
		Node dataCetak = head;
		Node dataTail = tail;
		if(dataCetak != null) {
			while(dataCetak != null) {
				System.out.print(dataCetak.nilaiData + " ");
				dataCetak = dataCetak.nextAddress;
			}
		}else {
			while(dataTail != null) {
				System.out.print(dataTail.nilaiData + " ");
				dataTail = dataTail.prevAddress;
			}
		}
	}
}
