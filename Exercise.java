
//         int [] r = new int[10];

//         for (int counter = 0; counter < r.length; counter ++){
//             r[counter] = counter * 2;
//                     }
//         System.out.printf("10th element: %d%n",r[9]);
//         System.out.println("All the elements in the Array");

//         for (int element : r) {
//         System.out.print(element + " ");
//         }
// }
// }


// public class Exercise {
//     public static void main(String[] args) {
//         int [] g = new int[6];

//         for (int counter = 0; counter < g.length; counter ++){
//             g[counter] =  -1;
//                     }
//         System.out.printf("10th element: %d%n",g[1]);
//         System.out.println(Arrays.toString(g));
//     }
// }


// public class Exercise {
//     public static void main (String[] args) {
//         double [] c = new double[100];
//         for (int counter = 0; counter < c.length; counter ++){
//             c[counter] = Math.random() * 100;
//         }
//         double maximum = c[0];

//         for (int i = 1; i < c.length; i++){
//             if (c[i] > maximum) {
//                 maximum = c[i];

//             }
            
//         }
//         System.out.printf("%s%.2f"," Maximum of the first one-hundred elements of floating-point array: ", maximum);
//     }
// }

// public class Exercise {
//     public static void main(String[] args){
//         int[] a = new int[100];
//         for (int count = 0; count < a.length; count++){
//             a[count] = count + 1;
//         }

//         int[] b = new int[100];

//         for (int i = 0; i < a.length; i ++){
//             b[99 - i] = a[i];//copy a[i] to b[99-1]for reverse order
//         }
//         System.out.println("Array a (first:5) :" + Arrays.toString(Arrays.copyOf(a, 5)));
//         System.out.println("Array b (last:5) :" + Arrays.toString(Arrays.copyOf(b, 5)));
//     }
// }
// public class Exercise {
//     public static void main(String[] args) {
//         int[] w = new int[100];
//         for (int i = 0; i < w.length; i++) {
//             w[i] = i + 1;
//         }
//         long product  = 1;

//         for (int i = 2; i <=9; i++){
//             product *= w[i];
//         }
//         System.out.println("Product of w[2] to w[9]: " + product);
//     }
// }

// public class Exercise{
//     public static void main(String[] args) {

//         // Sample array declarations (adjust sizes as needed)
//         int[] counts = new int[21]; // Must have at least 21 elements for indices 0–20
//         int[] bonus = new int[20];  // Must have at least 20 elements
//         int[] bestScores = new int[10]; // Must have at least 10 elements

//         // a) Set elements of index 10–20 of counts to zero
//         for (int i = 10; i <= 20; i++) {
//             counts[i] = 0;
//         }

//         // b) Multiply each of the twenty elements of bonus by 2
//         for (int i = 0; i < 20; i ++){
//             bonus[i] *= 2;
//         }

//         // c) Display the ten values of bestScores, each on a new line

//         for (int i = 0; i < 10; i ++){
//             System.out.println(bestScores[i]);
//         }

        
//     }
// }
// public class Exercise {
//     public static int trying(int ... nunbers){
//         int total = 1;
//         for (int d: nunbers){
//             total *= d;
// }
// return total;
// }
// public static void main(String[] args) {

//     int d1 = 2;
//     int d2 = 2;
//     int d3 = 2;
//     int d4 = 2;
//     System.out.printf("%s%d%n","Total of array elements: ",  trying(d1,d2,d3,d4));
// }
// }


//import java.util.Scanner;

//6:15  command line arguments
// import java.util.Arrays;

// // Define a class 
// public class Exercise {
//   // Define the main method to process command-line arguments
//   public static void main(String[] args) {
//     // Check if there are command-line arguments being passed
//     if (args.length == 0) {
//       // If no arguments are passed, print an error message and exit
//       System.out.println("Error: no command-line arguments provided");
//       System.exit(1);
//     }

//     // Convert the command-line arguments to an array of integers
//     int[] numbers = new int[args.length];
//     for (int i = 0; i < args.length; i++) {
//       // Attempt to parse each argument as an integer
//       try {
//         numbers[i] = Integer.parseInt(args[i]);
//       } catch (NumberFormatException e) {
//         // If an argument cannot be parsed as an integer, print an error message and exit
//         System.out.println("Error: invalid command-line argument '" + args[i] + "'");
//         System.exit(1);
//       }
//     }

//     // Sort the array of numbers in ascending order
//     Arrays.sort(numbers);

//     // Compute the minimum and maximum values
//     int min = numbers[0];
//     int max = numbers[numbers.length - 1];

//     // Compute the average of the minimum and maximum values
//     double average = (min + max) / 2.0;

//     // Print the result
//     System.out.println("Average of minimum and maximum: " + average);
//   }
// }
  
// 6:17 Dice Rolling
// Import the Random class to generate random numbers
// import java.util.Random;

// // Define a class called DiceRolling
// public class Exercise {
//   // Define the main method to simulate the rolling of two dice
//   public static void main(String[] args) {
//     // Create a Random object to generate random numbers
//     Random random = new Random();

