
// i nitializing an array using command-line arguments

// public class InitArray{
//     public static void main(String[] args) {
//         // check number of command-line arguments
//         if (args.length != 3) {
//             System.out.printf(
//                 "Error:Please re-enter the entire command, including%n" + 
//                 "an array size, initial value and increment.%n");
//         }
//         else{
//             // get array size from first command-line argument
//             int arrayLength = Integer.parseInt(args[0]);
//             int[] array = new int[arrayLength];

//             //get initial value and increment from command-line arguments
//             int initialValue = Integer.parseInt(args[1]);
//             int increment = Integer.parseInt(args[2]);

//             // calculate value for each array element
//             for (int counter = 0; counter < array.length; counter ++){
//                 array[counter] = initialValue + increment * counter ;
//             }
//             System.out.printf("%-5s%10s%n", "Index", "Value");

            
//             // display array index and value
//             for  (int counter = 0; counter < array.length; counter ++){
//                 System.out.printf("%-5d%10d%n", counter, array[counter]);

//             }
//         }
//     }
// }

// Initializing the elements os an array to default values of zero

// public class InitArray{
//     public static void main(String[] args) {
//         // declare variable array and initialize it with an array object
//         int[] array = new int[10]; // create the array object
//         System.out.printf("%s%8s%n", "Index", "Value"); //column headings


//    output  each array element's value
//         for (int counter = 0; counter < array.length; counter ++){
//             System.out.printf("%5d%8d%n", counter, array[counter]);
//         }
//     }
// }




// Initializing the elements of an array with an array initializer.
// public class InitArray{
//     public static void main(String[] args) {
//         // initializer list specifies the initial value for each element.
//         int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

//         System.out.printf("%s%8s%n", "Index", "Value");// column headings

//         // output each array  element's value
//         for (int counter = 0; counter < array.length; counter++){
//             System.out.printf("%5d%8d%n", counter, array[counter]);
//         }
//     }
// }


// Calculating the values to be placed into the elements of an array.
// public class InitArray {
//     public static void main(String[] args) {
//         final int ARRAY_LENGTH = 10; // declare CONSTANT
//         int[] array = new int[ARRAY_LENGTH];// create array

//         // calculate value for each array element
//         for (int counter = 0; counter < array.length; counter++) {
//             array[counter] = 2 + 2 * counter;
//         }
//         System.out.printf("%s%8s%n", "Index", "Value"); // column headings

//         // output each array element's value
//         for (int counter = 0; counter < array.length; counter ++){
//             System.out.printf("%5d%8d%n", counter, array[counter]);
//         }
//     }
// }
// public class InitArray{
//     public static void main(String[] args) {
//     int[] array = {87,68,94,100,83,78,85,91,76,87};
//     int total = 0;

//     for(int counter = 0; counter < array.length; counter++){
//         total += array[counter];
//         }
//     System.out.printf("Total of array elements: %d%n", total);
//     }
// }
// import  java.util.Scanner;
// public class InitArray{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a number and get the multiplication table ");
//         int number = scanner.nextInt();
//         for (int x = 1; x <=10; x++){
//             int result = number * x;
//             System.out.println(number  + "X " + x +"= " + result);
//         } 
        
//     }
// }
// public class InitArray{
//     public static void main (String[] args){
//         int[] array = {}
//     }
// }

// initializing a two-dimensional array
public class InitArray {
    // create and output two-dimensional arrays
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1,2},{3}, {4,5,6}};
        
        System.out.println("Values in array1 by row are");
        outputArray(array1); // displays array1 by row
        System.out.printf("%nValues in array2 by row are%n");
        
        outputArray(array2); // displays array2 by row
    }
    // output rows and columns of a two-dimensional array
    public static void outputArray(int[][]array) {
        // loop through array's rows
        for (int row = 0; row < array.length; row++){
            // loop through columns of current row
            for (int column = 0; column < array[row].length; column++){
                System.out.printf("%d ", array[row][column]);
            }

            System.out.println();
        }
    }
}



// Initializing an array using command-line arguments.

