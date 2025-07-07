// import java.util.Arrays;

// public class Try {
//     public static void main(String[] args) {
//         int[] numbers = {22, 11, 55, 33, 44, 66, 77, 88, 99};

//         // Print the original array
//         System.out.println("Original array:");
//         for (int number : numbers) {
//             System.out.printf("%d%n", number);
//         }

//         Arrays.sort(numbers);

//         // Print the sorted array
//         System.out.println("\nSorted array:");
//         for (int number : numbers) {
//             System.out.printf("%d%n", number);
//         }
//     }
// }

import java.util.Arrays;

public class Try {
    public static void main (String[] args){
        int[] numbers = {1, 2, 3, 5};
int[] newNumbers = new int[numbers.length + 1];
System.arraycopy(numbers, 0, newNumbers, 0, 3);
newNumbers[3] = 4;
System.out.println(Arrays.toString(newNumbers)); // [1, 2, 3, 4, 5]
    }
}