import  java.util.Scanner;
public class AirlineReservation {
  // Define the main method to run the airline reservations system
  public static void main(String[] args) {
    // Create a Scanner object to read user input
    Scanner scanner = new Scanner(System.in);

    // Define a boolean array to represent the seating chart of the plane
    // Initialize all elements to false to indicate that all seats are empty
    boolean[] seats = new boolean[10];

    // Define a variable to store the user's choice
    int choice;

    // Loop until the user chooses to exit
    while (true) {
      // Display the menu to the user
      System.out.println("Please type 1 for First Class");
      System.out.println("Please type 2 for Economy");

      // Read the user's choice
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();

      // Check if the user wants to book a seat in first class
      if (choice == 1) {
        // Check if there are any available seats in first class
        if (isSeatAvailable(seats, 0, 4)) {
          // Assign a seat in first class
          assignSeat(seats, 0, 4);
        } else {
          // Check if the user wants to be placed in economy class
          System.out.print("No seats available in first class. Would you like to be placed in economy class? (yes/no): ");
          String response = scanner.next();
          if (response.equalsIgnoreCase("yes")) {
            // Check if there are any available seats in economy class
            if (isSeatAvailable(seats, 5, 9)) {
              // Assign a seat in economy class
              assignSeat(seats, 5, 9);
            } else {
              System.out.println("Next flight leaves in 3 hours.");
            }
          } else {
            System.out.println("Next flight leaves in 3 hours.");
          }
        }
      } else if (choice == 2) {
        // Check if there are any available seats in economy class
        if (isSeatAvailable(seats, 5, 9)) {
          // Assign a seat in economy class
          assignSeat(seats, 5, 9);
        } else {
          // Check if the user wants to be placed in first class
          System.out.print("No seats available in economy class. Would you like to be placed in first class? (yes/no): ");
          String response = scanner.next();
          if (response.equalsIgnoreCase("yes")) {
            // Check if there are any available seats in first class
            if (isSeatAvailable(seats, 0, 4)) {
              // Assign a seat in first class
              assignSeat(seats, 0, 4);
            } else {
              System.out.println("Next flight leaves in 3 hours.");
            }
          } else {
            System.out.println("Next flight leaves in 3 hours.");
          }
        }
      } else {
        System.out.println("Invalid choice. Please try again.");
      }
    }
  }

  // Method to check if a seat is available
  public static boolean isSeatAvailable(boolean[] seats, int start, int end) {
    for (int i = start; i <= end; i++) {
      if (!seats[i]) {
        return true;
      }
    }
    return false;
  }

  // Method to assign a seat
  public static void assignSeat(boolean[] seats, int start, int end) {
    for (int i = start; i <= end; i++) {
      if (!seats[i]) {
        seats[i] = true;
        System.out.println("Seat assigned: " + (i + 1));
        if (i < 5) {
          System.out.println("Class: First Class");
        } else {
          System.out.println("Class: Economy");
        }
        return;
      }
    }
  }
}