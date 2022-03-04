package Kelompok3;

import java.util.Scanner;
import java.util.LinkedList;

//import linkedList.ManualDoubleLinkedList.Node;
//import linkedList.ManualDoubleLinkedList;

public class DoubleLinkedListKel3 {
	// static ManualDoubleLinkedList listUser = new ManualDoubleLinkedList();

    //Jenis Linked List
    static void pilihJenisLinkedList(LinkedList llist) {
        Scanner input = new Scanner(System.in);
        String inputUser;
        System.out.println("*** DOUBLE LINKED LIST ***");
        System.out.println("1. MANUAL");
        System.out.println("2. PUSTAKA");
        System.out.println("3. KELUAR");
        System.out.print("Silahkan Pilih [1/2/3] : ");inputUser = input.next();
        switch (inputUser) {
            case "1" : pilihOperasiManualLinkedList(llist);
            case "2" : pilihOperasiPustakaLinkedList(llist);
            case "3" : System.out.println("*** PROGRAM BERAKHIR ***");
            default : System.out.println("Nilai yang anda masukkan salah");
        }
        input.close();
    }

    //Pilih Operasi Linked List secara Manual
    static void pilihOperasiManualLinkedList(LinkedList llist) {
        Scanner input = new Scanner(System.in);
        String inputUser;
        System.out.println();
        System.out.println("*** OPERASI DOUBLE LINKED LIST MANUAL ***");
        System.out.println("1. Tambah Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Pencarian/Pengubahan Data");
        System.out.println("4. Kembali");
        System.out.print("Silahkan Pilih [1/2/3/4] : ");inputUser = input.next();
        System.out.println();
        switch (inputUser) {
            case "1" : pilihOperasiTambahDataManual(llist);
            case "2" : pilihOperasiHapusDataManual(llist);
            case "3" : pilihOperasiCariUbahDataManual(llist);
            case "4" : pilihJenisLinkedList(llist);
            default : System.out.println("Nilai yang anda masukkan salah");
        }

        input.close();
    }
    
    //Pilih Operasi Linked List secara Pustaka
    static void pilihOperasiPustakaLinkedList(LinkedList llist) {
        Scanner input = new Scanner(System.in);
        String inputUser;
        System.out.println();
        System.out.println("*** OPERASI DOUBLE LINKED LIST PUSTAKA ***");
        System.out.println("1. Tambah Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Pencarian/Pengubahan Data");
        System.out.println("4. Kembali");
        System.out.print("Silahkan Pilih [1/2/3/4] : ");inputUser = input.next();
        System.out.println();
        switch (inputUser) {
            case "1" : pilihOperasiTambahDataPustaka(llist);
            case "2" : pilihOperasiHapusDataPustaka(llist);
            case "3" : pilihOperasiCariUbahDataPustaka(llist);
            case "4" : pilihJenisLinkedList(llist);
            default : System.out.println("Nilai yang anda masukkan salah");
        }

        input.close();
    }

    //SOAL 2A.OPERASI MANUAL LINKED LIST
    //Function Pilih Operasi Tambah Data Manual
    static void pilihOperasiTambahDataManual(LinkedList llist) {
        Scanner input = new Scanner(System.in);
        String inputUser;
        System.out.println();
        System.out.println("*** OPERASI DOUBLE LINKED LIST ***");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Tengah");
        System.out.println("3. Tambah Data Akhir");
        System.out.println("4. Cetak Data");
        System.out.println("5. Kembali");
        System.out.print("Silahkan Pilih [1/2/3/4/5] : ");inputUser = input.next();
        switch (inputUser) {
            case "1" : tambahDataAwalManual(llist);
            case "2" : tambahDataTengahManual(llist);
            case "3" : tambahDataAkhirManual(llist);
            case "4" : cetakDataUserManual("tambah", llist);
            case "5" : {
                pilihOperasiManualLinkedList(llist);
                System.out.println();
            }
            default : System.out.println("Nilai yang anda masukkan salah");
        }
        input.close();
    }
    
    //Function Pilih Operasi Hapus Data Manual
    static void pilihOperasiHapusDataManual(LinkedList llist) {
        Scanner input = new Scanner(System.in);
        String inputUser;
        System.out.println();
        System.out.println("*** OPERASI DOUBLE LINKED LIST ***");
        System.out.println("1. Hapus Data Awal");
        System.out.println("2. Hapus Data Tengah");
        System.out.println("3. Hapus Data Akhir");
        System.out.println("4. Cetak Data");
        System.out.println("5. Kembali");
        System.out.print("Silahkan Pilih [1/2/3/4] : ");inputUser = input.next();
        switch (inputUser) {
            case "1" : hapusDataAwalManual(llist);
            case "2" : hapusDataTengahManual(llist);
            case "3" : hapusDataAkhirManual(llist);
            case "4" : cetakDataUserManual("hapus", llist);
            case "5" : pilihOperasiManualLinkedList(llist);
            default : System.out.println("Nilai yang anda masukkan salah");
        }
        input.close();
    }
    
