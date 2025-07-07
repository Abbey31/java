import java.util.Scanner;

public class ToDoList {
  public static void main(String[] args) {
    // Create a Scanner object to read user input
    Scanner input = new Scanner(System.in);

    // Create a fixed-size array to store tasks
    String[] taskList = new String[10];

    // Initialize a variable to keep track of the current task index
    int taskIndex = 0;

    // Loop until the user chooses to exit
    while (true) {
      // Display the menu options
      System.out.println("1: Add Task ");
      System.out.println("2: Remove Task ");
      System.out.println("3: View Tasks ");
      System.out.println("4: Exit ");

      // Read the user's choice
      int choice = input.nextInt();
      input.nextLine(); // Consume the newline character

      // Handle the user's choice
      switch (choice) {
        case 1 -> {
            // Add a new task
            System.out.print("Enter task: ");
            String task = input.nextLine();
            if (taskIndex < taskList.length) {
                taskList[taskIndex] = task;
                taskIndex++;
            } else {
                System.out.println("Task list is full!");
            } }
        case 2 -> {
            // Remove a task
            System.out.print("Enter task to remove: ");
            String taskToRemove = input.nextLine();
            for (int i = 0; i < taskIndex; i++) {
                if (taskList[i].equals(taskToRemove)) {
                    // Shift the remaining tasks to fill the gap
                    for (int j = i; j < taskIndex - 1; j++) {
                        taskList[j] = taskList[j + 1];
                    }
                    taskIndex--;
                    System.out.println("Task removed!");
                    break;
                }
            } }
        case 3 -> {
            // View tasks
            System.out.println("Tasks:");
            for (int i = 0; i < taskIndex; i++) {
                System.out.println(taskList[i]);
            } }
        case 4 -> {
            // Exit
            System.out.println("Goodbye!");
            return;
            }
        default -> System.out.println("Invalid choice. Please try again.");
      }
    }
  }
}