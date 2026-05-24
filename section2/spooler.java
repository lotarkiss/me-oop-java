package section2;
import java.util.Scanner;
import java.util.ArrayDeque;

public class spooler {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> tasks = new ArrayDeque<String>();

        while (true) {
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. View tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    tasks.addLast(task);
                    break;
                case 2:
                    if (!tasks.isEmpty()) {
                        String removedTask = tasks.removeFirst();
                        System.out.println("Removed task: " + removedTask);
                    } else {
                        System.out.println("No tasks to remove.");
                    }
                    break;
                case 3:
                    if (!tasks.isEmpty()) {
                        System.out.println("Tasks:");
                        for (String t : tasks) {
                            System.out.println("- " + t);
                        }
                    } else {
                        System.out.println("No tasks to display.");
                    }
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }   
    }    
}
