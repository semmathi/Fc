
import java.util.Scanner;

public class llQueue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node front = null;
    Node rear = null;

    void enqueue(int value) {

        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(value + " inserted");
    }

    void dequeue() {

        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Deleted: " + front.data);

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    void peek() {

        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }

    void display() {

        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;

        System.out.print("Queue: ");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        llQueue q = new llQueue();

        int choice;

        do {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    q.enqueue(sc.nextInt());
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.peek();
                    break;

                case 4:
                    q.display();
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