    //Function Pilih Operasi Cari dan Ubah Data Manual
    static void pilihOperasiCariUbahDataManual(LinkedList llist) {
        Scanner input = new Scanner(System.in);
        String inputUser;
        System.out.println();
        System.out.println("*** OPERASI DOUBLE LINKED LIST ***");
        System.out.println("1. Pencarian Data");
        System.out.println("2. Pengubahan Data");
        System.out.println("3. Kembali");
        System.out.print("Silahkan Pilih [1/2] : ");inputUser = input.next();
        switch (inputUser) {
        case "1" : System.out.println("1. Cari Data"); cariDataManual(llist);
        case "2" : System.out.println("2. Ganti Data"); ubahDataManual(llist);
        case "3" : pilihOperasiManualLinkedList(llist);
        default : System.out.println("Nilai yang anda masukkan salah");
        }
        input.close();
    }
    
    //Method Cari Data Manual
    static void cariDataManual(LinkedList llist) {
        Scanner input = new Scanner(System.in);
        String dataCari = "";
        int lokasiData = 0;
        System.out.println();
        System.out.println("*** OPERASI MANUAL CARI DATA DOUBLE LINKED LIST ***");
        System.out.println();
        System.out.print("Info : ");
        System.out.println(" - Masukkan Data Angka (Integer) Yang Ingin Dicari");
        System.out.println("        - Masukkan huruf 'q' untuk kembali ke menu sebelumnya");
        System.out.println();
        while(!dataCari.equalsIgnoreCase("q")) {
            System.out.print("Masukkan Data yang ingin anda cari : ");dataCari = input.next();
            if(!dataCari.equalsIgnoreCase("q")) {
//                lokasiData = listUser.findData(Integer.parseInt(dataCari));
                if(lokasiData != 0) {
                    System.out.println();
                    System.out.println("** Data yang anda cari ada didalam Double Linked List **");
                    System.out.println();
                }else {
                    System.out.println();
                    System.out.println("!! Maaf data yang anda cari tidak ditemukan !!");
                    System.out.println();
                }
            }
        }
        pilihOperasiCariUbahDataManual(llist);
    }
    
    //Method Ubah Data Manual
    static void ubahDataManual(LinkedList llist) {
    	
    }
    
    //Fungsi Tambah Data Manual
    //Tambah Awal
    static void tambahDataAwalManual(LinkedList llist) {
        Scanner input = new Scanner(System.in);
        String dataUser = "";
        int jumlahData = 1;
        System.out.println();
        System.out.println("*** OPERASI TAMBAH DATA AWAL DOUBLE LINKED LIST ***");
        System.out.println();
        System.out.print("Info : ");
        System.out.println(" - Masukkan Data Angka ");
        System.out.println("        - Masukkan huruf 'q' untuk kembali ke menu sebelumnya");
        System.out.println();
        while(!dataUser.equalsIgnoreCase("q")) {
            System.out.print("Data ke-" + jumlahData + ": ");dataUser = input.next();
            if(!dataUser.equalsIgnoreCase("q")) {
//                listUser.setFirst(Integer.parseInt(dataUser));
            }
            jumlahData++;
        }
        pilihOperasiTambahDataManual(llist);
    }
    //Tambah Tengah
    static void tambahDataTengahManual(LinkedList llist) {
        Scanner input = new Scanner(System.in);
        String dataUser = "";
        int jumlahData = 1;
        System.out.println();
        System.out.println("*** OPERASI TAMBAH DATA TENGAH DOUBLE LINKED LIST ***");
        System.out.println();
        System.out.print("Info : ");
        System.out.println(" - Masukkan Data Angka ");
        System.out.println("        - Masukkan huruf 'q' untuk kembali ke menu sebelumnya");
        System.out.println();
        while(!dataUser.equalsIgnoreCase("q")) {
            System.out.print("Data ke-" + jumlahData + ": ");dataUser = input.next();
            if(!dataUser.equalsIgnoreCase("q")) {
//                listUser.setMiddle(Integer.parseInt(dataUser));
            }
            jumlahData++;
        }
        pilihOperasiTambahDataManual(llist);
    }
    //Tambah Akhir
    static void tambahDataAkhirManual(LinkedList llist) {
        Scanner input = new Scanner(System.in);
        String dataUser = "";
        int jumlahData = 1;
        System.out.println();
        System.out.println("*** OPERASI TAMBAH DATA AKHIR DOUBLE LINKED LIST ***");
        System.out.println();
        System.out.print("Info : ");
        System.out.println(" - Masukkan Data Angka ");
        System.out.println("        - Masukkan huruf 'q' untuk kembali ke menu sebelumnya");
        System.out.println();
        while(!dataUser.equalsIgnoreCase("q")) {
            System.out.print("Data ke-" + jumlahData + ": ");dataUser = input.next();
            if(!dataUser.equalsIgnoreCase("q")) {
//                listUser.setEnd(Integer.parseInt(dataUser));
            }
            jumlahData++;
        }
        pilihOperasiTambahDataManual(llist);
    }

