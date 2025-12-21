public class ArrayOperations {
    public static void main(String[] args) {
        // Declare and initialize array
        int[] arr = {2, 3, 4, 5};

        int sum = 0;
        int product = 1;

        // Traverse array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];        // addition
            product *= arr[i];    // multiplication
        }

        // Print results
        System.out.println("Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nSum of array elements = " + sum);
        System.out.println("Product of array elements = " + product);
    }
}
