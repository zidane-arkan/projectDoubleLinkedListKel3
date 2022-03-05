package Kelompok3;

import java.util.Scanner;
import java.util.LinkedList;

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
            case "2" -> pilihOperasiPustakaLinkedList();
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
        System.out.println("*** OPERASI MANUAL DOUBLE LINKED LIST ***");
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
        System.out.println("*** OPERASI TAMBAH DATA DOUBLE LINKED LIST ***");
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
        System.out.println("*** OPERASI HAPUS DATA DOUBLE LINKED LIST ***");
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
        System.out.println("*** OPERASI CARI/UBAH DATA DOUBLE LINKED LIST ***");
        System.out.println("1. Pencarian Data");
        System.out.println("2. Pengubahan Data");
        System.out.println("3. Cetak Data");
        System.out.println("4. Kembali");
        System.out.print("Silahkan Pilih [1/2] : ");inputUser = input.next();
        switch (inputUser) {
            case "1" -> cariDataManual();
            case "2" -> gantiDataManual();
            case "3" -> cetakDataUser("cariUbah");
            case "4" -> pilihOperasiManualLinkedList();
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
                listUser.setFirst(Integer.parseInt(dataUser));
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
                listUser.setMiddle(Integer.parseInt(dataUser));
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
                listUser.setEnd(Integer.parseInt(dataUser));
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
                listUser.deleteFirst();
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
                listUser.deleteMiddle();
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
                listUser.deleteLast();
                System.out.println();
            }
        }
        pilihOperasiHapusData();
    }

    //Fungsi Cari Data
    static void cariDataManual() {
        Scanner input = new Scanner(System.in);
        String dataCari = "";
        int lokasiData;
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
                lokasiData = listUser.findData(Integer.parseInt(dataCari));
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
        Integer panjangArray = listUser.length();
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
                if(Integer.parseInt(dataGanti) <= panjangArray) {
                    System.out.print("Masukkan Nilai Baru : ");nilaiBaru = input.nextInt();
                    checkData = listUser.replaceData(Integer.parseInt(dataGanti),nilaiBaru);
                    if(checkData) {
                        System.out.println();
                        System.out.println("** Data Berhasil Di Ganti **");
                        System.out.println();
                    }else {
                        System.out.println();
                        System.out.println("!! Maaf data yang anda cari tidak ditemukan dan tidak dapat diganti !!");
                        System.out.println();
                    }
                }else {
                    System.out.println("!! DATA ANDA KURANG DARI " + Integer.parseInt(dataGanti) + " !!");
                }
            }
        }
        pilihOperasiCariUbahData();
    }

    //Fungsi Cetak Data Manual
    static void cetakDataUser(String tipe) {
        Scanner input = new Scanner(System.in);
        String dataUser = "";
        System.out.println();
        System.out.println("*** CETAK DATA DOUBLE LINKED LIST ***");
        System.out.print("[");
        listUser.cetakNilai();
        System.out.print("]");
        System.out.println();
        while(!dataUser.equalsIgnoreCase("q")) {
            System.out.print("Masukkan huruf 'q' untuk kembali ke menu sebelumnya : ");dataUser = input.next();
        }
        if(tipe.equalsIgnoreCase("tambah")) {
            pilihOperasiTambahData();
        }else if(tipe.equalsIgnoreCase("hapus")) {
            pilihOperasiHapusData();
        }else if(tipe.equalsIgnoreCase("cariUbah")) {
            pilihOperasiCariUbahData();
        }
    }
    //END MANUAL DOUBLE LINKED LIST


    //START PUSTAKA DOUBLE LINKED LIST

    //Operasi Pustaka Linked List
    static LinkedList<Integer> PustakaDoublelinkedList = new LinkedList<>();
    //Pilih Operasi Linked List
    static void pilihOperasiPustakaLinkedList() {
        Scanner input = new Scanner(System.in);
        String inputUser;
        System.out.println();
        System.out.println("*** OPERASI PUSTAKA DOUBLE LINKED LIST ***");
//        System.out.println("1. Tambah Data");
//        System.out.println("2. Hapus Data");
        System.out.println("3. Pencarian/Pengubahan Data");
        System.out.println("4. Kembali");
        System.out.print("Silahkan Pilih [1/2/3/4] : ");inputUser = input.next();
        System.out.println();
        switch (inputUser) {
//            case "1" -> pilihOperasiTambahDataPustaka();
//            case "2" -> pilihOperasiHapusDataPustaka();
            case "3" -> pilihOperasiCariUbahDataPustaka();
            case "4" -> pilihJenisLinkedList();
            default -> System.out.println("Nilai yang anda masukkan salah");
        }
        input.close();
    }

    //Function Operasi Data Pustaka
    //Tambah Data Operasi Pustaka
    static void pilihOperasiTambahDataPustaka() {
        Scanner input = new Scanner(System.in);
        String inputUser;
        System.out.println();
        System.out.println("*** OPERASI TAMBAH DATA PUSTAKA DOUBLE LINKED LIST ***");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Tengah");
        System.out.println("3. Tambah Data Akhir");
        System.out.println("4. Cetak Data");
        System.out.println("5. Kembali");
        System.out.print("Silahkan Pilih [1/2/3/4/5] : ");inputUser = input.next();
        switch (inputUser) {
//            case "1" -> tambahDataAwalPustaka();
//            case "2" -> tambahDataTengahPustaka();
//            case "3" -> tambahDataAkhirPustaka();
            case "4" -> cetakDataUserPustaka("tambahPustaka");
            case "5" -> {
                pilihOperasiPustakaLinkedList();
                System.out.println();
            }
            default -> System.out.println("Nilai yang anda masukkan salah");
        }
        input.close();
    }
    //Hapus Data Operasi Pustaka
    static void pilihOperasiHapusDataPustaka() {
        Scanner input = new Scanner(System.in);
        String inputUser;
        System.out.println();
        System.out.println("*** OPERASI PUSTAKA HAPUS DATA DOUBLE LINKED LIST ***");
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
            case "4" -> cetakDataUserPustaka("hapusPustaka");
            case "5" -> pilihOperasiPustakaLinkedList();
            default -> System.out.println("Nilai yang anda masukkan salah");
        }
        input.close();
    }
    //Cari Data Operasi Pustaka
    static void pilihOperasiCariUbahDataPustaka() {
        Scanner input = new Scanner(System.in);
        String inputUser;
        System.out.println();
        System.out.println("*** OPERASI PUSTAKA CARI/UBAH DATA DOUBLE LINKED LIST ***");
        System.out.println("1. Pencarian Data");
        System.out.println("2. Pengubahan Data");
        System.out.println("3. Cetak Data");
        System.out.println("4. Kembali");
        System.out.print("Silahkan Pilih [1/2] : ");inputUser = input.next();
        switch (inputUser) {
            case "1" -> cariDataPustaka();
            case "2" -> ubahDataPustaka();
            case "3" -> cetakDataUserPustaka("cariUbahPustaka");
            case "4" -> {
                pilihOperasiPustakaLinkedList();
                System.out.println();
            }
            default -> System.out.println("Nilai yang anda masukkan salah");
        }
        input.close();
    }

    //Method Cari Data Pustaka
    static void cariDataPustaka() {
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
            if(!cariData.equalsIgnoreCase("q")) {
                for (Integer integer : PustakaDoublelinkedList) {
                    if (integer == Integer.parseInt(cariData)) {
                        System.out.println("Data " + cariData + " ditemukan");
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    System.out.println("Data " + cariData + " tidak ditemukan");
            }else {
                pilihOperasiCariUbahDataPustaka();
            }
        }
    }
    //Method Ubah Data Pustaka
    static void ubahDataPustaka() {
        Scanner input = new Scanner(System.in);
        String ubah = "";
        System.out.println();
        System.out.println("*** OPERASI PUSTAKA UBAH DATA DOUBLE LINKED LIST ***");
        System.out.println();
        System.out.print("Info : ");
        System.out.println(" - Masukkan Data ke Berapa Yang Ingin Diganti dan Angka Penggantinya");
        System.out.println("        - Masukkan huruf 'q' untuk kembali ke menu sebelumnya");
        System.out.println();
        while(!ubah.equalsIgnoreCase("q")){
            System.out.print("Data keberapa yang ingin anda ubah? : "); ubah = input.next();
            if(!ubah.equalsIgnoreCase("q")) {
                boolean flag = false;
                if (Integer.parseInt(ubah) <= PustakaDoublelinkedList.size()) {
                    System.out.print("Masukan data baru : ");int dataBaru = input.nextInt();
                    PustakaDoublelinkedList.set((Integer.parseInt(ubah) - 1), dataBaru);
                    System.out.println();
                    System.out.println("** Data Berhasil Di Ganti **");
                    System.out.println();
                    flag = true;
                }
                if (!flag) {
                    System.out.println("Data ke - " + ubah + " tidak ada.");
                }
            }else {
                pilihOperasiCariUbahDataPustaka();
            }
        }
    }

    //Fungsi Cetak Data Pustaka
    static void cetakDataUserPustaka(String tipe) {
        Scanner input = new Scanner(System.in);
        String dataUser = "";
        System.out.println();
        System.out.println("*** CETAK DATA PUSTAKA DOUBLE LINKED LIST ***");
        System.out.println();
        System.out.print(PustakaDoublelinkedList);
        System.out.println();
        System.out.println();
        while(!dataUser.equalsIgnoreCase("q")) {
            System.out.print("Masukkan huruf 'q' untuk kembali ke menu sebelumnya : ");dataUser = input.next();
        }
        if(tipe.equalsIgnoreCase("tambahPustaka")) {
//            pilihOperasiTambahDataPustaka();
        }else if(tipe.equalsIgnoreCase("hapusPustaka")) {
//            pilihOperasiHapusDataPustaka();
        }else if(tipe.equalsIgnoreCase("cariUbahPustaka")) {
            pilihOperasiCariUbahDataPustaka();
        }
    }

    //END PUSTAKA DOUBLE LINKED LIST

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       pilihJenisLinkedList();
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
