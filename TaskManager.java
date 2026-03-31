import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

    static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Task Manager ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task Completed");
            System.out.println("4. Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter task title: ");
                    String title = sc.nextLine();
                    tasks.add(new Task(title));
                    break;

                case 2:
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(i + ". " + tasks.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Enter task number: ");
                    int index = sc.nextInt();
                    tasks.get(index).markCompleted();
                    break;
            }

        } while (choice != 4);

        sc.close();
    }
}
