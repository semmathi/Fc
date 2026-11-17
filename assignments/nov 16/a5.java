
import java.util.*;


public class a5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] seats = new String[3];

        Queue<String> waitlist = new ArrayDeque<>();

        System.out.print("Enter number of learners: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter learner name: ");
            String name = sc.nextLine();

            boolean assigned = false;

            for (int j = 0; j < seats.length; j++) {

                if (seats[j] == null) {

                    seats[j] = name;
                    assigned = true;

                    System.out.println(name + " got a seat.");
                    break;
                }
            }

            if (!assigned) {

                waitlist.offer(name);

                System.out.println(name + " added to waiting list.");
            }

            System.out.println("Seats: " + Arrays.toString(seats));
            System.out.println("Waiting: " + waitlist);
        }

        System.out.print("\nEnter learner who drops out: ");
        String dropped = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < seats.length; i++) {

            if (seats[i] != null &&
                seats[i].equalsIgnoreCase(dropped)) {

                found = true;

                System.out.println(dropped + " dropped out.");

                seats[i] = null;

                if (!waitlist.isEmpty()) {

                    String nextLearner = waitlist.poll();

                    seats[i] = nextLearner;

                    System.out.println(
                        nextLearner + " got the vacant seat."
                    );

                } else {

                    System.out.println("Waitlist is empty.");
                }

                break;
            }
        }

        if (!found) {
            System.out.println("Learner not found in the batch.");
        }

        System.out.println("\nFinal Seats: " + Arrays.toString(seats));
        System.out.println("Final Waiting List: " + waitlist);

        sc.close();
    }
}
