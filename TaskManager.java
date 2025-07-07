import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        // Initialize categories (array)
        String[] categories = {"Work", "Personal", "School"};
        
        // Initialize task lists (array of ArrayLists)
        ArrayList<String>[] taskLists = new ArrayList[categories.length];
        for (int i = 0; i < categories.length; i++) {
            taskLists[i] = new ArrayList<>();
        }
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Display menu
            System.out.println("\nTask Manager");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear newline
            
            if (choice == 4) break;
            
            switch (choice) {
                case 1: // Add Task
                    System.out.println("Categories:");
                    for (int i = 0; i < categories.length; i++) {
                        System.out.println(i + ". " + categories[i]);
                    }
                    System.out.print("Enter category index: ");
                    int catIndex = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    taskLists[catIndex].add(task);
                    System.out.println("Task added!");
                    break;
                    
                case 2: // Remove Task
                    System.out.print("Enter category index: ");
                    catIndex = scanner.nextInt();
                    System.out.println("Tasks in " + categories[catIndex] + ":");
                    for (int i = 0; i < taskLists[catIndex].size(); i++) {
                        System.out.println(i + ". " + taskLists[catIndex].get(i));
                    }
                    System.out.print("Enter task index to remove: ");
                    int taskIndex = scanner.nextInt();
                    taskLists[catIndex].remove(taskIndex);
                    System.out.println("Task removed!");
                    break;
                    
                case 3: // View Tasks
                    for (int i = 0; i < categories.length; i++) {
                        System.out.println(categories[i] + ":");
                        if (taskLists[i].isEmpty()) {
                            System.out.println("  No tasks");
                        } else {
                            for (String t : taskLists[i]) {
                                System.out.println("  - " + t);
                            }
                        }
                    }
                    break;
                    
                default:
                    System.out.println("Invalid option!");
            }
        }
        scanner.close();
    }
}