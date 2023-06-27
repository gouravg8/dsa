/**
 * LiinkedList
 */
public class LiinkedList {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node curNode = head;
        newNode.next = curNode;
        head = newNode;
    }

    void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    void addMid(String data, int pos) {
        Node curNode = head;
        if (head == null) {
            head = curNode;
            return;
        }

        Node newNode = new Node(data);
        for (int i = 0; i < pos - 1; i++) {
            curNode = curNode.next;
        }
        newNode.next = curNode.next;
        curNode.next = newNode;
    }

    void deleteFirst() {
        Node curNode = head;
        head = curNode.next;
    }

    void deleteMid(int pos) {
        Node prevNode = head;
        if (head == null) {
            System.out.println("Already empty");
            return;
        }

        for (int i = 0; i < pos - 1; i++) {
            prevNode = prevNode.next;
        }
        prevNode.next = prevNode.next.next;
    }

    void deleteLast() {
        Node curNode = head;
        if (head == null) {
            System.out.println("Already empty");
            return;
        }

        while (curNode.next.next != null) {
            curNode = curNode.next;
        }
        curNode.next = curNode.next.next;
    }

    void printList() {
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        LiinkedList list = new LiinkedList();
        list.addFirst("suar");
        list.printList();
        System.out.println();

        list.addLast("hai.");
        list.printList();

        list.addMid("soni", 2);
        System.out.println();
        list.printList();

        System.out.println();
        list.addFirst("Gourav");
        list.printList();

        System.out.println();
        list.deleteFirst();
        list.printList();

        System.out.println();
        list.deleteMid(1);
        list.printList();

        System.out.println();
        list.deleteLast();
        list.printList();
    }
}