    //Fungsi Hapus Data Manual
    //Hapus Data Awal
    static void hapusDataAwalManual(LinkedList llist) {
        Scanner input = new Scanner(System.in);
        String inputUser = "";
        System.out.println();
        System.out.println("*** OPERASI HAPUS DATA AWAL DOUBLE LINKED LIST ***");
        System.out.println();
        System.out.print("Info : ");
        System.out.println(" - Masukkan Y (Enter) untuk menghapus data ");
        System.out.println("        - Masukkan huruf 'q' untuk kembali ke menu sebelumnya");
        System.out.println();
        while(!inputUser.equalsIgnoreCase("q")) {
            System.out.print("Yakin Ingin Menghapus data di awal ? : ");
            inputUser = input.next();
            if(inputUser.equalsIgnoreCase("Y")) {
//                listUser.deleteFirst();
            }
        }
        pilihOperasiHapusDataManual(llist);
    }
    //Hapus Data Tengah
    static void hapusDataTengahManual(LinkedList llist) {
        Scanner input = new Scanner(System.in);
        String inputUser = "";

        System.out.println();
        System.out.println("*** OPERASI HAPUS DATA TENGAH DOUBLE LINKED LIST ***");
        System.out.println();
        System.out.print("Info : ");
        System.out.println(" - Masukkan Y (Enter) untuk menghapus data ");
        System.out.println("        - Masukkan huruf 'q' untuk kembali ke menu sebelumnya");
        System.out.println();
        while(!inputUser.equalsIgnoreCase("q")) {
            System.out.print("Yakin Ingin Menghapus data di tengah ? : ");
            inputUser = input.next();
            if(inputUser.equalsIgnoreCase("Y")) {
//                listUser.deleteMiddle();
                System.out.println();
            }
        }
        pilihOperasiHapusDataManual(llist);
    }
    //Hapus Data Akhir
    static void hapusDataAkhirManual(LinkedList llist) {
        Scanner input = new Scanner(System.in);
        String inputUser = "";

        System.out.println();
        System.out.println("*** OPERASI HAPUS DATA AKHIR DOUBLE LINKED LIST ***");
        System.out.println();
        System.out.print("Info : ");
        System.out.println(" - Masukkan Y (Enter) untuk menghapus data ");
        System.out.println("        - Masukkan huruf 'q' untuk kembali ke menu sebelumnya");
        System.out.println();
        while(!inputUser.equalsIgnoreCase("q")) {
            System.out.print("Yakin Ingin Menghapus data di akhir ? : ");
            inputUser = input.next();
            if(inputUser.equalsIgnoreCase("Y")) {
//                listUser.deleteLast();
                System.out.println();
            }
        }
        pilihOperasiHapusDataManual(llist);
    }

    //Fungsi Cetak Data Manual
    static void cetakDataUserManual(String tipe, LinkedList llist) {
        Scanner input = new Scanner(System.in);
        String dataUser = "";
        System.out.println();
        System.out.println("*** CETAK DATA DOUBLE LINKED LIST ***");
        System.out.print("[");
//        listUser.cetakNilai();
        System.out.print("]");
        System.out.println();
        while(!dataUser.equalsIgnoreCase("q")) {
            System.out.print("Masukkan huruf 'q' untuk kembali ke menu sebelumnya : ");dataUser = input.next();
        }
        if(tipe.equalsIgnoreCase("tambah")) {
            pilihOperasiTambahDataManual(llist);
        }else if(tipe.equalsIgnoreCase("hapus")) {
            pilihOperasiHapusDataManual(llist);
        }
    }

    // SOAL 2B.OPERASI PUSTAKA LINKED LIST
    //Function Pilih Operasi Tambah Data Pustaka
    static void pilihOperasiTambahDataPustaka(LinkedList llist) {
    	
    }
    
    //Function Pilih Operasi Hapus Data Pustaka
    static void pilihOperasiHapusDataPustaka(LinkedList llist) {
    	
    }
    
