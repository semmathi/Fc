
import java.util.Scanner;

public class a3 {

    static int calculateRangeSum(int[] prefix, int start, int end) {

        if (start == 1) {
            return prefix[end - 1];
        } else {
            return prefix[end - 1] - prefix[start - 2];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] attendance = new int[10];
        int[] prefix = new int[10];

        System.out.println("Enter attendance for 10 days:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            attendance[i] = sc.nextInt();

            if (attendance[i] < 0) {
                System.out.println("Attendance cannot be negative.");
                sc.close();
                return;
            }
        }

        prefix[0] = attendance[0];

        for (int i = 1; i < 10; i++) {
            prefix[i] = prefix[i - 1] + attendance[i];
        }

        System.out.print("Enter starting day: ");
        int start = sc.nextInt();

        System.out.print("Enter ending day: ");
        int end = sc.nextInt();

        if (start < 1 || end > 10 || start > end) {
            System.out.println("Invalid range!");
        } else {
            int total = calculateRangeSum(prefix, start, end);

            System.out.println(
                "Total attendance from Day " + start +
                " to Day " + end + ": " + total
            );
        }

        int max = attendance[0];
        int maxDay = 1;

        for (int i = 1; i < 10; i++) {
            if (attendance[i] > max) {
                max = attendance[i];
                maxDay = i + 1;
            }
        }

        System.out.println("Highest attendance: " + max);
        System.out.println("Highest attendance was on Day " + maxDay);

        sc.close();
    }
}
