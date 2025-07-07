// Import the Random class to generate random numbers
import java.util.Random;

public class DiceRolling {
  public static void main(String[] args) {
    // Create an object of class Random to generate random numbers
    Random random = new Random();

    // Create a one-dimensional array to tally the number of times each possible sum appears
    int[] sums = new int[11]; // 11 possible sums from 2 to 12

    // Roll the dice 36,000,000 times
    for (int i = 0; i < 36000000; i++) {
      // Roll the first die
      int die1 = random.nextInt(6) + 1; // generate a random number between 1 and 6

      // Roll the second die
      int die2 = random.nextInt(6) + 1; // generate a random number between 1 and 6

      // Calculate the sum of the two values
      int sum = die1 + die2;

      // Increment the count for the sum in the array
      sums[sum - 2]++; // subtract 2 because array indices start at 0
    }

    // Display the results in tabular format
    System.out.println("Sum\tFrequency");
    for (int i = 0; i < sums.length; i++) {
      System.out.println((i + 2) + "\t" + sums[i]);
    }
  }
}

