package linkedlist;

public class Linkedlist {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            System.out.println("Inserted at First");
        } else {
            newNode.next = head;
            head = newNode;
            System.out.println("Inserted at First");
        }

    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println("Inserted at Last");
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        System.out.println("Inserted at Last");
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        } else {
            head = head.next;
            System.out.println("First Node Deleted");
        }
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.next == null) {
            head = null;
            System.out.println("Last Node Deleted");
            return;
        }

        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
        System.out.println("Last Node Deleted");
    }

    void displayList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();
        l1.addLast(2);
        l1.addLast(3);
        l1.addFirst(1);
        l1.deleteLast();
        l1.displayList();
        l1.deleteFirst();
        l1.displayList();
    }
}