    //Function Pilih Operasi Cari dan Ubah Data Pustaka
    static void pilihOperasiCariUbahDataPustaka(LinkedList llist) {
        Scanner input = new Scanner(System.in);
        String inputUser;
        System.out.println();
        System.out.println("*** OPERASI DOUBLE LINKED LIST ***");
        System.out.println("1. Pencarian Data");
        System.out.println("2. Pengubahan Data");
        System.out.println("3. Kembali");
        System.out.print("Silahkan Pilih [1/2] : ");inputUser = input.next();
        switch (inputUser) {
        case "1" : System.out.println("1. Cari Data"); cariDataPustaka(llist);
        case "2" : System.out.println("2. Ganti Data"); ubahDataPustaka(llist);
        case "3" : pilihOperasiManualLinkedList(llist);
        default : System.out.println("Nilai yang anda masukkan salah");
        }
        input.close();
    }
    
    //Method Cari Data Pustaka
    static void cariDataPustaka(LinkedList llist) {
        Scanner input = new Scanner(System.in);
        String cariData = "";
        System.out.println();
        System.out.println("*** OPERASI MANUAL CARI DATA DOUBLE LINKED LIST ***");
        System.out.println();
        System.out.print("Info : ");
        System.out.println(" - Masukkan Data Angka (Integer) Yang Ingin Dicari");
        System.out.println("        - Masukkan huruf 'q' untuk kembali ke menu sebelumnya");
        System.out.println();
        while(!cariData.equalsIgnoreCase("q")) {
            System.out.print("Masukkan Data yang ingin anda cari : ");cariData = input.next();
        	boolean flag = false;
			for (int i = 0; i < llist.size(); i++) {
				if (llist.get(i).equals(cariData)) {
					System.out.println("Data " + cariData + " ditemukan");
					flag = true;
					break;
				}
			}
			if (!flag)
				System.out.println("Data " + cariData + " tidak ditemukan");
		}
		pilihOperasiCariUbahDataPustaka(llist);
	}
    
    //Method Ubah Data Pustaka
    static void ubahDataPustaka(LinkedList llist) {
    	Scanner input = new Scanner(System.in);
    	int ubah;
		System.out.print("Data keberapa yang ingin anda ubah? : ");
		ubah = input.nextInt();
		boolean flag = false;
		if (ubah <= llist.size()) {
				System.out.print("Masukan data baru : ");
				int dataBaru = input.nextInt();
				llist.set((ubah-1), dataBaru);
				flag = true;
		}
		
		if (!flag)
			System.out.println("Data ke - " + ubah + " tidak ada.");
    }
   
    //Fungsi Tambah Data Pustaka
    //Tambah Awal
    static void tambahDataAwalPustaka(LinkedList llist) {
    	
    }
    //Tambah Tengah
    static void tambahDataTengahPustaka(LinkedList llist) {
    	
    }
    //Tambah Akhir
    static void tambahDataAkhirPustaka(LinkedList llist) {
    	
    }

    //Fungsi Hapus Data Pustaka
    //Hapus Data Awal
    static void hapusDataAwalPustaka(LinkedList llist) {
    	
    }
    //Hapus Data Tengah
    static void hapusDataTengahPustaka(LinkedList llist) {
    	
    }
    //Hapus Data Akhir
    static void hapusDataAkhirPustaka(LinkedList llist) {
    	
    }
    
    //Fungsi Cetak Data Pustaka
    static void cetakDataUserPustaka(String tipe, LinkedList llist) {
        Scanner input = new Scanner(System.in);
        String dataUser = "";
        System.out.println();
        System.out.println("*** CETAK DATA DOUBLE LINKED LIST ***");
        System.out.print("[");
//        listUser.cetakNilai();
        System.out.print("]");
        System.out.println();
        while(!dataUser.equalsIgnoreCase("q")) {
            System.out.print("Masukkan huruf 'q' untuk kembali ke menu sebelumnya : ");dataUser = input.next();
        }
        if(tipe.equalsIgnoreCase("tambah")) {
            pilihOperasiTambahDataPustaka(llist);
        }else if(tipe.equalsIgnoreCase("hapus")) {
            pilihOperasiHapusDataPustaka(llist);
        }
    }
    
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	LinkedList llist = new LinkedList();
        pilihJenisLinkedList(llist);

        // TODO Auto-generated method stub
//		ManualDoubleLinkedList listUser1 = new ManualDoubleLinkedList();
//		listUser1.setMiddle(10);
//		listUser1.setMiddle(20);
//		listUser1.setMiddle(30);
//		listUser1.setMiddle(40);
//		listUser1.cetakNilai();
//		pilihJenisLinkedList() ;
//		ManualDoubleLinkedList listUser = listUser();
//		pilihJenisLinkedList();
//		listUser.head = new Node(10);
//		Node sebelas =  new Node(11);
//		Node duabelas =  new Node(12);
//		tambahDataAwal();
    }

}
