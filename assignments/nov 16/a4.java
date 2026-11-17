
import java.util.Scanner;
import java.util.Stack;

public class a4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<String> stack = new Stack<>();

        int choice;

        do {

            System.out.println("\n===== ENROLLMENT MENU =====");
            System.out.println("1. Enroll learner");
            System.out.println("2. Undo last enrollment");
            System.out.println("3. Show last enrollment");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter learner name: ");
                    String name = sc.nextLine();

                    stack.push(name);

                    System.out.println(name + " enrolled successfully.");
                    break;

                case 2:

                    if (stack.isEmpty()) {
                        System.out.println("Nothing to undo.");
                    } else {
                        String removed = stack.pop();
                        System.out.println("Undone: " + removed);
                    }

                    break;

                case 3:

                    if (stack.isEmpty()) {
                        System.out.println("Nothing to show.");
                    } else {
                        System.out.println(
                            "Last enrollment: " + stack.peek()
                        );
                    }

                    break;

                case 4:

                    System.out.println("Exiting program...");
                    break;

                default:

                    System.out.println("Invalid menu choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
