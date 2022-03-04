package Kelompok3;

import java.util.Scanner;
import java.util.LinkedList;

//import linkedList.ManualDoubleLinkedList.Node;
//import linkedList.ManualDoubleLinkedList;

public class DoubleLinkedListKel3 {
    //START MANUAL DOUBLE LINKED LIST

    static ManualDoubleLinkedList listUser = new ManualDoubleLinkedList();

    //Jenis Linked List
    static void pilihJenisLinkedList() {
        Scanner input = new Scanner(System.in);
        String inputUser;
        System.out.println("*** DOUBLE LINKED LIST ***");
        System.out.println("1. MANUAL");
        System.out.println("2. PUSTAKA");
        System.out.println("3. KELUAR");
        System.out.print("Silahkan Pilih [1/2/3] : ");inputUser = input.next();
        switch (inputUser) {
            case "1" -> pilihOperasiManualLinkedList();
            case "2" -> System.out.println("2. PUSTAKA");
            case "3" -> System.out.println("*** PROGRAM BERAKHIR ***");
            default -> System.out.println("Nilai yang anda masukkan salah");
        }
        input.close();
    }

    //Pilih Operasi Linked List
    static void pilihOperasiManualLinkedList() {
        Scanner input = new Scanner(System.in);
        String inputUser;
        System.out.println();
        System.out.println("*** OPERASI DOUBLE LINKED LIST ***");
        System.out.println("1. Tambah Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Pencarian/Pengubahan Data");
        System.out.println("4. Kembali");
        System.out.print("Silahkan Pilih [1/2/3/4] : ");inputUser = input.next();
        System.out.println();
        switch (inputUser) {
            case "1" -> pilihOperasiTambahData();
            case "2" -> pilihOperasiHapusData();
            case "3" -> pilihOperasiCariUbahData();
            case "4" -> pilihJenisLinkedList();
            default -> System.out.println("Nilai yang anda masukkan salah");
        }

        input.close();
    }

    //Operasi Manual Linked List
    //Function Operasi Data
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
            case "4" -> cetakDataUser("tambah");
            case "5" -> {
                pilihOperasiManualLinkedList();
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
        System.out.println("4. Cetak Data");
        System.out.println("5. Kembali");
        System.out.print("Silahkan Pilih [1/2/3/4] : ");inputUser = input.next();
        switch (inputUser) {
            case "1" -> hapusDataAwal();
            case "2" -> hapusDataTengah();
            case "3" -> hapusDataAkhir();
            case "4" -> cetakDataUser("hapus");
            case "5" -> pilihOperasiManualLinkedList();
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
            case "3" -> pilihOperasiManualLinkedList();
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
            if(!dataUser.equalsIgnoreCase("q")) {
//                listUser.setFirst(Integer.parseInt(dataUser));
            }
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
            if(!dataUser.equalsIgnoreCase("q")) {
//                listUser.setMiddle(Integer.parseInt(dataUser));
            }
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
            if(!dataUser.equalsIgnoreCase("q")) {
//                listUser.setEnd(Integer.parseInt(dataUser));
            }
            jumlahData++;
        }
        pilihOperasiTambahData();
    }

    //Fungsi Hapus Data
    //Hapus Data Awal
    static void hapusDataAwal() {
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
        pilihOperasiHapusData();
    }
    //Hapus Data Tengah
    static void hapusDataTengah() {
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
        pilihOperasiHapusData();
    }
    //Hapus Data Akhir
    static void hapusDataAkhir() {
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
        pilihOperasiHapusData();
    }

    //Fungsi Cari Data
    static void cariDataManual() {
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
        pilihOperasiCariUbahData();
    }
    //Fungsi Ganti Data
    static void gantiDataManual() {
        Scanner input = new Scanner(System.in);
        String dataGanti = "";
        Integer nilaiBaru;
        boolean checkData;
        System.out.println();
        System.out.println("*** OPERASI MANUAL GANTI DATA DOUBLE LINKED LIST ***");
        System.out.println();
        System.out.print("Info : ");
        System.out.println(" - Masukkan Data ke Berapa Yang Ingin Diganti dan Angka Penggantinya");
        System.out.println("        - Masukkan huruf 'q' untuk kembali ke menu sebelumnya");
        System.out.println();
        while(!dataGanti.equalsIgnoreCase("q")) {
            System.out.print("Masukkan Data Keberapa yang ingin diganti : ");dataGanti = input.next();
            if(!dataGanti.equalsIgnoreCase("q")) {
                System.out.print("Masukkan Nilai Baru : ");nilaiBaru = input.nextInt();
//                checkData = listUser.replaceData(Integer.parseInt(dataGanti),nilaiBaru);
//                if(checkData) {
//                    System.out.println();
//                    System.out.println("** Data Berhasil Di Ganti **");
//                    System.out.println();
//                }else {
//                    System.out.println();
//                    System.out.println("!! Maaf data yang anda cari tidak ditemukan dan tidak dapat diganti !!");
//                    System.out.println();
//                }
            }
        }
        pilihOperasiCariUbahData();
    }

    //END MANUAL DOUBLE LINKED LIST

    //START PUSTAKA DOUBLE LINKED LIST

    //END PUSTAKA DOUBLE LINKED LIST

    //Fungsi Cetak Data
    static void cetakDataUser(String tipe) {
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
            pilihOperasiTambahData();
        }else if(tipe.equalsIgnoreCase("hapus")) {
            pilihOperasiHapusData();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//       pilihJenisLinkedList();
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