//     // Define a one-dimensional array to tally the number of times each possible sum appears
//     int[] frequency = new int[11]; // 11 elements: 2 to 12

//     // Roll the dice 36,000,000 times
//     for (int i = 0; i < 36000000; i++) {
//       // Roll the first die
//       int die1 = random.nextInt(6) + 1; // 1 to 6

//       // Roll the second die
//       int die2 = random.nextInt(6) + 1; // 1 to 6

//       // Calculate the sum of the two dice
//       int sum = die1 + die2;

//       // Increment the frequency count for the sum
//       frequency[sum - 2]++; // subtract 2 to index into the array
//     }

//     // Display the results in tabular format
//     System.out.println("Sum\tFrequency\tPercentage");
//     for (int i = 0; i < frequency.length; i++) {
//       int sum = i + 2; // add 2 to get the actual sum
//       double percentage = (double) frequency[i]/36000000 * 100;
//       System.out.printf("%d\t%d\t%.2f%%%n", sum,frequency[i],percentage);
//     }
//   }
// }


// 6:18 Game of Craps 
// Import the Random class to generate random numbers
// import java.util.Random;

// // Define a class called Craps
// public class Exercise {
//   // Define the main method to run 1,000,000 games of craps
//   public static void main(String[] args) {
//     // Create a Random object to generate random numbers
//     Random random = new Random();

//     // Initialize variables to keep track of game statistics
//     int[] wins = new int[21]; // 20 rolls + 1 for after 20 rolls
//     int[] losses = new int[21]; // 20 rolls + 1 for after 20 rolls
//     int totalGames = 1000000; // 1,000,000 games
//     int totalWins = 0; // total number of wins
//     int totalLosses = 0; // total number of losses
//     int totalRolls = 0; // total number of rolls

//     // Run 1,000,000 games of craps
//     for (int i = 0; i < totalGames; i++) {
//       // Initialize variables for the current game
//       int roll = 0; // current roll
//       int point = 0; // point established on the first roll
//       boolean gameWon = false; // whether the game is won

//       // Roll the dice until the game is won or lost
//       while (!gameWon) {
//         // Roll the dice
//         int dice1 = random.nextInt(6) + 1; // 1 to 6
//         int dice2 = random.nextInt(6) + 1; // 1 to 6
//         roll = dice1 + dice2; // calculate the roll

//         // Check if the game is won or lost on the first roll
//         if (roll == 7 || roll == 11) {
//           gameWon = true;
//           wins[0]++; // increment the win count for the first roll
//           totalWins++;
//         } else if (roll == 2 || roll == 3 || roll == 12) {
//           losses[0]++; // increment the loss count for the first roll
//           totalLosses++;
//         } else {
//           // Establish the point on the first roll
//           point = roll;
//           break; // exit the loop to continue the game
//         }
//       }

//       // Continue the game if the point is established
//       if (point != 0) {
//         // Roll the dice until the game is won or lost
//         while (true) {
//           // Roll the dice
//           int dice1 = random.nextInt(6) + 1; // 1 to 6
//           int dice2 = random.nextInt(6) + 1; // 1 to 6
//           roll = dice1 + dice2; // calculate the roll

//           // Check if the game is won or lost
//           if (roll == point) {
//             gameWon = true;
//             if (totalRolls < wins.length){
//               wins[totalRolls]++; // increent the win count for the current roll
//             }
//             totalWins++;
//           } else if (roll == 7) {
//             if (totalRolls < losses.length) {
//               losses[totalRolls]++;// increment the loss count for the current roll
//             }
//             totalLosses++;
//           }

//           // Increment the total rolls
//           totalRolls++;

//           // Exit the loop if the game is won or lost
//           if (gameWon || totalRolls >= wins.length) {
//             break;
//           }
//         }
//       }

//       // Increment the total rolls if the game is won or lost after 20 rolls
//       if (totalRolls >= 20) {
//         wins[20]++; // increment the win count for after 20 rolls
//         losses[20]++; // increment the loss count for after 20 rolls
//       }
//     }

//     // Calculate the chances of winning
//     double chancesOfWinning = (double) totalWins / totalGames * 100;

//     // Calculate the average length of a game
//     double averageLength = (double) totalRolls / totalGames;

//     // Print the results
//     System.out.println("Wins on each roll:");
//     for (int i = 0; i < wins.length; i++) {
//       System.out.println("Roll " + i + ": " + wins[i]);
//     }

//     System.out.println("Losses on each roll:");
//     for (int i = 0; i < losses.length; i++) {
//       System.out.println("Roll " + i + ": " + losses[i]);
//     }

//     System.out.println("Chances of winning: " + chancesOfWinning + "%");
//     System.out.println("Average length of a game: " + averageLength + " rolls");
//   }
// }

// 6:19 Airline Reservations System

// Import the Scanner class to read user input
// Import the Scanner class to read user input
// import java.util.Scanner;



import  java.util.Scanner;
public class Exercise {
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