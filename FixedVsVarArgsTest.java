public class FixedVsVarArgsTest {
    public static double 
    averageVarargs(double ... numbers){
        System.out.println("Varargs size: " + numbers.length);
        double total = 0.0;
        for (double d : numbers){
            total += d;
        }
        return total / numbers.length > 0 ? total / numbers.length : 0.0;
    }

    public static double averageFixed(double [] numbers) {
        if (numbers.length != 4) {
            throw new IllegalArgumentException("Array length have exactly 4 elements");
        }
        System.out.println("Fixed array size: " + numbers.length);
        double total = 0.0;
        for (double d : numbers){
            total += d;
        }
        return total / numbers.length ;
    }
    public static void main(String[] args) {
        System.out.println("Using varargs");
        System.out.printf("Average of 2 numbers:%.1f%n", averageVarargs(10.0, 20.0));
        System.out.printf("Average of 3 numbers:%.1f%n", averageVarargs(10.0, 20.0, 30.0));
        System.out.printf("Average of 0 numbers:%.1f%n", averageVarargs());


        System.out.println("\nUsing fixed-size array:");

        double[] fixedArray = new double[4];
        fixedArray[0] = 10.0;
        fixedArray[1] = 20.0;
        fixedArray[2] = 30.0;
        fixedArray[3] = 40.0;
        System.out.printf("Average of fixed array:%.1f%n", averageFixed(fixedArray));
    }
}
