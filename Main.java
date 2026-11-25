import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     STUDENT GRADE CALCULATOR");
        System.out.println("================================");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter mark for Subject " + i + ": ");
            int mark = sc.nextInt();

            if (mark < 0 || mark > 100) {
                System.out.println("Invalid mark! Enter marks between 0 and 100.");
                sc.close();
                return;
            }

            total = total + mark;
        }

        double average = total / 5.0;

        System.out.println("\n========== STUDENT RESULT ==========");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Grade: A+");
        } else if (average >= 80) {
            System.out.println("Grade: A");
        } else if (average >= 70) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Needs Improvement");
        }

        System.out.println("====================================");

        sc.close();
    }
}