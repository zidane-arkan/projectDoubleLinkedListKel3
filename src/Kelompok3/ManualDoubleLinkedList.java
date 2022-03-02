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
}
