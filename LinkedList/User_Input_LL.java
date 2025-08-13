package linkedlist;
import java.util.Scanner;

public class User_Input_LL {

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
        User_Input_LL l1 = new User_Input_LL();
        Scanner sc = new Scanner(System.in);
        System.out.println("----LinkedList Operations----");
        while (true) {
            System.out.println("\nEnter Option To: ");
            System.out.println("1. Add Item at Start\n2. Add Item at Last\n3. Delete Item From Start\n4. Delete Item From End\n5. To Display List");
            System.out.println("6. To Exit\n");
            int item;
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Number: ");
                    item = sc.nextInt();
                    l1.addFirst(item);
                    break;
                case 2:
                    System.out.println("Enter Number: ");
                    item = sc.nextInt();
                    l1.addLast(item);
                    break;
                case 3:
                    l1.deleteFirst();
                    break;
                case 4:
                    l1.deleteLast();
                    break;
                case 5:
                    l1.displayList();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Wrong Option!");
            }
        }

    }
}
