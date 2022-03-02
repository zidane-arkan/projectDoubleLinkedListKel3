package Kelompok3;

import java.util.Scanner;

//import linkedList.ManualDoubleLinkedList.Node;
//import linkedList.ManualDoubleLinkedList;

public class DoubleLinkedListKel3 {
//    static ManualDoubleLinkedList listUser = new ManualDoubleLinkedList();
    //	static ManualDoubleLinkedList getUserData() {
//		ManualDoubleLinkedList listUser = new ManualDoubleLinkedList();
//		return listUser;
//	}
    static void pilihJenisLinkedList() {
        Scanner input = new Scanner(System.in);
        String inputUser;
        System.out.println("*** DOUBLE LINKED LIST ***");
        System.out.println("1. MANUAL");
        System.out.println("2. PUSTAKA");
        System.out.println("3. KELUAR");
        System.out.print("Silahkan Pilih [1/2/3] : ");inputUser = input.next();
        switch(inputUser) {
            case "1" :
                pilihOperasiLinkedList();
                break;
            case "2" :
                System.out.println("2. PUSTAKA");
                break;
            case "3":
                System.out.println();
                System.out.println("*** PROGRAM BERAKHIR ***");
                break;
            default :
                System.out.println("Nilai yang anda masukkan salah");
        }
        input.close();
    }
    static void pilihOperasiLinkedList() {
        Scanner input = new Scanner(System.in);
        String inputUser;
        System.out.println();
        System.out.println("*** OPERASI DOUBLE LINKED LIST ***");
        System.out.println("1. Tambah Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Pencarian/Pengubahan Data");
        System.out.println("4. Kembali");
        System.out.print("Silahkan Pilih [1/2/3/4] : ");inputUser = input.next();
        switch (inputUser) {
            case "1" -> pilihOperasiTambahData();
            case "2" -> pilihOperasiHapusData();
            case "3" -> pilihOperasiCariUbahData();
            case "4" -> pilihJenisLinkedList();
            default -> System.out.println("Nilai yang anda masukkan salah");
        }
        input.close();
    }
    //Function Tambah Data
    static void pilihOperasiTambahData() {
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
            case "1" -> tambahDataAwal();
            case "2" -> tambahDataTengah();
            case "3" -> tambahDataAkhir();
            case "4" -> cetakDataUser();
            case "5" -> {
                pilihOperasiLinkedList();
                System.out.println();
            }
            default -> System.out.println("Nilai yang anda masukkan salah");
        }
        input.close();
    }
    static void pilihOperasiHapusData() {
        Scanner input = new Scanner(System.in);
        String inputUser;
        System.out.println();
        System.out.println("*** OPERASI DOUBLE LINKED LIST ***");
        System.out.println("1. Hapus Data Awal");
        System.out.println("2. Hapus Data Tengah");
        System.out.println("3. Hapus Data Akhir");
        System.out.println("4. Kembali");
        System.out.print("Silahkan Pilih [1/2/3/4] : ");inputUser = input.next();
        switch (inputUser) {
            case "1" -> System.out.println("1. Hapus Data Awal");
            case "2" -> System.out.println("2. Hapus Data Tengah");
            case "3" -> System.out.println("3. Hapus Data Akhir");
            case "4" -> pilihOperasiLinkedList();
            default -> System.out.println("Nilai yang anda masukkan salah");
        }
        input.close();
    }
    static void pilihOperasiCariUbahData() {
        Scanner input = new Scanner(System.in);
        String inputUser;
        System.out.println();
        System.out.println("*** OPERASI DOUBLE LINKED LIST ***");
        System.out.println("1. Pencarian Data");
        System.out.println("2. Pengubahan Data");
        System.out.println("3. Kembali");
        System.out.print("Silahkan Pilih [1/2] : ");inputUser = input.next();
        switch (inputUser) {
            case "1" -> System.out.println("1. Cari Data");
            case "2" -> System.out.println("2. Ganti Data");
            case "3" -> pilihOperasiLinkedList();
            default -> System.out.println("Nilai yang anda masukkan salah");
        }
        input.close();
    }

    //Fungsi Tambah Data
    //Tambah Awal
    static void tambahDataAwal() {
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
//            if(!dataUser.equalsIgnoreCase("q")) {
//                listUser.setFirst(Integer.parseInt(dataUser));
//            }
            jumlahData++;
        }
        pilihOperasiTambahData();
    }
    //Tambah Tengah
    static void tambahDataTengah() {
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
//            if(!dataUser.equalsIgnoreCase("q")) {
//                listUser.setMiddle(Integer.parseInt(dataUser));
//            }
            jumlahData++;
        }
        pilihOperasiTambahData();
    }
    //Tambah Akhir
    static void tambahDataAkhir() {
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
//            if(!dataUser.equalsIgnoreCase("q")) {
//                listUser.setEnd(Integer.parseInt(dataUser));
//            }
            jumlahData++;
        }
        pilihOperasiTambahData();
    }

    //Fungsi Hapus Data


    //Fungsi Cetak Data
    static void cetakDataUser() {
        Scanner input = new Scanner(System.in);
        String dataUser = "";
        System.out.println();
        System.out.println("*** CETAK DATA DOUBLE LINKED LIST ***");
        System.out.print("[");
//        listUser.cetakNilai();
        System.out.print("]");
        System.out.println();
        System.out.print("Masukkan huruf 'q' untuk kembali ke menu sebelumnya : ");dataUser = input.next();
        System.out.println();
        while(!dataUser.equalsIgnoreCase("q")) {
            System.out.print("Masukkan huruf 'q' untuk kembali ke menu sebelumnya : ");dataUser = input.next();
        }
        pilihOperasiTambahData();
    }
    public static void main(String[] args) {
        pilihJenisLinkedList();
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
