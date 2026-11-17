
import java.util.Scanner;

public class SinglyLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head = null;

    void insertBeginning(int value) {

        Node newNode = new Node(value);

        newNode.next = head;
        head = newNode;
    }

    void insertEnd(int value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void delete(int value) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == value) {
            head = head.next;
            System.out.println(value + " deleted");
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Element not found");
        } else {
            temp.next = temp.next.next;
            System.out.println(value + " deleted");
        }
    }

    void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SinglyLinkedList list = new SinglyLinkedList();

        int choice;

        do {
            System.out.println("\n1. Insert Beginning");
            System.out.println("2. Insert End");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");

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
                    list.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
