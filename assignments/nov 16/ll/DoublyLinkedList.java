
import java.util.Scanner;

public class DoublyLinkedList {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    Node head = null;
    Node tail = null;

    void insertBeginning(int value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void insertEnd(int value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void delete(int value) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Element not found");
            return;
        }

        if (temp == head) {
            head = head.next;
        } else {
            temp.prev.next = temp.next;
        }

        if (temp == tail) {
            tail = tail.prev;
        } else {
            temp.next.prev = temp.prev;
        }

        if (head != null) {
            head.prev = null;
        }

        if (tail != null) {
            tail.next = null;
        }

        System.out.println(value + " deleted");
    }

    void displayForward() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        System.out.print("Forward: ");

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    void displayBackward() {

        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = tail;

        System.out.print("Backward: ");

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DoublyLinkedList list = new DoublyLinkedList();

        int choice;

        do {
            System.out.println("\n1. Insert Beginning");
            System.out.println("2. Insert End");
            System.out.println("3. Delete");
            System.out.println("4. Display Forward");
            System.out.println("5. Display Backward");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    list.insertBeginning(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    list.insertEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter value to delete: ");
                    list.delete(sc.nextInt());
                    break;

                case 4:
                    list.displayForward();
                    break;

                case 5:
                    list.displayBackward();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);

        sc.close();
    }
}
