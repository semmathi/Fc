
import java.util.Scanner;

public class ArrayQueue {

    int[] queue;
    int front, rear, size, capacity;

    ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int value) {

        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;

        System.out.println(value + " inserted");
    }

    void dequeue() {

        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Deleted: " + queue[front]);

        front = (front + 1) % capacity;
        size--;
    }

    void peek() {

        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

    void display() {

        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayQueue q = new ArrayQueue(5);

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
